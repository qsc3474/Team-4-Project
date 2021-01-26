package MaechulGwanli;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DB {

	public void DataIO() { 
		/* FileReader */ // 파일리더
		/* FileInputStream과 사용하는 방법이 거의 동일하다.
		 * 단, byte 단위가 아닌 character 단위로 읽어들이는 부분이 차이점이다.
		 * 따라서 2바이트이던 3바이트이던 글자 단위로 읽어오기 때문에 한글을 정상적으로 읽어올 수 있다.
		 */
		
		/* testReader.txt 파일을 읽을 수 있는 인스턴스 생성 */		
		FileReader fr = null;
		
		try {
			fr = new FileReader("src/MaechulGwanli/DB.txt");
			
			/* 여기는 한글로 작성을 해도 읽어올 수 있다. */
//			int value;
//			while((value= fr.read()) != -1) {	// 바이트 단위
//				System.out.print((char)value);
//			}
			
			char[] carr = new char[(int) new File("src/MaechulGwanli/DB.txt").length()];
			fr.read(carr);
			
			for(int i = 0; i < carr.length; i++) {	// 배열단위
				System.out.print(carr[i]);
			}
			
			
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		} finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
}
