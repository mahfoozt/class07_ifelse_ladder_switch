package class07_ifelse_ladder_switch;

public class Ladder_Quiz_30 {
	public static void main(String[] args) {
		int attend;
		attend=45;
		if(attend>=90) {
			System.out.println("he is getting 100% marks");
		}else if(attend> 60 && attend <90) {
			System.out.println("qualified for exam");
			System.out.println("obtain more than 60% marks");
		}else if (attend> 40 && attend <60) {
			System.out.println("send application for exam");
			System.out.println("getting less than 40% marks.");
		}else {
			System.out.println("He is not qualified");
		}
	
	}

}
