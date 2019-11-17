package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Kalaiarasu";
		char[] name = s.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char c : name) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		
		}
		System.out.println(map);
		

	}

}
