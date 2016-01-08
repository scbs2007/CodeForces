import java.util.*;
import java.util.regex.*;

public class Problem1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; ++i)
		{
			String s = sc.next();
			String ans="";
			if(s.matches("R\\d+C\\d+"))
			{
				int cindex = s.indexOf('C');
				int row = Integer.parseInt(s.substring(1, cindex));
				int col = Integer.parseInt(s.substring(cindex+1,s.length()));
				int t;
				
				while(col>0)
				{
					t = col  % 26;
					if(t == 0)
						t = 26;
					ans = ((char)(64 + t)) + ans;
					if(col%26==0)
						col--;
					col = col/26;
					
				}
				ans += row;
			}
			else
			{
				ans += 'R';
				Pattern p = Pattern.compile("\\d+");
				Matcher m = p.matcher(s);
				if(m.find()==true)
					ans += m.group();
				ans += 'C';
				p = Pattern.compile("[A-Z]+");
				m = p.matcher(s);
				if(m.find()==true)
				{
					String t = m.group();
					int len = t.length();
					int count =0, ind=0;
					while(len > 0)
					{
						int asc = (int)t.charAt(len-1);
						asc -= 64;
						if(ind==0)
						{
							count+=asc;
							
						}
						else
							count = count + (asc*((int)Math.pow(26, ind)));
						--len;
						++ind;
					}
					ans += count;
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}

}
/*

A 1
B 2
Z 26

AA 27
AB 28
AZ 52

BA 53
BB 54
BC 55
BZ 78
CA 79
*/