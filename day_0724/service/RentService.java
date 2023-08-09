package day_0724.service;

import java.util.ArrayList;

/** 
  RentService내 멤버변수로  승용차, 승합차,트럭,버스의 부모타입을 저장하는 ArrayList cars
  RentService내 멤버변수로  개인회원, 법인회원의 부모타입을 저장하는 ArrayList mems
  RentService내 멤버변수로  대여를 저장하는 ArrayList rents*/

public class RentService {
	private ArrayList<Car> cars = new ArrayList<Car>();
	private ArrayList<Member> mems = new ArrayList<Member>();
	private ArrayList<Rent> rents = new ArrayList<Rent>();
	
	 private Rent[] rs = new Rent[100];
	    private int count = 0;
	   
	    public void add(Rent r1) {
	        rs[count++] = r1;
	    }
}
