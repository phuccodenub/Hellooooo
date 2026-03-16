package com.example.nguyensyphuc.controller;

import com.example.nguyensyphuc.dto.ProfileResponse;
import com.example.nguyensyphuc.service.ProfileService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profile")
@CrossOrigin(origins = "${app.cors.allowed-origin:http://localhost:3000}")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    public ProfileResponse getProfile() {
        return ProfileResponse.fromEntity(profileService.getProfile());
    }
}
