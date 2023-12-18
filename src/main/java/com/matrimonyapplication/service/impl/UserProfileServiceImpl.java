package com.matrimonyapplication.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matrimonyapplication.dto.UserProfileDTO;
import com.matrimonyapplication.service.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Override
	public UserProfileDTO createUserProfile(UserProfileDTO userProfileDTO) {
		// write your logic here
		return null;
	}

	@Override
	public UserProfileDTO getUserProfileById(Long id) {
		// write your logic here
		return null;
	}

	@Override
	public List<UserProfileDTO> getAllUserProfiles() {
		// write your logic here
		return null;
	}

	@Override
	public UserProfileDTO updateUserProfile(Long id, UserProfileDTO userProfileDTO) {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteUserProfile(Long id) {
		// write your logic here
		return false;
	}

	@Override
	public List<UserProfileDTO> searchProfilesBySex(String sex) {
		// write your logic here
		return null;
	}

	@Override
	public List<UserProfileDTO> searchProfilesByLikesContaining(String likesKeyword) {
		// write your logic here
		return null;
	}
}
