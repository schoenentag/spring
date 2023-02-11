package com.khe.prj.member.mapper;

import java.util.List;

import com.khe.prj.member.service.MemberVO;

public interface MemberMapper {
	
	List<MemberVO> memberListAll(); //전체 조회
	MemberVO memberListOne(MemberVO vo); //단건 조회
	
	int signUp(MemberVO vo); // 회원가입
	int memberUpdate(MemberVO vo); //회원수정
	int memberAuthUpdate(MemberVO vo); //회원권한수정
	
	List<MemberVO> ajaxMemberSearch(MemberVO vo); //회원 검색

}
