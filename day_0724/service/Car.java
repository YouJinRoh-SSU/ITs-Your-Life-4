package day_0724.service;

public class Car {
	private int num;//차번호
	private int price;//대여비
	private String var;//차 종류
	private int year;//연식
	private int si;//배기량
	private int per;//탑승인원수
	private int vol;//적재량 
	public Car(int num, int price, String var, int year, int si, int per, int vol) {
		super();
		this.num = num;
		this.price = price;
		this.var = var;//차종류
		this.year = year;
		this.si = si;
		this.per = per;
		this.vol = vol;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getVar() {
		return var;
	}
	public void setVar(String var) {
		this.var = var;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSi() {
		return si;
	}
	public void setSi(int si) {
		this.si = si;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	@Override
	public String toString() {
		return "Car [num=" + num + ", price=" + price + ", var=" + var + ", year=" + year + ", si=" + si + ", per="
				+ per + ", vol=" + vol + "]";
	}
	
	
}
