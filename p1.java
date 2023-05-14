package p1;
import java.util.*;
class employee {
	public void get() {
		String name = "Keerti";
		long mobile = 7305440998l;
		int yr = 2022;
		int age = 24;
		System.out.println(name);
		System.out.println(mobile);
		System.out.println(yr);
		System.out.println(age);
	}

}
class manager extends employee{
	public void getman() {
		System.out.println("manager");
	}
}
class hr extends employee{
	public void gethr(){
		System.out.println("hr");
	}
}
public class p1{
	public static void main(String[] args) {
		employee e1 = new employee();
		e1.get();
		manager e2 = new manager();
		e2.getman();
		hr e3 = new hr();
		e3.gethr();
	}
}