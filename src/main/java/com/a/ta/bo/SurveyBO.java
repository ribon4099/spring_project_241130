package com.a.ta.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a.ta.mapper.SurveyMapper;

@Service
public class SurveyBO {

	@Autowired
	private SurveyMapper surveyMapper;
	
	public void addSurvey(String nickname, String gender, String bloodtype, String age, String job, String subject, String phoneNumber, String email) {
		surveyMapper.insertSurvey(nickname, gender, bloodtype, age, job, subject, phoneNumber, email);
	}

}
