package array;

public class HowToFindLargestAndSmallestNumberInUnsortedArray {

	public static void main(String[] args) {
		
		int [] arr={10,25,23,115,123,29,45,231,2,9,-3};
		
		int length=arr.length;
		
		int min=arr[0];
		int max=arr[0];
		
			for(int j=0;j<length;j++){
				
				if(arr[j]<min){
					min=arr[j];
				}
				if(arr[j]>max){
					max=arr[j];
				}
				
			}
			
			System.out.println(min);
			System.out.println(max);
		
		

	}

}
