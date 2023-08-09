package day_05;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 도서판매점 관리 프로그램
도서관리, 회원관리, 판매관리를 할 수 있는 프로그램
도서 : BookDto{isbn, title, price}
회원 : MemberDto{mno, name, tel}
판매 : SaleDto{no, isbn, quantity}
BookstoreService {ArrayList<BookDto> bookList = new ArrayList<BookDto>();
ArrayList<MemberDto> memberList = new ArrayList<MemberDto>();
ArrayList<SaleDto> saleList = new ArrayList<SaleDto>();
BookDto[] ba = new BookDto[1000];
int bookCount = 0;}
add없이 
 */
public class BookstoreService {
	ArrayList<BookDto> bookList = new ArrayList<BookDto>();
	ArrayList<MemberDto> memberList = new ArrayList<MemberDto>();
	ArrayList<SaleDto> saleList = new ArrayList<SaleDto>();
	
	public BookstoreService() {
		bookList.add(new BookDto("123","자바기본",20000));
		bookList.add(new BookDto("100","자바응용",25000));
		bookList.add(new BookDto("200","자바코딩테스트",30000));
		
		memberList.add(new MemberDto(100, "홍길동", "111-222"));
		memberList.add(new MemberDto(200, "김길동", "222-333"));
		
		saleList.add(new SaleDto(100,"100",3));
		saleList.add(new SaleDto(100,"200",1));
		saleList.add(new SaleDto(200,"200",2));
	}
	//해당 회원 찾기 
	public MemberDto getMemberDetail(int mno) {
		for (MemberDto m : memberList) {
			if (mno == m.getMno())
				return m; //해당 찾으려는 회원 번호의 참조값 
		}
		return null;
	}
	
	/*특정 회원이 구매한 도서 목록 */
	public ArrayList<SaleDto> getSaleList(int memberno){//arraylist는 배열로 여러개 반환이 됨. 찾는 값이 있든 없든 무조건 반환(0, 1, 2, ...)
		ArrayList<SaleDto> result = new ArrayList<SaleDto>();
		for (SaleDto s : saleList) {
			if (memberno == s.getNo()) {
				result.add(s);//도서 목록 뽑기
			}
		}
		return result;
	}
	public ArrayList<SaleDto> getSaleList() {
		return saleList;
	}
	public ArrayList<BookDto> getBookList() {
		return bookList;
	}
	public ArrayList<MemberDto> getMemberList() {
		return memberList;
	}
	public ArrayList<SaleDto> getSaleListSortByQuantity() {
		//외부 정렬기 사용
		QuantityCompararator qc = new QuantityCompararator();
		
		Collections.sort(saleList, qc);
		return saleList;
	}
	
}
