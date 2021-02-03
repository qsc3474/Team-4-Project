package test53;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filelnput {

	public static void main(String[] args) {
		FileInputStream inputStream = null;
		
		try {
			inputStream = new FileInputStream("src/test2.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(inputStream);
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		

	}

}
