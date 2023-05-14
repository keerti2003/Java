package inheritanceeg;

class Teacher {
	void teach() {
		System.out.println("Teaching subject");
	}
}
class Student extends Teacher{
	void listen() {
		System.out.println("listening");
	}
}
class homeTuition extends Student{
	void explains() {
		System.out.println("Does homework");
	}
}
class inheritanceeg{
	public static void main(String[] args) {
		homeTuition h = new homeTuition();
		h.explains();
		h.teach();
		h.listen();
	}
}