package TestonHashmap;


	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Set;
	/*.	ArrayList Contains 
	al.add("pune");
	al.add("Mumbai");
	al.add("pune");
	al.add("Mumbai");
	al.add("Nasik");
	al.add("pune");
	Create HashMap which contain String as key and Integer as value key is name of city 
	and value is frequency of that city;
	e.g m.put("pune",3);
	m.put("Mumbai",2);
	Print Map using Foreach loop.8
	*/

	public class Q8City {
		public static void main(String[] args) {
				ArrayList<String>al=new ArrayList<>();
			al.add("Pune");
			al.add("Mumbai");
			al.add("Pune");
			al.add("Mumbai");
			al.add("Nasik");
			al.add("Pune");
			
			HashMap<String, Integer> hm = new HashMap<>();
			for(String s : al)
			{
				int a = hm.getOrDefault(s, 0)+1;
				hm.put(s, a);
			}
			Set<String> s2 = hm.keySet();
			for(String s : s2)
				System.out.println(s+" "+hm.get(s));
			
		}
	}


