package threadconcept;

public class Main4 {

	public static void main(String[] args) {
	Thread th1=Thread.currentThread();
	System.out.println(th1.getId());
	System.out.println(th1.getName());
	System.out.println(th1.getPriority());
th1.setName("dingathread");
th1.setPriority(8);
System.out.println(th1.getId());
System.out.println(th1.getName());
System.out.println(th1.getPriority());
	}

}
