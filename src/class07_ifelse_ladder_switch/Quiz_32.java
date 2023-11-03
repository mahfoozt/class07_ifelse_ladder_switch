package class07_ifelse_ladder_switch;

public class Quiz_32 {
	public static void main(String[] args) {
		double time;
		time = 3.00;
		String amOrpm;
		amOrpm = "pm";

		if (time >= 8.00 && time <= 11.59 && amOrpm == "am") {
			System.out.println("Morning session " + String.format("%.2f", time) + amOrpm);
		} else if (time >= 2.00 && time <= 6.00 && amOrpm == "pm") {
			System.out.println("Afternoon session is " + String.format("%.2f", time) + amOrpm);
		} else if (time >= 6.00 && time <= 11.00 && amOrpm == "pm") {
			System.out.println("night sesson is " + String.format("%.2f", time) + amOrpm);
		} else {
			System.out.println("Overtime");
		}
	}

}
