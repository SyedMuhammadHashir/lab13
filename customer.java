public class customer {
	int balance = 50000;
	synchronized void withdraw(int amnt) {
		if (this.balance< amnt) {
			System.out.println("Not enough balance");
		
		
		}
		else {
			this.balance =this.balance - amnt;
			System.out.println(amnt+" Withdrawed");
		}
	}
}
