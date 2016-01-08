import java.util.*;

public class Problem1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long a = sc.nextLong();
		long res=1;
		if(n<=a)
			res *= 1;
		else
		{
			if(n%a==0)
				res = n/a;
			else
				res = (n/a)+1;
		}
		if (m<=a)
			res *=1;
		else
		{
			if(m%a==0)
				res *= m/a;
			else
				res *= ((m/a)+1);
		}
			
		System.out.println(res);
		sc.close();
	}
	
}
