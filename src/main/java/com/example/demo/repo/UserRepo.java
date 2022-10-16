package com.example.demo.repo;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ALE IS TER
 * 10/16/2022
 * 9:33 AM
 * Spring-Boot-Demo-Test
 * com.example.demo.repo
 * UserRepo
 */
public interface UserRepo extends JpaRepository<User,Integer> {
}
