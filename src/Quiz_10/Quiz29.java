package Quiz_10;

public class Quiz29 {

	public static void main(String[] args) {
//Write  a switch code that follow the requirements:
//	If the number is 30 then print “small  number”
//	If the number is 60 then print “medium number”
//	If the number is 90 then print “large   number”
//	If the number is 120 then print “extra  number”
//	If  any other number then print “don’t know”
//	For example:
//	Input	Result
//	20      don't know
		int num=20;
		switch(num) {
		case 30:
			System.out.println("small number");
			break;
		case 60:
			System.out.println("medium number number");
			break;
		case 90:
			System.out.println("large number");
			break;
		case 120:
			System.out.println("extra number");
			break;
		default:
			System.out.println("don't know");
			break;
			
		
		}


	}

}
