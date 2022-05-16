package basic;

// fibonacci sequence �� ��ͷ� ó��
// C#������ �ƹ��͵� ���� ������ member function�� �Ϲ������� Public ���� ���

public class _01_Fibonacci {
	
	static int f(int n) {
		if(n == 0)
			return 1;
		if(n == 1)
			return 1;
		if(n>=2)
			return f(n-1)+f(n-2);
		
		return -1; // actual parameter ���� ������ ���
	}
	
	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			System.out.println("f(" + i + ") = " + f(i));
		}
	}
	
}
