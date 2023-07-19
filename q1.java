import java.util.*;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b = sc.nextInt();
		
		int sumA = 0;
		int sumB = 0;
		
		for(int i = 1; i <a; i++) {
			if(a % i == 0) {
				sumA +=i;
			}
		}
		for(int j = 1; j < b; j++) {
			if(b % j ==0 ) {
				sumB+=j;
			}
		}
		
		if(sumA==b && sumB==a) {
			System.out.println("Amicable number");
		}
		else {
			System.out.println("Not");
		}
		
		
	}

}
