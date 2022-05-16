package basic;

// fibonacci sequence 를 재귀로 처리
// C#에서는 아무것도 적지 않으면 member function을 일반적으로 Public 으로 취급

public class _01_Fibonacci {
	
	static int f(int n) {
		if(n == 0)
			return 1;
		if(n == 1)
			return 1;
		if(n>=2)
			return f(n-1)+f(n-2);
		
		return -1; // actual parameter 값이 음수인 경우
	}
	
	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			System.out.println("f(" + i + ") = " + f(i));
		}
	}
	
}
