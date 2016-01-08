import java.util.*;

public class Problem4C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < n; ++i)
		{
			String s = sc.next();
			int temp;
			if(map.containsKey(s))
			{
				temp = map.get(s) + 1;
				map.put(s, temp);
				System.out.println(s+temp);
			}
			else
			{	map.put(s, 0);
				System.out.println("OK");
			}
			
			
		}
		sc.close();
	}

}
