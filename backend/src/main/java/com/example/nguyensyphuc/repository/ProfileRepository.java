package com.example.nguyensyphuc.repository;

import com.example.nguyensyphuc.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
