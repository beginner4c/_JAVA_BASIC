package basic;

class Stack{
	Stack(){ // default constructor
		this(MAX); // 아래의 constructor 호출
	}
	Stack(int n){ // constructor
		_top = -1;
		_size = n;
		_s = new int[n];
	}
	
	// member function
	int _s[];
	int _top;
	int _size;
	static int MAX = 100;
	
	// 1. specification을 확정함
	//  - 컴파일 가능
	//  - 사용법을 정의
	// 2. implementation을 수행함
	
	void push(int item) {
		_top++;
		_s[_top] = item;
	}
	
	int pop() {
		_top--;
		return _s[_top+1];
	}
	
	int peek() {
		return _s[_top];
	}
	
	int size() {
		return _top+1;
	}

	void reset() {
		_top = -1;
	}
	
	boolean empty() {
		if(_top == -1)
			return true;
		else
			return false;
	}
}

public class _03_Stack {
	public static void main(String[] args) {
		Stack a = new Stack();
		Stack b = new Stack(5);
		
		a.push(10);
		a.push(20);
		
		int x = a.pop();
		
		a.push(30);
		a.push(40);
		
		b.push(100);
		b.push(200);
		b.push(300);
		b.push(400);
		
		int y = b.pop();
		
		System.out.println("x = " + x); // 20
		System.out.println("y = " + y); // 400
		
		System.out.println("top of stack a = " + a.peek()); // 40
		System.out.println("top of stack b = " + b.peek()); // 300
		
		System.out.println("size of a = " + a.size()); // 3
		a.reset();
		System.out.println("size of a = " + a.size()); // 0
	}
}
