package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// line 단위의 I/O 방식
// 숫자를 입력받는 경우 원하는 타입으로 변환해주지 않기 때문에 번거로울 수 있다

public class _05_Echo_Line {
	public static void main(String[] args) {
		String buffer;
		System.out.println("Type characters in a line and <Enter> key ");
		System.out.println("An empty line stops this program");
		
		// line 단위로 받기 위해 BufferedReader 사용, InputStreamReader로 한 글자씩 받아냄
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // decorator pattern
		
		while(true) { // 반드시 try catch를 사용해줘야 한다
			try {
				buffer = in.readLine(); // 문자열 단위로 입력을 받는다
				
				if(buffer.length() == 0) // 빈 라인을 입력하면 빠져나간다
					break;
				
				System.out.println(buffer); // 출력
			}catch(IOException ex){
				// error handling
			}
		}
		System.out.println("Bye !");
	}
}
