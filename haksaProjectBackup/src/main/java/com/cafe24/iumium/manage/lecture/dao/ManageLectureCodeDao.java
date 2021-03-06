package com.cafe24.iumium.manage.lecture.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.iumium.manage.lecture.dto.AssignmentForEvaluateCode;
import com.cafe24.iumium.manage.lecture.dto.GradingCriteriaCode;
import com.cafe24.iumium.manage.lecture.dto.QuestionForEvaluateLectureCode;
import com.cafe24.iumium.manage.lecture.dto.SubjectCode;
import com.cafe24.iumium.manage.lecture.dto.TypeOfCompletionCode;

@Repository
public class ManageLectureCodeDao {
    private final String nameSpace = "com.cafe24.iumium.manage.lecture.dao.ManageLectureCodeMapper.";
    
	@Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    
    // 이수구분 코드 리스트 조회
    public List<TypeOfCompletionCode> selectManageLectureTocList() {
        return sqlSessionTemplate.selectList(nameSpace+"selectManageLectureTocList");
    }
    
    // 과목 코드 리스트 조회
    public List<SubjectCode> selectManageLectureSubjectList(){
    	return sqlSessionTemplate.selectList(nameSpace+"selectManageLectureSubjectList");
    }
    
    // 강의평가 항목 코드 리스트 조회
    public List<QuestionForEvaluateLectureCode> selectManageLectureQfelList(){
    	return sqlSessionTemplate.selectList(nameSpace+"selectManageLectureQfelList");
    }
    
    // 강의별 평가 항목 배정 코드 리스트 조회
    public List<AssignmentForEvaluateCode> selectManageLectureAfeList(){
    	return sqlSessionTemplate.selectList(nameSpace+"selectManageLectureAfeList");
    }
    
    // 성적평가 기준 코드 리스트 조회
    public List<GradingCriteriaCode> selectManageLectureGccList(){
    	return sqlSessionTemplate.selectList(nameSpace+"selectManageLectureGccList");
    }
}
