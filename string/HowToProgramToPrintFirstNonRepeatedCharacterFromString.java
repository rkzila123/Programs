package string;

import java.util.HashMap;
import java.util.Map;

public class HowToProgramToPrintFirstNonRepeatedCharacterFromString {

	public static void main(String[] args) {
		
		String str="sdfgdkkggjjsffdgb";
		
		char[] ch=str.toCharArray();
		
		Map<Character,Integer> demoMap= new HashMap<Character,Integer>();
		
		for(int i=0;i<ch.length;i++){
			
			if(demoMap.containsKey(ch[i])){
				System.out.println(ch[i]);
				break;
			}else{
				demoMap.put(ch[i], 1);
			}
		
		}
		

	}

}
