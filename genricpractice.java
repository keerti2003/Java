package genricpractice;
import java.util.*;
public class genricpractice {
	public static void main(String[] args)
	{
	// Creating an empty HashMap
	/*Map<String, Integer> map = new TreeMap<>();
	// Inserting entries in the Map
	// using put() method
	map.put("Amit", 15);
	map.put("Kumar", 40);
	map.put("Smitha", 60);
	// Iterating over Map
	for (Map.Entry<String, Integer> e : map.entrySet())
	// Printing key-value pairs
	System.out.println(e.getKey() + " "
	+ e.getValue());
	}*/
		Map<Integer, String> ht1 = new HashMap<>();


		// Initialization of a Map using Generics 
		Map<Integer, String> ht2 = new HashMap<Integer, String>();


		// Inserting the Elements ht1.put(1, "TODAY");
		/*ht1.put(2, "IS");
		ht1.put(3, "MONDAY");


		ht2.put(new Integer(1), "TODAY"); 
		ht2.put(new Integer(2), "IS"); 
		ht2.put(new Integer(3), "WEDNESDAY");


		System.out.println(ht1); System.out.println(ht2);*/
		/*Map<Integer, String> hm1= new HashMap<Integer, String>();

		// Inserting the Elements
		hm1.put(new Integer(1), "yesterday"); 
		hm1.put(new Integer(2), "was"); hm1.put(new Integer(3), "Friday");

		System.out.println("Initial Map " + hm1); hm1.put(new Integer(3), "Sunday");
		System.out.println("Updated Map " + hm1);

		}*/
		Map<Integer, String> hm1
		= new HashMap<Integer, String>();

		// Inserting the Elements 
		hm1.put(new Integer(1), "APPLE"); 
		hm1.put(new Integer(2), "GRAPES"); 
		hm1.put(new Integer(3), "ORANGE");

		for (Map.Entry mapElement : hm1.entrySet()) { 
			int key = (int)mapElement.getKey();

		// Finding the value 
			String value = (String)mapElement.getValue();

		 
		System.out.println(key + " : "+value);

		}
		}



}
