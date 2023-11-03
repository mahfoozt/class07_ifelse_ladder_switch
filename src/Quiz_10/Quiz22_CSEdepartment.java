package Quiz_10;

public class Quiz22_CSEdepartment {

	public static void main(String[] args) {
		String Department = "CSE";
		int year =2;
		switch (year) {
		case 1:
			System.out.println("elective courses : Advance english, Algebra");
			break;
		case 2:
			switch(Department) {
			case "CSE":
			case"CCE":
				System.out.println("elective courses : Machine Learning, Big Data");
				break;
			case"ECE":
				System.out.println("elective courses : Antenna Engineering");
				break;
			default:
				System.out.println("elective courses : Optimization");	
							
			}
		
		}
	}

}
