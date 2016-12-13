package ImportantJavaPrograms;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class SortHashMapEntries {
	public void printUnsortedHash()
	{
		Map<String,String> hash  = new HashMap<String,String>();
		hash.put("4", "Tarika");
		hash.put("2", "Sarala");
		hash.put("3", "Pragya");
		hash.put("1", "Rajesh");
		
		System.out.println("Display Hash map - Unsorted");
		displayEntries(hash);
		
		System.out.println("\n\nDisplay Tree map - Sorted");
		Map<String,String> tree  = new TreeMap<String,String>(hash);
		displayEntries(tree);		
	}
	
	public void displayEntries(Map<String,String> map)
	{
		for(Map.Entry entry : map.entrySet())
		{
			System.out.printf("\nKey: " + entry.getKey() + " and Value is: " + entry.getValue());
		}
	}
	

}
