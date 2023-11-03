package class07_ifelse_ladder_switch;

public class Quiz_36 {
	public static void main(String[] args) {
		String grade;
		grade="A";
		if(grade=="A+") {
			System.out.println("Grade point average is 4.00");
		}else if (grade=="A") {
			System.out.println("Grade point average is 3.75");
		}else if(grade=="A-") {
			System.out.println("Grade point average is 3.50");
		}else if (grade=="B") {
			System.out.println("Grade point average is 3.25");
		}else if(grade=="C") {
			System.out.println("Grade point average is 2.00");
		}else if (grade=="D") {
			System.out.println("Grade point average is 2.00");
		}else {
			System.out.println("fail");
		} 
	}
}
