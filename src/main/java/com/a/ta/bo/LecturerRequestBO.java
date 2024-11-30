package com.a.ta.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a.ta.mapper.LecturerRequestMapper;

@Service
public class LecturerRequestBO {
	
	@Autowired
	private LecturerRequestMapper lecturerRequestMapper;
	
	public void addLecturerRequest(String nickname, String request, String phoneNumber, String email) {
		lecturerRequestMapper.insertLecturerRequest(nickname, request, phoneNumber, email);
	}

}
