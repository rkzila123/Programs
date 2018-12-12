package searching;

public class InterpolationSearch {

	public static void main(String[] args) {
		
		int[] arr={1,3,5,7,9,10};
		
		int low=0;
		int high=arr.length;
		int valueNeedToFind=7;
		
		int index=findPositionOfNumber(arr,low,high-1,valueNeedToFind);
		
		if(index==-1){
			System.out.println("Number is not present in Array");
		}else{
			System.out.println("Number at index :"+index);
		}
				
		
		
	}

	private static int findPositionOfNumber(int[] arr, int low, int high,int valueNeedToFind) {
		
		while (low <= high && valueNeedToFind >= arr[low] && valueNeedToFind <= arr[high])
	    {
		int position=low+((valueNeedToFind-arr[low])*(high-low)/(arr[high]-arr[low]));
		
		if(valueNeedToFind==arr[position]){
			return position;
		}
		
		if(valueNeedToFind>arr[position]){
			low=position+1;
		}else{
			high=position-1;
		}
		
	    }
		
		return -1;
	}
}
