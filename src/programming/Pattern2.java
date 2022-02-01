package programming;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j<=i)
				{
					System.out.print(no+" ");
					no++;
				}
				else
				{
					no++;
				}
			}
			System.out.println();
		}
	}
	}
	
