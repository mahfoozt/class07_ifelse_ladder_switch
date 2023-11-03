package Quiz_10;

public class Quiz31_Grade_Cgpa {

	public static void main(String[] args) {
//Write a code that solve this requirement:
//	If the grade is A+   than print “cgpa 4.00”
//	If the grade is A     than print “cgpa 3.75”
//	If the grade is A-    than print “cgpa 3.50”
//	If the grade is B     than print “cgpa 3.25”
//	If the grade is C     than print “cgpa 3.00”
//	If the grade is D     than print “cgpa 2.00”
//	If nothing of above  than print ”fail”
//	For example:
//	Input	Result
//	B		cgpa 3.25
		String score="B";
		switch(score){
		case "A+":
			System.out.println("cgpa 4.00");
			break;
		case "A":
			System.out.println("cgpa 3.75");
			break;
		case "A-":
			System.out.println("cgpa 3.50");
			break;
		case "B": 
			System.out.println("cgpa 3.25");
			break;
		case "C":
			System.out.println("cgpa 3.00");
			break;
		case "D":
			System.out.println("cgpa 2.00");
			break;
		default:
			System.out.println("fail");
			break;		
			
		}
	
	}

}
