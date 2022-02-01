package programming;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch='a';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j<=i)
				{
					System.out.print((char)i+" ");
					ch++;
				}
				else
				{
					ch++;
				}
			}
			System.out.println();
		}
	}
}
