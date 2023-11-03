package Quiz_10;

public class Quiz_21 {

	public static void main(String[] args) {
		int num = 90000;
		if (num >= 0) {
			if (num < 10) {
				System.out.println("it’s a one digit number is " + num);
			} else if (num < 100) {
				System.out.println("it’s a two digit number is " + num);
			} else if (num < 1000) {
				System.out.println("it’s a three digit number is " + num);
			} else if (num < 10000) {
				System.out.println("it's a four digit number is " + num);
			} else if (num < 1000000) {
				System.out.println("it's a five digit number is " + num);
			} else {
				System.out.println("invalid");
			}
		} else {
			System.out.println("invalid");
		}
	}
}
