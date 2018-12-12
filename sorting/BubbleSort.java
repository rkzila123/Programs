package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr={1,4,6,8,3,5,2,13,11};
		
		int[] sortedArr=sortArray(arr);
		
		printArray(sortedArr);

	}

	private static void printArray(int[] sortedArr) {
		
		for(int k=0;k<sortedArr.length;k++){
			if(k>0){
				System.out.print(", ");
				System.out.print(sortedArr[k]);
			}else{
				System.out.print(sortedArr[k]);
			}
		}
		
	}

	private static int[] sortArray(int[] arr) {
		
		int temp;
		int j=0;
		boolean swap=true;
		while(swap){
			swap=false;
			j++;
		for(int i=0;i<arr.length-j;i++){
			if(arr[i]>arr[i+1]){
				temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
				swap=true;
			}
		}
		}
		
		return arr;
	}

}
