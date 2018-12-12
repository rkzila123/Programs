package searching;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class FindKLeastFrequentWordsFromAFile {

	public static void main(String[] args) throws Exception {
		BufferedReader bufReader=null;
		try {
			File file= new File("C:\\Users\\Administrator\\Desktop\\N06demo1.txt");
			
			 bufReader= new BufferedReader(new FileReader(file));
			
			HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
			
			LinkedHashMap<String, Integer> linkedHashMap= new LinkedHashMap<String, Integer>();
			
			int bottom=3;
			String line;
			int valueMap=0;
			String[] strArr=null;
			String[] strArr1=null;
			
			while((line=bufReader.readLine())!=null){
				int value=0;
				
				strArr=line.split("\\s+");
				String[] strArr2=new String[strArr.length];
				for(String str:strArr){
					strArr2[value]=str;
					value++;
				}
				
				if(strArr1!=null){
					int value2=0;
				String[] strArr3=new String[strArr1.length+strArr2.length];
				
				for(String str:strArr1){
					strArr3[value2]=str;
					value2++;
				}
				
				for(String str:strArr2){
					strArr3[value2]=str;
					value2++;
				}
				
				strArr1=strArr3;
				
				}else{
					strArr1=strArr2;
				}
				
				
			}
			
			for(String str:strArr1){
				if(hashMap.containsKey(str)){
					valueMap=hashMap.get(str);		
					hashMap.put(str, valueMap+1);
				}else{
					hashMap.put(str, 1);
				}
			}
			
			linkedHashMap=getMapValueinAscendingOrder(hashMap , bottom);
			
			for(Entry<String, Integer> map:hashMap.entrySet()){
				System.out.println("key :"+map.getKey()+" Value :"+map.getValue());
			}
			
			for(Entry<String, Integer> map:linkedHashMap.entrySet()){
				System.out.println("key :"+map.getKey()+" Value :"+map.getValue());
			}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(bufReader!=null){
				bufReader.close();
			}
		}

	}

	private static LinkedHashMap<String, Integer> getMapValueinAscendingOrder(HashMap<String, Integer> hashMap,
			int bottom) {
		
		List<String> mapKey= new ArrayList<>(hashMap.keySet());
		List<Integer> mapValue= new ArrayList<>(hashMap.values());
		
		Collections.sort(mapKey);
		Collections.sort(mapValue);
		
		LinkedHashMap<String, Integer> linkedHashMap= new LinkedHashMap<String, Integer>();
		
		int value=0;
		
		Iterator<Integer> itrValue=mapValue.iterator();
		
		while(itrValue.hasNext()){
			value=itrValue.next();
			
			Iterator<String> itrKey=mapKey.iterator();
			while(itrKey.hasNext()){
				String key=itrKey.next();
				
				Integer temp=hashMap.get(key);
				Integer temp1=value;
				
				if(temp==temp1){
					itrKey.remove();
					if(linkedHashMap.size()<bottom)
					linkedHashMap.put(key, value);
				}
			}
		}		
		
		return linkedHashMap;
	}

}
