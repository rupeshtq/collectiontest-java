package TestonHashmap;

import java.util.HashMap;

public class Party {

	public static void main(String[] args) 
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("789456123012", "BJP");
		hm.put("321469872015", "Shivsena");
		hm.put("323456789012", "NCP");
		hm.put("423456789012", "BJP");
		hm.put("523456789012", "Congress");
		hm.put("623456789012", "BJP");
		hm.put("723456789012", "Other");
		hm.put("823456789012", "NCP");
		hm.put("923456789012", "Other");
		hm.put("653456789012", "Congress");
		hm.put("343456789012", "BJP");
		
		HashMap<String, Integer> hm1 = new HashMap<>();
		for(String s : hm.keySet())
		{
			String ss = hm.get(s);
			if(hm1.containsKey(ss))
			{
				int v = hm1.getOrDefault(ss, 0)+1;
				hm1.put(ss, v);
			}
			else
			{
				hm1.put(ss, 1);
			}
		}
		System.out.println(hm1);

}}
