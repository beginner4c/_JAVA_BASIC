package basic;

public class _02_Automatic {
	
	// fibo �Լ��� formal parameter�� ���� ������ ���� ���� ��� �ӵ��� ��������
	// recursive fucntion�� �������� time complexity�� �߸��� ��� ����
	// �⺻������ recursive function�� ��� �ӵ��� O(n x n) �̴�
	// fibo �Լ��� stack ������ �ݺ������� ȣ��Ǿ� ��� �� �������
	
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
		System.out.println("F(43) = " + fibo(43)); // �ӵ��� ���� ���� �� Ȯ���� �� �ִ�
	}
}
