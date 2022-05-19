package _08_postEvaluator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _08_PostFix_Evaluator {
	
	// �� �� ������ ���ڿ��� �����ִ� �Լ�
	static String getLine() {
		String buffer = "";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			buffer = in.readLine();
		} catch(IOException ex){
			// error handling
		}
		
		return buffer;
	}
	
	public static void main(String[] args) {
		System.out.println("Type Postfix Expression : (ex) 1 2 3 + + ");
		
		Stack operands = new Stack();
		
		while(true) {
			String aLine;
			
			aLine = getLine();
			
			LineBuffer buffer = new LineBuffer(aLine);
			
			// token�� �޾ƿͼ� ó���ϴ� �κ�
			while(true) {
				int value = 0;
				int tokenID = buffer.getNextToken();
				value = buffer.getTokenValue();
				if (tokenID == LineBuffer.ID_QUIT) { // "quit"
					System.exit(0);
				} else if (tokenID == LineBuffer.ID_PLUS) { // operator "+"
					int a = operands.pop();
					int b = operands.pop();
					operands.push(a+b);
				} else if (tokenID == LineBuffer.ID_MINUS) { // operator "-"
					int a = operands.pop();
					int b = operands.pop();
					operands.push(b-a);
				} else if (tokenID == LineBuffer.ID_MULTIPLY) { // operator "*"
					int a = operands.pop();
					int b = operands.pop();
					operands.push(a*b);
				} else if (tokenID == LineBuffer.ID_DIVIDE) { // operator "/"
					int a = operands.pop();
					int b = operands.pop();
					operands.push(b/a);
				} else if (tokenID == LineBuffer.ID_EOD) { // end of data
					int data = operands.pop();
					if (operands.isEmpty()) { // ������ ����־�� ����� �� ���̴�
						System.out.println("= " + data);
					} else {
						System.err.println("incorrect expression");
					}
					operands.reset(); // ���� �ʱ�ȭ
					break; // ������ while ���� ��������
				} else { // LineBuffer.ID_OPERAND
					operands.push(value);	
				}
			}
		}
	}
}
