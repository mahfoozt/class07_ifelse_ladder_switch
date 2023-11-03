package Quiz_10;

public class Quiz24_num {

	public static void main(String[] args) {
		char operator;
		Double num1, num2,result;
		operator = '+';
		num1=3.5;
		num2=4.6;
		switch(operator) {
		case '+':
			result=num1+num2;
			System.out.println(num1 + "+" +num2+"=" +result);
			break;
		case '-':
			result=num1-num2;
			System.out.println(num1 + "-" +num2+"=" +result);
			break;
		case '*':
			result=num1*num2;
			System.out.println(num1 + "*" +num2+"=" +result);
			break;
		case '/':
			result=num1/num2;
			System.out.println(num1 + "/" +num2+"=" +result);
			break;
		default:
			System.out.println("invalid operator");
			break;
		}
		

	}

}
