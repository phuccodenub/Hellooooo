package com.example.nguyensyphuc.dto;

import com.example.nguyensyphuc.model.Profile;

public record ProfileResponse(
        String name,
        String nickname,
        Integer age,
        String school,
        String major,
        String hobby,
        String quote
) {
    public static ProfileResponse fromEntity(Profile profile) {
        return new ProfileResponse(
                profile.getName(),
                profile.getNickname(),
                profile.getAge(),
                profile.getSchool(),
                profile.getMajor(),
                profile.getHobby(),
                profile.getQuote()
        );
    }
}
