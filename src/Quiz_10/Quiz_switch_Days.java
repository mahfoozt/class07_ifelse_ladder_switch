package Quiz_10;

public class Quiz_switch_Days {

	public static void main(String[] args) {
//Write a program that solves this requirement :
//	Use SWITCH
//	If day value is 1 then print Monday
//	If day value is 2 then print Tuesday
//	If day value is 3 then print Wednesday
//	If day value is 4 then print Thursday
//	If day value is 5 then print Friday
//	If day value is 6 then print Saturday
//	If day value is 7 then print Sunday
//	else print Invalid Day in the console.
		  int day = 5;
			switch(day)  {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid Day");

			}System.out.println("Invalid Day");
	}

}
