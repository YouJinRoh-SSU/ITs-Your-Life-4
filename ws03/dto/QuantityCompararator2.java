package com.itskb.ws03.dto;

import java.util.Comparator;

public class QuantityCompararator2 implements Comparator<UserDto> {//외부 정렬기 만들기
	public int compare(UserDto o1, UserDto o2) {
		
		return o1.getUserSeq() - o2.getUserSeq();
	}

}