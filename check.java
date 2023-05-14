package check;
import java.util.*;
public class check {
	public static void main(String arg[])
	{
	Pair<Integer, String> p1;
	Pair<String, Double> p2;
	p1=new Pair<Integer,String>();
	p2=new Pair<String,Double>();
	p1.setData(1947,"India");
	p2.setData("Asia",200.3);
	System.out.println(p1.getFirst());
	System.out.println(p1.getSecond());
	System.out.println(p2.getFirst());
	System.out.println(p2.getSecond());
	}
	}

	class Pair<T,E>
	{
	T a;
	E b;
	void setData(T x,E y)
	{
	a=x;
	b=y;
	}
	T getFirst()
	{
	return a;
	}
	E getSecond()
	{
	return b;
	}

}
