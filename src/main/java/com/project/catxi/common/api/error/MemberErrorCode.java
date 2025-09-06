package com.project.catxi.common.api.error;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MemberErrorCode implements ErrorCode{
	DUPLICATE_STUDENT_NO(HttpStatus.BAD_REQUEST, "MEMBER400", "이미 가입된 학번입니다"),
	INVALID_NICKNAME_LENGTH(HttpStatus.BAD_REQUEST, "MEMBER401", "닉네임은 9자 이하로 입력해주세요"),
	DUPLICATE_NICKNAME(HttpStatus.BAD_REQUEST, "MEMBER402", "이미 사용중인 닉네임입니다"),
	MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, "MEMBER403", "멤버를 찾을 수 없습니다."),
	INVALID_STUDENT_NO(HttpStatus.BAD_REQUEST, "MEMBER404", "학번은 9자리 숫자로 입력해주세요"),

	INVALID_TOKEN(HttpStatus.UNAUTHORIZED,"ACCESS400","유효하지 않은 토큰입니다"),
	ACCESS_EXPIRED(HttpStatus.BAD_REQUEST,"ACCESS401","액세스 토큰이 만료되었습니다"),
	DUPLICATE_AUTHORIZE_CODE(HttpStatus.BAD_REQUEST,"ACCESS402","인가 코드 중복 사용"),
	ACCESS_FORBIDDEN(HttpStatus.FORBIDDEN,"ACCESS403","탈퇴한 회원입니다."),

	REFRESH_TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED, "ACCESS404", "리프레시 토큰이 만료되었습니다."),
	REFRESH_TOKEN_NOT_FOUND(HttpStatus.UNAUTHORIZED, "ACCESS405", "리프레시 토큰이 존재하지 않습니다."),
	REFRESH_TOKEN_MISMATCH(HttpStatus.UNAUTHORIZED, "ACCESS406", "리프레시 토큰이 일치하지 않습니다."),
	TOKEN_SIGNATURE_INVALID(HttpStatus.UNAUTHORIZED, "ACCESS407", "토큰 서명이 올바르지 않습니다."),
	TOKEN_BLACKLISTED(HttpStatus.UNAUTHORIZED, "ACCESS408", "블랙리스트에 등록된 토큰입니다."),
	USER_BLACKLISTED(HttpStatus.FORBIDDEN, "ACCESS409", "블랙리스트에 등록된 사용자입니다."),
	TOKEN_CLAIM_INVALID(HttpStatus.UNAUTHORIZED, "ACCESS410", "토큰 클레임 정보가 유효하지 않습니다."),

  MATCH_NOT_FOUND(HttpStatus.NOT_FOUND,"MATCH404","이용내역을 찾을 수 없습니다.");

	private final HttpStatus httpStatus;
	private final String code;
	private final String message;


}
