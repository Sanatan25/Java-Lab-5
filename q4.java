import java.util.*;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a  = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b = sc.nextInt();
		
		
		for(int i = a; i <= b; i++) {
			int fact = 1;
			for(int j = 1; j <= i; j++) {
				fact*=j;
			}
			System.out.println("factorial of "+i+" is " + fact);
		}
		System.out.println();
	}

}
