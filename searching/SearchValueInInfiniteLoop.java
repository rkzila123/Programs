package searching;

public class SearchValueInInfiniteLoop {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,6,8,10,15,13};
		
		int sortedArray[]=sortArray(arr);
		
		int low=0 , high=1;
		int value=sortedArray[0];
		int key=15;
		
		while(value<key){
			low=high;
			high=2*high;
			value=sortedArray[high];
			
		}
		
		int index=indexbinarySearch(sortedArray ,low,high,key);
		
		System.out.println("index is :"+index);

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

	private static  int indexbinarySearch(int[] arr, int low, int high, int key) {
		
		if(high>=low){
			
			int mid=low+(high-low)/2;
			
			
			if(arr[mid]==key){
				return mid;
			}
			
			if(arr[mid]>key){
				
				return indexbinarySearch(arr,low,mid-1,key);
			}else{
				return indexbinarySearch(arr,mid+1,high,key);
			}
		}
		
		return -1;


	}

}
