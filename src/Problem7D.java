import java.util.*;
	
public class Problem7D {

	public static boolean isPalin(String s)
	{
		StringBuilder t = new StringBuilder(s);
		for(int i = s.length()-1; i >= 0; i--)
		{
			t.append(""+s.charAt(i));
		}
		
		if(s.equals(t.toString()))
				return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
	}

}
