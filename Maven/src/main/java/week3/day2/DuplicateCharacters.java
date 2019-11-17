package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections4.map.LinkedMap;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PayPal India";
		String re = s.replaceAll("\\s", "");
		char[] name = re.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(char c : name) {
			if(map.containsKey(c)) {
				int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
         
        System.out.println("Duplicate characters:");
         
        //Print duplicate characters
        for(char c : map.keySet()) {
            if(map.get(c) > 1) {             	
            	System.out.println(c);
            }
        }
         

	}
		
	}

