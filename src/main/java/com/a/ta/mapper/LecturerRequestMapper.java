package com.a.ta.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LecturerRequestMapper {

	// input: items
	// output: int or void
	public void insertLecturerRequest(
			@Param("nickname") String nickname,
			@Param("request") String request,
			@Param("phoneNumber") String phoneNumber,
			@Param("email") String email
			);
}
