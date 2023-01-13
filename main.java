import lab.CUSTOMERS;

public class main {
	class Thread1 extends Thread{
		customer c;
	Thread1(customer c){this.c = c;
	}
	public void run()
	{
	c.withdraw(45000);
	}}
	class Thread2 extends Thread{
		customer c;
	Thread2(customer c){
	this.c = c;
	}
	public void run()
	{
	c.withdraw(20000);
	} }
}
