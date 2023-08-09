package com.itskb.ws04;

import java.util.Comparator;
//잔고 기준 정렬기
public class QuantityCompararator implements Comparator<AccountDto> {//외부 정렬기 만들기
	public int compare(AccountDto o1, AccountDto o2) {
		
		return o1.getBalance() - o2.getBalance();
	}

}
