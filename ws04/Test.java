package com.itskb.ws04;

public class Test {
public static void main(String[] args) {
        
        BankService bankService = new BankService();
        System.out.println(bankService.getAccountList());
        System.out.println(bankService.getAccountListSortByBalance());
        System.out.println(bankService.getAccountListSortByUserSeq());
    }
}
