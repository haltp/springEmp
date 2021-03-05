package com.yedam.board.service;

import java.util.List;

import com.yedam.emp.UserVO;

public interface UserService {
	// 입력
	public void insertUser(UserVO vo);
	
	//수정
	public int updateUser(UserVO vo);

	// 삭제
	public int deleteUser(UserVO vo);

	// 단건 조회
	public UserVO getUser(UserVO vo);

	// 전체 조회
	public List<UserVO> getSearchUser(UserVO vo);

}
