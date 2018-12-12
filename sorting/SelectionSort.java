package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {64,25,12,22,11};
		
		int[] sortArray=sortArray(arr);
		
		for(int i=0;i<sortArray.length;i++){
			if(i==0){
			System.out.print(arr[i]);
			}else{
			System.out.print(" , "+arr[i]);
			}
		}


	}

	private static int[] sortArray(int[] arr) {
		
		
		int temp;
		for(int i=0;i<arr.length-1;i++){
			int minindex=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[minindex]){
					minindex=j;										
				}
			}
			temp=arr[minindex];
			arr[minindex]=arr[i];
			arr[i]=temp;
		}
		
		return arr;
	}

}
