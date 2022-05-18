package basic;

import java.io.IOException;
import java.io.InputStreamReader;

// character 단위의 I/O 방식

public class _04_Echo_Char {
	public static void main(String[] args) {
		System.out.println("Type characters and <Enter> key");
		
		InputStreamReader in = new InputStreamReader(System.in);
		
		while(true) {
			try {
				char ch = (char)in.read(); // 이 행위를 할 때 try, catch 문이 필수다, 없으면 error 발생
				if(ch == '\n')
					break;
				System.out.print(ch);
			}catch(IOException ex) {
				// error handling
			}
		}
		
		System.out.println();
	}
}
