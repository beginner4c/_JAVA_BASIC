package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// line ������ I/O ���
// ���ڸ� �Է¹޴� ��� ���ϴ� Ÿ������ ��ȯ������ �ʱ� ������ ���ŷο� �� �ִ�

public class _05_Echo_Line {
	public static void main(String[] args) {
		String buffer;
		System.out.println("Type characters in a line and <Enter> key ");
		System.out.println("An empty line stops this program");
		
		// line ������ �ޱ� ���� BufferedReader ���, InputStreamReader�� �� ���ھ� �޾Ƴ�
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // decorator pattern
		
		while(true) { // �ݵ�� try catch�� �������� �Ѵ�
			try {
				buffer = in.readLine(); // ���ڿ� ������ �Է��� �޴´�
				
				if(buffer.length() == 0) // �� ������ �Է��ϸ� ����������
					break;
				
				System.out.println(buffer); // ���
			}catch(IOException ex){
				// error handling
			}
		}
		System.out.println("Bye !");
	}
}
