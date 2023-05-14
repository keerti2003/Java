package finalizeeg;

public class finalizeeg {
	public void finalize() throws Throwable {
		System.out.println("Object garbage collected");
	}
	public static void main(String[] args) {
		finalizeeg f = new finalizeeg();
		f = null;
		System.gc();
	}
}
