package recursivetopic;

public class Recur5 {
		static void disp(int no)
		{
			if(no<=10)
			{
				if(no%2==1){
				System.out.println(no);
				}
				no++;
				disp(no);
			}
		}
			public static void main(String[] args) {
			disp(1);

			}

		}



	