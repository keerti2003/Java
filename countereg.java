package countereg;

public class countereg {
	static int count=0;

countereg(){
	count++;
	System.out.println(count);
}

public static void main(String[] args) {
	countereg c1 = new countereg();
	countereg c2 = new countereg();
	countereg c3 = new countereg();
}
}