import java.util.Scanner;

public class LabTest1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double integer1, integer2;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter sales :RM");
		integer1 = sc.nextDouble();
		
		System.out.print("Enter hours worked :");
		integer2 = sc.nextDouble();
		
		double wage = integer2 * 5;
	
		
		if(integer1 >= 150 && integer1 <= 300) {
			System.out.println("Commission: RM" + integer1*0.05);
			System.out.println("Daily wages: RM" + (wage + (integer1*0.05)));
		}else if(integer1 >=301 && integer1 <= 500) {
			System.out.println("Commission: RM" + integer1*0.10);
			System.out.println("Daily wages: RM" + (wage + (integer1*0.10)));
		}else if(integer1 > 500) {
			System.out.println("Commission: : RM"+ integer1*0.15);
			System.out.println("Daily wages: RM" + (wage + (integer1*0.15)));
		}
		
		
		
	}

}


