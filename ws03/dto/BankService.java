package com.itskb.ws03.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.itskb.ws03.dto.QuantityCompararator;
import com.itskb.ws03.dto.QuantityCompararator2;

public class BankService {
	ArrayList<AccountDto> accountList = new ArrayList<AccountDto>();
	ArrayList<UserDto> userList = new ArrayList<UserDto>();
	
	public BankService() {
		accountList.add(new AccountDto());
		
		userList.add(new UserDto());
	}
	
	//모든 계좌번호 목록 리턴
	public ArrayList<AccountDto> getAccountList(int userSeq){
		return accountList;
	}
	
	//잔고를 기준으로 정렬한 계좌번호 목록 리턴
	public ArrayList<AccountDto> getAccountListSortByBalance(){
		//외부 정렬기 사용
		QuantityCompararator qc = new QuantityCompararator();
		Collections.sort(accountList, qc);
		return accountList;
	}
	
	//사용자 일련번호 기준으로 정렬한 모든 계좌 목록을 리턴
	public ArrayList<AccountDto> getAccountListSortByUserSeq(){
		QuantityCompararator2 qc2 = new QuantityCompararator2();
		Collections.sort(userList, qc2);
		return accountList;
	}
	
	public ArrayList<UserDto> getUserDetail(){
		return userList;
	}
	public ArrayList<AccountDto> getAccountList(){
		return accountList;
	}
}
