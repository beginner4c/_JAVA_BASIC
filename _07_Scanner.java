package basic;

import java.util.Scanner;

// ������ ��Ĵ�� �Է¹��� �� �ִ� Scanner ���
// ��ȯ�� �ʿ䰡 ���� ���� ���������� ������ ����� �־�߸� ����� �����ϴ�

public class _07_Scanner {
	public static void main(String[] args) {
		char c;
		int i;
		double f;
		String s;
		
		System.out.println("Type a char, an integer, a floating number and a string : ");
		
		Scanner scanner = new Scanner(System.in);
		
		// �̸� �����س��� ������� ��ȯ�ع�����
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
