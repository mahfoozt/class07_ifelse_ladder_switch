package Quiz_10;

public class quiz34_salary {

	public static void main(String[] args) {
//If the salary is 30000 then print “minor  salary”
//If the salary is 60000 then print “middle salary”
//If the salary is 90000 then print “huge salary”
//If  any other salary then print “don’t know”

		int salary=90000;
		switch(salary)	{
		case 30000:
			System.out.println("minor salary" );
			break;
		case 60000:
			System.out.println("middle salary" );
			break;
		case 90000:
			System.out.println("huge salary" );
			break;
		default:
			System.out.println("don't know" );
			break;		
			
		}

	}

}
