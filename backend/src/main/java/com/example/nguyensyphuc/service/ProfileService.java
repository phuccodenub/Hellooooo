package com.example.nguyensyphuc.service;

import com.example.nguyensyphuc.model.Profile;
import com.example.nguyensyphuc.repository.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public Profile getProfile() {
        return profileRepository.findAll().stream()
                .findFirst()
                .orElseGet(this::defaultProfile);
    }

    private Profile defaultProfile() {
        Profile profile = new Profile();
        profile.setName("Nguyễn Sỹ Phúc");
        profile.setNickname("Phúc");
        profile.setAge(21);
        profile.setSchool("Trường Đại Học Công Nghệ TP.HCM (HUTECH)");
        profile.setMajor("Cong nghe phan mem");
        profile.setHobby("Lap trinh, nghe nhac, da bong");
        profile.setQuote("Code moi ngay, tien bo moi ngay!");
        return profile;
    }
}
