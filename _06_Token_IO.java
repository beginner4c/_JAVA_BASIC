package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// line ������ �Է��� �޾Ƽ� ���ڿ��� �޾� Tokenizer�� �� �ɰ� ������ �ɰ��� ���� ����, �Ǽ� ���·� �ٲپ� �ִ� ��
// Tokenizer�� �ɰ��� ������ �����̽� ���̴�

public class _06_Token_IO {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		char c;
		int i;
		double f;
		String s;

		System.out.println("Type a char, an integer, a floating number and a string : ");

		String buffer = "";
		// ������ ������ ������� line ������ �Է� �޴´�
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			buffer = in.readLine();
		} catch (IOException ex) {
			// error handling
		}
		
		
		// Tokenizer�� �̿��Ͽ� ���ڿ��� �ɰ���
		StringTokenizer st = new StringTokenizer(buffer);
		String tmp;
		tmp = st.nextToken(); // �ӽ� ���ڿ��� �ɰ� ��ū�� �޴´�
		c = tmp.charAt(0); // char�� ��ȯ

		tmp = st.nextToken();
		i = Integer.parseInt(tmp); // ������ ��ȯ

		tmp = st.nextToken();
		f = Double.parseDouble(tmp); // �Ǽ��� ��ȯ

		s = st.nextToken(); // ���ڿ�

 		System.out.println("c = " + c);
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		System.out.println("s = " + s);
	}
}
