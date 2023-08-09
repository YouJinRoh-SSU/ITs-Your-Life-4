package day_03;

public class StaticExam {
	int age = 0;
	
	public static void main(String[] args) {
		Math.random();//new로 접근 못함 
		//new StaticExam.age=100;
		//age=100;
	}

}
