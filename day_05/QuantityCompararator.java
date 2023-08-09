package day_05;

import java.util.Comparator;

public class QuantityCompararator implements Comparator<SaleDto> {//외부 정렬기 만들기
	public int compare(SaleDto o1, SaleDto o2) {
		
		return o1.getQuantity() - o2.getQuantity();
	}

}
