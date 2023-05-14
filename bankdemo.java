package bankdemo;
import java.io.*;
import java.util.*;
public class CheckingAcc{
	 int  number;
	 String name;
	 double balance;
	public CheckingAcc(int number) {
		this.number = number;
	}
	public CheckingAcc(String name) {
		this.name = name;
	}
	public void deposit(double balance) throws InsufficientAmountException {
		if(balance<1000.00) {
			throw new InsufficientAmountException(balance);
		}
	}
	public int getnumber() {
		return number;
	}
	public String getame() {
		return name;
	}
	public double getbalance() {
		return balance;
	}
}
public class bankdemo {
	public static void main(String[] args) {
		CheckingAcc c = new CheckingAcc();
		try {
			Scanner obj = new Scanner(System.in);
			for (i=0;i<3;i++) {
				int number = obj.nextInt();
				c.getnumber();
				System.out.printf("%d %s %f ", number,name,balance);
				String name = obj.next();
				c.getname();
				double balance = obj.nextDouble();
				c.getbalance();
				}
		}
	}
}
