import java.util.*;
public class q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int N = sc.nextInt();
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 2; i < N;i++) {
			 if(N % i == 0) {
				 count1++;
			 }
		}
		int n = N;
		int rev = 0;
		while(n > 0) {
			rev = (rev*10)+(n%10);
			n/=10;
		}
		for(int j = 2; j < rev; j++) {
			if(rev % j == 0) {
				count2++;
			}
		}
		if(count1 == 0 && count2 == 0) {
			System.out.println("twisted");
			
		}
		else {
			System.out.println("not twisted");
		}
		
		
	}

}
