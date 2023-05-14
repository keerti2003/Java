package practice;
import java.util.*;
class Rhyme{
	public void getmethod() {
	String name;
	String pname;
	int nlines;
}
}
class sl_sb extends Rhyme{
	public void getmethod() {
		String name = "Star Light, Star Bright";
		String pname = "abcd";
		int nlines = 2;
		System.out.println(name+" "+pname+" "+nlines);
	}
}
class Tbm extends Rhyme{
	public void getmethod() {
		String name = "Three Blind Mice";
		String pname = "efgh";
		int nlines = 5;
		System.out.println(name+" "+pname+" "+nlines);
	}
}
class Tlp extends Rhyme{
	public void getmethod() {
		String name = "This Little Piggy";
		String pname = "ijkl";
		int nlines = 3;
		System.out.println(name+" "+pname+" "+nlines);
	}
}

public class practice{
	public static void main(String[] args) {
		Rhyme r1 = new sl_sb();
		r1.getmethod();
		Rhyme r2 = new Tbm();
		r2.getmethod();
		Rhyme r3 = new Tlp();
		r3.getmethod();
	}
}