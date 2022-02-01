package recursivetopic;

public class Recur2 {

		static void disp(int no)
		{
			if(no>=1)
			{
				System.out.println(no);
				no--;
				disp(no);
			}
		}
			public static void main(String[] args) {
			disp(10);

			}

		}

