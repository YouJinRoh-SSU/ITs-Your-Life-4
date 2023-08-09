package day_04;

public class SchoolService {
	private Person[] parr = new Person[100];
	private int pCount = 0; //실제 저장정보를 가진 

	
	public void add(Person p) {
		parr[pCount++] = p;
	}//schoolexam 에서 studeut, emp를 넣으면 자연스럽게 up-casting이 됨 

}
