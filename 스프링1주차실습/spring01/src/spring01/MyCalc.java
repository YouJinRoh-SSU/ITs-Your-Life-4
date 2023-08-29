package spring01;

public class MyCalc {

	private MyLog log = null;
	
	public MyCalc() {
	}
	public MyCalc(MyLog log) {
		this.log = log;
	}
	//setter
	public void setLog(MyLog log) {
		this.log = log;
	}	
	
	public int plus(int i, int j) {
		log.log(i+"+"+j+"="+(i+j));
		return i + j;
	}

}
