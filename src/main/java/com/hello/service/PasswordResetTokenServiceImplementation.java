package com.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.model.PasswordResetToken;
import com.hello.repository.PasswordResetTokenRepository;
@Service
public class PasswordResetTokenServiceImplementation implements PasswordResetTokenService {
	@Autowired
	private PasswordResetTokenRepository passwordResetTokenRepository;

	@Override
	public PasswordResetToken findByToken(String token) {
		PasswordResetToken passwordResetToken =passwordResetTokenRepository.findByToken(token);
		return passwordResetToken;
	}

	@Override
	public void delete(PasswordResetToken resetToken) {
		passwordResetTokenRepository.delete(resetToken);
		
	}

}
