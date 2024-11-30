package com.a.ta.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SurveyMapper {

	// input: name, url
	// output: int or void
		public void insertSurvey(
				@Param("nickname") String nickname,
				@Param("gender") String gender,
				@Param("bloodtype") String bloodtype,
				@Param("age") String age,
				@Param("job") String job,
				@Param("subject") String subject,
				@Param("phoneNumber") String phoneNumber,
				@Param("email") String email
				);
}
