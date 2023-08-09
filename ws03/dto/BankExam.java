package com.itskb.ws03.dto;

public class BankExam {
	public static void main(String[] args) {
		UserDto[] users = new UserDto[3];
		users[0] = new UserDto(1,"홍길동", "123@gmail.com", "111-222",true);
		System.out.println(users[0].toString());
		
		AccountDto[] acc = new AccountDto[3];
		acc[0] = new AccountDto(1,"1234-5678",3,1);
		System.out.println(acc[0].toString());
	}
}
