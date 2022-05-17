package basic;

public class _02_Automatic {
	
	// fibo 함수에 formal parameter가 높게 잡히면 잡힐 수록 계산 속도는 느려진다
	// recursive fucntion의 문제점인 time complexity가 발목을 잡기 때문
	// 기본적으로 recursive function의 계산 속도는 O(n x n) 이다
	// fibo 함수가 stack 영역에 반복적으로 호출되어 계산 후 사라진다
	
	static int fibo(int n) {
		if(n == 0)
			return 1;
		else if(n == 1)
			return 1;
		else if (n > 0)
			return fibo(n - 1) + fibo(n - 2);
		else {
			System.err.println("Unexpected minus argunment");
			System.exit(-1);
			return -1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("F(43) = " + fibo(43)); // 속도가 졸라리 느린 거 확인할 수 있다
	}
}
