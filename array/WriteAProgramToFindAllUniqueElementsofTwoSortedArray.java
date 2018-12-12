package array;

import java.util.HashSet;
import java.util.Set;

public class WriteAProgramToFindAllUniqueElementsofTwoSortedArray {

	public static void main(String[] args) {
		
		int[] arr1={10,23,34,34,45,56,67,78};

		int[] arr2={9,21,34,45,56,69,81,92};
		Set<Integer> set=new HashSet<Integer>();
		int counter=0;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]!=arr2[j]){
					/*set.add(arr1[i]);
					set.add(arr2[j]);*/
					System.out.println(arr1[i]+" "+arr2[j]);
				}
			}
		}
		

	}

}
