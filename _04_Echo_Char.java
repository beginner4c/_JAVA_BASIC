package basic;

import java.io.IOException;
import java.io.InputStreamReader;

// character ������ I/O ���

public class _04_Echo_Char {
	public static void main(String[] args) {
		System.out.println("Type characters and <Enter> key");
		
		InputStreamReader in = new InputStreamReader(System.in);
		
		while(true) {
			try {
				char ch = (char)in.read(); // �� ������ �� �� try, catch ���� �ʼ���, ������ error �߻�
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
