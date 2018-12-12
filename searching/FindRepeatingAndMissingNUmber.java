package searching;

public class FindRepeatingAndMissingNUmber {

	public static void main(String[] args) {
		
		int[] arr={1,2,2,5,3,6,7,8};
	
		//1, 2, 2, 3, 5, 6, 7, 8
		int[] sortedArray=sortArray(arr);
		
		printArray(sortedArray);
		
		int missingNumber=findMissingNumber(sortedArray);
		
		System.out.println(missingNumber);
		
		int repeat=findRepeatativeNumber(sortedArray);

		if(repeat==-1){
			System.out.println("No element are repeated");
		}else{
			System.out.println(sortedArray[repeat]+" is repeated in array");
		}

	}

	private static int findRepeatativeNumber(int[] sortedArray) {
		for(int i=0;i<=sortedArray.length-1;i++){
			if(sortedArray[i]==sortedArray[i+1]){
				return i;
			}
		}
		return -1;
	}

	private static int findMissingNumber(int[] sortedArray) {
		
		
		int currentValue=0;
		
		if(sortedArray[0]!=sortedArray[1])
			 currentValue=sortedArray[0]+1;
		else
			currentValue=sortedArray[0];
		
		
		
		for(int i=1;i<=sortedArray.length-1;i++){
			
			if(currentValue!=sortedArray[i]){
				
				
				break;
				
			}
			
			if(sortedArray[i]!=sortedArray[i+1])
				
			currentValue++;
			
			
			
			
			
			
			
		}
		return currentValue;
	}

	private static void printArray(int[] sortedArray) {
		
		for(int i=0;i<sortedArray.length;i++){
			if(i!=0){
				System.out.print(", "+sortedArray[i]);
			}else{
				System.out.print(sortedArray[i]);
			}
		}
		
	}

	private static int[] sortArray(int[] arr) {
		
		int j=0;
		boolean swap=true;
		int temp;
		while(swap){
			swap=false;
			j++;
			for(int i=0;i<arr.length-j;i++){
				if(arr[i]>arr[i+1]){
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				swap=true;
				}
			}
		}
		
		
		
		return arr;
		
		
	}

}
