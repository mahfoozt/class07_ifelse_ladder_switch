package Quiz_10;

public class Quiz30_character {

	public static void main(String[] args) {
//Write a code that solve this requirement:
//	If the character is a than print “a is vowel”
//	If the character is a than print “e is vowel”
//	If the character is a than print “i is vowel”
//	If the character is a than print “o is vowel”
//	If the character is a than print “u is vowel”
//	else print “char is not vowel”
//	For example:
//
//	Input	Result
//	e
//	e is vowel
		char vowel='e';
		switch(vowel) {
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'u':
			System.out.println("u is vowel");
			break;
		default:
			System.out.println("char is not vowel");
			break;
		
		}

	}

}
