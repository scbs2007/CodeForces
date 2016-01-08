import java.util.*;

public class Problem2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		
		String player[] = new String[n];
		int score[] = new int[n];
		for(i = 0; i < n; ++i)
		{
			player[i] = sc.next();
			score[i] = sc.nextInt();
			
			if(map.containsKey(player[i]))
			{
				map.put(player[i], map.get(player[i]) + score[i]);
			}
			else
			{
				map.put(player[i], score[i]);
			}	
		}
		int max = map.get(player[0]);
		for(i = 1; i < n; ++i)
		{
			if(map.get(player[i]) > max)
				max = map.get(player[i]);
		}
		
		Set<String> set = new HashSet<String>();
		
		for(Map.Entry<String, Integer> m:map.entrySet())
		{
			if(m.getValue() >= max)
				set.add(m.getKey());
		}
		map.clear();
		for(i = 0; i < n; ++i)
		{
			if(map.containsKey(player[i]))
			{
				map.put(player[i], map.get(player[i]) + score[i]);
			}
			else
			{
				map.put(player[i], score[i]);
			}
			if(map.get(player[i])>=max && set.contains(player[i]))
			{
				System.out.println(player[i]);
				break;
			}
		}
		
		sc.close();
	}
	

}
