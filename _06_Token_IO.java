package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// line 단위로 입력을 받아서 문자열로 받아 Tokenizer로 다 쪼갠 다음에 쪼개진 것을 정수, 실수 형태로 바꾸어 주는 거
// Tokenizer로 쪼개는 기준은 스페이스 바이다

public class _06_Token_IO {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		char c;
		int i;
		double f;
		String s;

		System.out.println("Type a char, an integer, a floating number and a string : ");

		String buffer = "";
		// 이전과 동일한 방법으로 line 단위로 입력 받는다
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			buffer = in.readLine();
		} catch (IOException ex) {
			// error handling
		}
		
		
		// Tokenizer를 이용하여 문자열을 쪼갠다
		StringTokenizer st = new StringTokenizer(buffer);
		String tmp;
		tmp = st.nextToken(); // 임시 문자열에 쪼갠 토큰을 받는다
		c = tmp.charAt(0); // char로 변환

		tmp = st.nextToken();
		i = Integer.parseInt(tmp); // 정수로 변환

		tmp = st.nextToken();
		f = Double.parseDouble(tmp); // 실수로 변환

		s = st.nextToken(); // 문자열

 		System.out.println("c = " + c);
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		System.out.println("s = " + s);
	}
}
