package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HowToPrintDuplicateCharactersFromString {

	public static void main(String[] args) {
		
		String str="acbdefacbsdfgjnjxzklfhgsdfjg";
		
		char[] ch=str.toCharArray();
		
		Map<Character,Integer> chMap= new HashMap<Character,Integer>();
		int value=0;
		for(int i=0;i<ch.length;i++){
			
			if(!chMap.containsKey(ch[i])){
				chMap.put(ch[i], 1);
			}else{
				value=chMap.get(ch[i]);
				value=value+1;
				chMap.put(ch[i], value);
			}
		}
		
		for(Entry<Character, Integer> entry:chMap.entrySet()){
			if(entry.getValue()>1)
			System.out.println("Key :"+entry.getKey()+" value :"+entry.getValue());
		}

	}

}
