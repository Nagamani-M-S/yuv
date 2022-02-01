package recursivetopic;

public class Recur3 {
		static void disp(int no)
		{
			if(no<=10)
			{
				if(no%2==0){
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


