import java.util.Scanner;

public class LabTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			double integer1, integer2, integer3, integer4;
			double integer5, integer6, integer7, sum;
			double number;
			
			Scanner sc = new Scanner (System.in);
			System.out.print("Enter the number of items: ");
			integer1 = sc.nextDouble();
			System.out.print("Enter price of first item: RM");
			integer2 = sc.nextDouble();
			System.out.print("Enter quantity of first item: ");
			integer3 = sc.nextDouble();
			System.out.println();
			
			System.out.print("Enter price of second item: RM");
			integer4 = sc.nextDouble();
			System.out.print("Enter quantity of second item: ");
			integer5 = sc.nextDouble();
			System.out.println();
			
			System.out.print("Enter price of third item: RM");
			integer6 = sc.nextDouble();
			System.out.print("Enter quantity of third item: ");
			integer7 = sc.nextDouble();
			System.out.println();
			
			sum = ((integer2*integer3) + (integer4*integer5) + (integer6*integer7));
			
			
			System.out.println("Total price: RM" + sum);

			if (sum > 100) {
				System.out.println("Discount received : RM" + sum*0.20);
				System.out.println("Price to be paid : RM" + (sum-(sum*0.20)));
			}else if (sum < 100) {
				System.out.println("Discount received : RM" + sum*0.1);
				System.out.println("Price to be paid : RM" + (sum-(sum*0.10)));
			}
		}
	}






