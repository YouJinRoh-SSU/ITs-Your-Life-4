package day_04;

public class Emp extends Person{
	private String buseo;
		
	public Emp() {
	}//기본 생성자
	
	public Emp(String buseo){
		super();
		this.buseo = buseo;
	}//모든 매개변수를 받는 생성자 
	
	public Emp(String id, String name, String buseo) {
		super(id, name); 
		
		this.buseo = buseo;
	}

	public String getBuseo() {
		return buseo;
	}

	public void setBuseo(String buseo) {
		this.buseo = buseo;
	}

	@Override
	public String toString() {
		return super.toString() + " , buseo= "+ buseo;
	}

}
