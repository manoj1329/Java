
public class Factorial_Recursion {
	public static int fact(int m)
	{
		if(m==0)
		{
			return 1;
		}
		else
		{
			return m*fact(m-1);
		}
	}
	public static void main(String []args)
	{
		int n=5;
		int fact_result=fact(n);
		System.out.println(fact_result);
	}
}
