package com.itskb.ws03.dto;

import java.util.Comparator;

public class QuantityCompararator implements Comparator<AccountDto> {//외부 정렬기 만들기
	public int compare(AccountDto o1, AccountDto o2) {
		
		return o1.getBalance() - o2.getBalance();
	}

}
