package day_0725;

import java.util.HashMap;

public class MaoExam {
	public static void main(String[] args) {
		HashMap<String,Integer> hm =  new HashMap<String,Integer>();
		hm.put("홍",70);
		hm.put("김",80);
		hm.put("장",80);
		HashMap<String,Integer> scoremap =  new HashMap<String,Integer>();
		scoremap.put("수학", 90);
		scoremap.put("영어", 80);
		HashMap<String, HashMap<String, Integer>> mainMap = new HashMap<String, HashMap<String, Integer>>();
		mainMap.put("홍: ", scoremap);

	}

}
