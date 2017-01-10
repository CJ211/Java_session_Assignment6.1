import java.util.*;

class Timer extends Thread
{
	public void run()

	{
		Scanner sc=new Scanner(System.in);
		int i;	
		int n;

		System.out.println("Enter the no of seconds");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i!=n)
			{
				System.out.println(i);
			}

			else
 			{
				System.out.println("Timeout");
				
			}
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
			}
		}
	}
}

class threadmain
{
	public static void main(String args[])
	{
		Timer t=new Timer();
		Thread t1=new Thread(t);
		t1.start();	
	}
}
