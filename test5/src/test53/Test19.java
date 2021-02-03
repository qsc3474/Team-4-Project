package test53;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test19 {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("src/output.txt");
			String s = "안녕하세요. output.txt 테스트입니다.";
			byte [] b = s.getBytes();
			os.write(b);
			
		} catch (Exception e) {
			
			e.getStackTrace();
		}
	
	}

}
