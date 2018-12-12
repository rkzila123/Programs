package string;

import java.util.HashMap;
import java.util.Map;

public class HowToCheckIfTwoStringsAreAnagramsOfEachOther {

	public static void main(String[] args) {
		
		String str="abababab  *";
		
		str=str.toUpperCase();
		
		String str2="babbAaba";
		str2=str2.toUpperCase();
		Map<Character , Integer> charMap= new HashMap<Character , Integer>();
		
		Map<Character , Integer> charMap2= new HashMap<Character , Integer>();
		
		boolean bool=compareStrWithStr2(str,str2,charMap,charMap2);
		
		
		if(bool){
			System.out.println("Strings are Anagram to each other");
		}else{
			System.out.println("Strings are not Anagram to each other");
		}
		
		

	}

	private static boolean compareStrWithStr2(String str, String str2, Map<Character, Integer> charMap, Map<Character, Integer> charMap2) {
		
		char[] ch=str.toCharArray();
		char[] ch2=str2.toCharArray();
		int value=0;
		int value2=0;
		for(int i=0;i<ch.length;i++){			
				if(ch[i]!=' ' && Character.isLetter(ch[i])){
					if(charMap.containsKey(ch[i])){
						value=charMap.get(ch[i]);
						value=value+1;
						charMap.put(ch[i], value);
					}else{
						charMap.put(ch[i], 1);
					}
				}			
		}
		
		for(int i=0;i<ch2.length;i++){			
			if(ch2[i]!=' ' && Character.isLetter(ch2[i])){
				if(charMap2.containsKey(ch2[i])){
					value2=charMap2.get(ch2[i]);
					value2=value2+1;
					charMap2.put(ch2[i], value2);
				}else{
					charMap2.put(ch2[i], 1);
				}
			}			
	    }
		
		
		return charMap.equals(charMap2);
	}

}
