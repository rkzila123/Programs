package searching;

public class SearchIndexOfelementInArray {

	public static void main(String[] args) {

		int[] arr= {10,12,18,23,48};
		int searchValue=19;
		int index;

		index=findIndexofNumber(arr,searchValue); 

		if(index==-1){
			System.out.println("Value is not present in Array");
		}else{
			System.out.println("Index is :"+index);
		}

	}

	private static int findIndexofNumber(int[] arr, int searchValue) {
		for(int i=0;i<arr.length;i++){
			if(arr[i]==searchValue){
				return i;				
			}			
		}
		return -1;
	}

}
