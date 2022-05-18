package basic;

import java.util.Scanner;

// 정해진 양식대로 입력받을 수 있는 Scanner 사용
// 변환할 필요가 없는 것이 장점이지만 정해진 양식이 있어야만 사용이 가능하다

public class _07_Scanner {
	public static void main(String[] args) {
		char c;
		int i;
		double f;
		String s;
		
		System.out.println("Type a char, an integer, a floating number and a string : ");
		
		Scanner scanner = new Scanner(System.in);
		
		// 미리 지정해놓은 방식으로 변환해버린다
		s = scanner.next();
		c = s.charAt(0);
		
		i = scanner.nextInt();
		
		f = scanner.nextDouble();
		
		s = scanner.next();
		
		System.out.println("c = " + c);
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		System.out.println("s = " + s);
	}
}
