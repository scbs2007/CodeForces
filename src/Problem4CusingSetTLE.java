import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem4CusingSetTLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Set<String> set = new HashSet<String>();
		
		for(int i=0;i<n;++i)
		{
			String s = sc.next();
			StringBuilder temp = new StringBuilder(s);
			StringBuilder tempcopy = new StringBuilder(s);
			String t = temp.toString();
			if(set.contains(t)==false)
			{
				set.add(t);
				System.out.println("OK");
			}
			else
			{
				int count = 1;
				while(true)
				{
					temp.delete(0, temp.length()).append(tempcopy+""+count);
					
					t = temp.toString();
					if(set.contains(t))
					{
						++count;
						continue;
					}
					set.add(t);
					System.out.println(t);
					break;
				}
			}
			
		}
	}

}
