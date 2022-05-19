package _08_postEvaluator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _08_PostFix_Evaluator {
	
	// 한 줄 단위로 문자열을 돌려주는 함수
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
			
			// token을 받아와서 처리하는 부분
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
					if (operands.isEmpty()) { // 스택이 비어있어야 제대로 된 것이다
						System.out.println("= " + data);
					} else {
						System.err.println("incorrect expression");
					}
					operands.reset(); // 스택 초기화
					break; // 현재의 while 루프 빠져나감
				} else { // LineBuffer.ID_OPERAND
					operands.push(value);	
				}
			}
		}
	}
}
