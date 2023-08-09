package day_0726;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExam {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		readFile();
		
	}

	private static void readFile() throws FileNotFoundException, IOException {
		FileReader fr=null;
		try {
			fr=null;
			fr = new FileReader("poem.txt");
			int c;
			while((c = fr.read())!= -1) {
				System.out.println((char)c);
			}
			System.out.println();
			System.out.println("파일읽기 종료");
		}finally {
			if(fr !=null) fr.close();
		}
	}

}
