import java.util.*;
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt() ;
		System.out.println("Enter the 2nd number");
		int b = sc.nextInt();
		
		for(int i = a; i <= b; i++) {
			System.out.println("multiplicative table of "+i);
			for(int j = 1; j <= 10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
			
		
		 

	}

}
