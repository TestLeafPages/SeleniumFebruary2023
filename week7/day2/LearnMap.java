package week7.day2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class LearnMap {
	@Test
	public void runTest() {
	// Map is an interface
	// Map is a 2 Dimensional collection
	// Map -> Entry -> <Key,Value>
		// Employess -> Name,EMP ID
		// Arun, TSF0357
		// Bala, TSF0964
		// Charlie, TSF1775
		// Deepa, TSF0173
		// <12345,{TL,Hari,R,9876543210,Male}>
		Map<String, String> map = new TreeMap<String, String>();
		map.put("TSF0357", "Arun");
		map.put("TSF0964", "Bala");
		map.put("TSF1775", "Charlie");
		map.put("TSF0173", "Deepa");
		map.put("TSF0175", "Zelda");
		map.put("TSF0179", "Gamma");
		map.put("TSF0964", "Priya");
		System.out.println(map);
		boolean containsKey = map.containsKey("TSF0001");
		boolean containsValue = map.containsValue("Zelda");
		
		String value = map.get("TSF1775");
		System.out.println(value);
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		
		
		
		
		
		
		
		
		
	}
}
