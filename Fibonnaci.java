
public class Fibonnaci {
	public static void main(String []args)
	{
		int n=10;
		int p=0,q=1;
		if(n==1)
		{
			System.out.println(p);
		}
		else
		{
			System.out.println(p+"\n"+q);
			for(int i=3;i<=n;i++)
			{
				int r=p+q;
				System.out.println(r);
				p=q;
				q=r;
			}
			
		}

	}
}
