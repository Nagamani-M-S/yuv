package recursivetopic;

public class Recur1 {
static void disp(int no)
{
	if(no<=10)
	{
		System.out.println(no);
		no++;
		disp(no);
	}
}
	public static void main(String[] args) {
	disp(1);

	}

}
