package searching;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class FindKMostFrequentWordsFromAFile {

	public static void main(String[] args) throws Exception {
		BufferedReader br=null;
		try {
						
			File file = new File("C:\\Users\\Administrator\\Desktop\\N06demo1.txt");

			 br = new BufferedReader(new FileReader(file));
			HashMap<String , Integer> hashMap= new HashMap<String , Integer>();
			String line;
			int value=0;
			int topValue=5;
			String[] words = null;
			String[] words1 = null;
			while ((line = br.readLine()) != null){
				int value2=0;
				 words = line.split("\\s+");
				 String[] words2=new String[words.length];
				 for (String part : words) {
					 words2[value2]=part;
					 value2++;
			        }
				 if(words1!=null)
				 {
					 int value1=0;
					 String[] words3= new String[words1.length+words2.length];
					 for (String part : words1) {
						 words3[value1]=part;
						 value1++;
				        }
					 for (String part : words2) {
						 words3[value1]=part;
						 value1++;
				        }
					 words1=words3;
				 }
					 
				 else
					 words1=words2;
				
			}
			
			
			for(String str:words1){
				if(hashMap.containsKey(str)){
					value=hashMap.get(str);
					hashMap.put(str, ++value);
				}else{
					hashMap.put(str, 1);
				}
			}
			
			LinkedHashMap<String, Integer> linkedHMap=sortHashMapByvalue(hashMap,topValue);
			
			for (Entry<String, Integer> entry : linkedHMap.entrySet())
	        {
	            System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
	        }
			
			
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(br!=null){
				br.close();
			}
		}
		
	
	}

	private static LinkedHashMap<String, Integer> sortHashMapByvalue(HashMap<String, Integer> hashMap, int topValue) {
		
		
		List<String> mapKey= new ArrayList<>(hashMap.keySet());
		List<Integer> mapValue= new ArrayList<>(hashMap.values());
		
		Collections.sort(mapKey);
		Collections.sort(mapValue,Collections.reverseOrder());
		
		
		
		LinkedHashMap<String, Integer> linkedHash = new LinkedHashMap<String, Integer>();
		
		Iterator<Integer> itrVal= mapValue.iterator();
		
		while(itrVal.hasNext()){
			Integer value=itrVal.next();
			
			Iterator<String> itrKey = mapKey.iterator();
			while(itrKey.hasNext()){
				String key=itrKey.next();
				Integer comp1=hashMap.get(key);
				Integer comp2=value;
				
				
				if(comp1==comp2){
					itrKey.remove();
					if(linkedHash.size()<topValue)
					linkedHash.put(key, value);
					break;
				}
			}
			
			
		}
		
		
		
		return linkedHash;
	}

	}


