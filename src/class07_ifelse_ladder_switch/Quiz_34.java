package class07_ifelse_ladder_switch;

public class Quiz_34 {

	public static void main(String[] args) {
		int deposit;
		int years;
		deposit=1500;
		years=2;
		if(deposit<2000 && years>=2) {
			System.out.println("the interest rate is 5%");
		}else if(deposit>=2000 && deposit<6000 && years>=2) {
			System.out.println("the interest rate  is 7%");
		}else if (deposit>6000 && years>=1) {
			System.out.println("the interest rate  is 8%");
		}else {
			System.out.println("the interest rate  is 3%");
		}
		
	}

}
