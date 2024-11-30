package com.a.ta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.a.ta.bo.LecturerRequestBO;
import com.a.ta.bo.SurveyBO;

@RequestMapping("/ta")
@Controller
public class TaController {
	
	@Autowired
	private SurveyBO surveyBO;
	
	@Autowired
	private LecturerRequestBO lecturerRequestBO; 

	// http://localhost:8080/ta/main
	@GetMapping("/main")
	public String main() {
		return "ta/main";
	}
	
	// http://localhost:8080/ta/show-introduction-view
	// 학원소개 버튼 누를 때 학원 소개하기 화면
	@GetMapping("/show-introduction-view")
	public String makeIntroductionView() {
		return "ta/showIntroduction";
	}
	
	// http://localhost:8080/ta/show-lecturer-view
	// 강사소개 버튼 누를 때 강사 소개하기 화면
	@GetMapping("/show-lecturer-view")
	public String showLecturerView() {
		return "ta/showLecturer";
	}
	
	// http://localhost:8080/ta/show-socialservice-view
	// 사회공헌 버튼 누를 때 사회공헌 화면
	@GetMapping("/show-socialservice-view")
	public String showSocialserviceView() {
		return "ta/showSocialservice";
	}
	
	// http://localhost:8080/ta/show-recruit-view
	// 학원소개 버튼 누를 때 학원 소개하기 화면
	@GetMapping("/show-recruit-view")
	public String showRecruitView() {
		return "ta/showRecruit";
	}	
	
	// http://localhost:8080/ta/show-franchise-view
	// 프랜차이즈 버튼 누를 때 프랜차이즈 소개하기 화면
	@GetMapping("/show-franchise-view")
	public String showFranchiseView() {
		return "ta/showFranchise";
	}
	
	// http://localhost:8080/ta/show-customerservice-view
		// 고객센터 버튼 누를 때 고객센처 화면
	@GetMapping("/show-customerservice-view")
	public String showCustomerserviceView() {
		return "ta/showCustomerservice";
	}
	
	// http://localhost:8080/ta/show-curriculum-view
	// 과정소개 버튼 누를 때 화면
	@GetMapping("/show-curriculum-view")
	public String showCurriculumView() {
		return "ta/showCurriculum";
	}
	
	// http://localhost:8080/ta/show-basicEnglish-view
	// 기초영어 버튼 누를 때 고객센처 화면
	@GetMapping("/show-basicEnglish-view")
	public String showBasicEnglishView() {
		return "ta/showBasicEnglish";
	}
	
	// http://localhost:8080/ta/show-middleEnglish1-view
	// 중등영어1 버튼 누를 때 고객센처 화면
	@GetMapping("/show-middleEnglish1-view")
	public String showMiddleEnglish1View() {
		return "ta/showMiddleEnglish1";
	}
	
	// http://localhost:8080/ta/show-middleEnglish2-view
	// 중등영어2 버튼 누를 때 고객센처 화면
	@GetMapping("/show-middleEnglish2-view")
	public String showMiddleEnglish2View() {
		return "ta/showMiddleEnglish2";
	}
	
	// http://localhost:8080/ta/show-highEnglish1-view
	// 고등영어1 버튼 누를 때 고객센처 화면
	@GetMapping("/show-highEnglish1-view")
	public String showHighEnglish1View() {
		return "ta/showHighEnglish1";
	}
	
	// http://localhost:8080/ta/show-highEnglish2-view
	// 고등영어2 버튼 누를 때 고객센처 화면
	@GetMapping("/show-highEnglish2-view")
	public String showHighEnglish2View() {
		return "ta/showHighEnglish2";
	}	
	
	// http://localhost:8080/ta/show-basicMath-view
	// 기초영어 버튼 누를 때 고객센처 화면
	@GetMapping("/show-basicMath-view")
	public String showBasicMathView() {
		return "ta/showBasicMath";
	}
	
	// http://localhost:8080/ta/show-middleMath1-view
	// 중등수학1 버튼 누를 때 고객센처 화면
	@GetMapping("/show-middleMath1-view")
	public String showMiddleMath1View() {
		return "ta/showMiddleMath1";
	}
		
	// http://localhost:8080/ta/show-middleMath2-view
	// 중등수학2 버튼 누를 때 고객센처 화면
	@GetMapping("/show-middleMath2-view")
	public String showMiddleMath2View() {
		return "ta/showMiddleMath2";
	}
	
	// http://localhost:8080/ta/show-middleMath3-view
	// 중등수학3 버튼 누를 때 고객센처 화면
	@GetMapping("/show-middleMath3-view")
	public String showMiddleMath3View() {
		return "ta/showMiddleMath3";
	}
	
	// http://localhost:8080/ta/show-prehighMath-view
	// 고등선행수학객센터 버튼 누를 때 고객센처 화면
	@GetMapping("/show-prehighMath-view")
	public String showPrehighMathView() {
		return "ta/showPrehighMath";
	}
	
	
	@PostMapping("/show-survey-view")
	public String showSurveyView() {
		return "ta/showSurvey";
	}
	
	// DB에 저장 => 입력 성공 페이지 이동
	@PostMapping("/add-survey")
	public String addSurvey(
			@RequestParam("nickname") String nickname,
			@RequestParam("gender") String gender,
			@RequestParam("bloodtype") String bloodtype,
			@RequestParam("age") String age,
			@RequestParam("job") String job,
			@RequestParam("subject") String subject,
			@RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("email") String email) {
		
		// db insert
		surveyBO.addSurvey(nickname, gender, bloodtype, age, job, subject, phoneNumber, email);
		
		// 결과 화면 이동
		return "ta/showSuccessSurvey";
	}
	
	    // 강사님께 한마디 버튼 누를 때 화면
		@PostMapping("/show-memorequest-view")
		public String showMemorequestView() {
			return "ta/showMemorequest";
		}
		
		// DB에 저장 => 입력 성공 페이지 이동
		@PostMapping("/add-lecturer-request")
		public String addLecturerRequest(
				@RequestParam("nickname") String nickname,
				@RequestParam("request") String request,
				@RequestParam("phoneNumber") String phoneNumber,
				@RequestParam("email") String email) {
			
			// db insert
			lecturerRequestBO.addLecturerRequest(nickname, request, phoneNumber, email);
			
			// 결과 화면 이동
			return "ta/showSuccessMemoRequest";
		}
}
