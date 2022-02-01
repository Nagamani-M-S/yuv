package programming;

public class Fact2 {

	public static void main(String[] args) {
		int fact=1;
		int[]arr={10,20,30,40,50};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr[i];j++)
			{
				
				fact=fact*j;
			}
			System.out.println(fact);
		}
		

	}

}
