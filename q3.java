import java.util.*;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b = sc.nextInt();
		
		
		for(int i = a; i <= b; i++) {
			int count = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					count++;
					
				}
			}
			if(count == 0) {
				System.out.print(i+" ");
			}
			
			
			
			
		}

	}

}
