package array;

import java.util.HashSet;
import java.util.Set;

public class HowToFindRepeatedNumbersInArrayIfItContainsMultipleDuplicates {

	public static void main(String[] args) {
		
		int [] arr={1,3,1,3,44,44,44,44,5,6,7,6,10,8,5,9,12};
		
		int length=arr.length;
		
		Set<Integer> hasSet= new HashSet<Integer>();
		
		for(int i=0;i<length;i++){
			int counter=0;
			for(int j=i+1;j<length;j++){
				if(arr[i]==arr[j]){
					counter=counter+1;
				}
				
				
			}
			
			if(counter>0){
				hasSet.add(arr[i]);
			}
		}
		
		for(Integer integer:hasSet){
			System.out.println("Repeative values are :"+integer);
		}

	}

}
