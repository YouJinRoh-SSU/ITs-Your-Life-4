package com.itskb.ws04;

import java.util.ArrayList;
import java.util.Collections;

public class BankService {
	ArrayList<AccountDto> accountList = new ArrayList<AccountDto>();
	ArrayList<UserDto> userList = new ArrayList<UserDto>();
	
	public BankService() {
		accountList.add(new AccountDto(1, "123-456",200,3));
		accountList.add(new AccountDto(2, "789-123",10,1));
		accountList.add(new AccountDto(3, "456-789",5000,2));
		
		userList.add(new UserDto(1, "홍일동","111@gmail.com","111-222",true));
		userList.add(new UserDto(2, "김일동","222@gmail.com","222-333",false));
		userList.add(new UserDto(3, "박일동","333@gmail.com","333-444",true));
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
		Collections.sort(accountList, qc2);
		return accountList;
	}
	
	public ArrayList<UserDto> getUserDetail(){
		return userList;
	}
	public ArrayList<AccountDto> getAccountList(){
		return accountList;
	}
}
