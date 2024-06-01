package com.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hello.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
