package com.example.nguyensyphuc.controller;

import com.example.nguyensyphuc.model.Profile;
import com.example.nguyensyphuc.service.ProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final ProfileService profileService;

    public HomeController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/")
    public String home(Model model) {
        Profile profile = profileService.getProfile();
        model.addAttribute("name", profile.getName());
        model.addAttribute("nickname", profile.getNickname());
        model.addAttribute("age", profile.getAge());
        model.addAttribute("school", profile.getSchool());
        model.addAttribute("major", profile.getMajor());
        model.addAttribute("hobby", profile.getHobby());
        model.addAttribute("quote", profile.getQuote());
        return "index";
    }
}
