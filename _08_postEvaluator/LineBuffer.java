package _08_postEvaluator;

// Postfix 계산기에서 사용할 것들을 정의해놓은 클래스

class LineBuffer 
{
	// data member
	static int ID_QUIT = 1;
	static int ID_PLUS = 2;
	static int ID_MINUS = 3;
	static int ID_MULTIPLY = 4;
	static int ID_DIVIDE = 5;
	static int ID_EOD = 6;
	static int ID_OPERAND = 7;

	static int BUFSIZ = 256;

	private int _position; // 배열의 인덱스 지정용
	private char _text[]; // 생성자에서 문자열을 받을 문자 배열
	private int _tokenValue;
	
	// constructor
	LineBuffer(String text) {
		_text = new char[BUFSIZ];

		// copy string to char array like strcpy() in C language
		for(int i = 0; i < text.length(); i++) {
			_text[i] = text.charAt(i);
		}
		_text[text.length()] = '\0';

		_position = 0;
		_tokenValue = 0;
	}
	int getTokenValue() {
		return _tokenValue;
	}
	int getNextToken() { // 문자에 뭐가 있는지 확인해서 값을 return 할 함수
		// skip blanks
		while (_text[_position] == ' ')
			_position++;

		// 문자가 끝난 경우
		if (_text[_position] == '\0')
			return ID_EOD;
		
		// operator인 경우
		if (_text[_position] == '+') {
			_position++;
			return ID_PLUS;
		}
		if (_text[_position] == '*') {
			_position++;
			return ID_MULTIPLY;
		}
		if (_text[_position] == '/') {
			_position++;
			return ID_DIVIDE;
		}
		if ((_text[_position] == '-' && _text[_position+1] == ' ') || // -가 음수를 의미할 수 있기 때문에
			(_text[_position] == '-' && _text[_position+1] == '\0'))
		{
			_position++;
			return ID_MINUS;
		}
		String buffer = "";
		int i = 0;
		
		// 음수를 의미하는 경우
		if (_text[_position] == '-') {
			buffer = buffer + "-";
			i++;
			_position++;
		}
		// operand인 경우
		while(_text[_position] >= '0' && _text[_position] <= '9') {
			buffer = buffer + _text[_position];
			i++;
			_position++;
		}

		_tokenValue = Integer.parseInt(buffer); // 현재 토큰 값 리턴
		
		// 문자열의 끝이 공백이나 null이 아닌 경우
		if (_text[_position] != ' ' && _text[_position] != '\0')
			return ID_QUIT;
		
		return ID_OPERAND;
	}
}
