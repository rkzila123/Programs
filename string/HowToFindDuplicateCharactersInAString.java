package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HowToFindDuplicateCharactersInAString {

	public static void main(String[] args) {
		
		String str="ssshdfihsidhfhdhhasfhhaf";
		
		char[] ch= str.toCharArray();
		
		int value=0;
		
		Map<Character, Integer> demoMap= new HashMap<Character, Integer>();
		
		for(int i=0;i<ch.length;i++){
			if(demoMap.containsKey(ch[i])){
				value=demoMap.get(ch[i]);
				demoMap.put(ch[i], value+1);
			}else{
				demoMap.put(ch[i], 1);
			}
		}
		
		for(Entry<Character, Integer> demo: demoMap.entrySet()){
			
			if(demo.getValue()>1){
				System.out.println("Key :"+demo.getKey()+" and repeatation is :"+demo.getValue());
			}
			
		}

	}

}
