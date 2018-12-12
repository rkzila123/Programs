package searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr={1,4,6,8,3,5,2,13,11};
		
		int[] sortedArr=sortArray(arr);
		int length=sortedArr.length;
		int valueNeedTosearch=8;
		
		int index=binarySearch(sortedArr,0,length-1,valueNeedTosearch);
		
		if(index==-1){
			System.out.println("Value is not present in Array");
		}else{
			System.out.println("Number present at index : "+index);
		}
	}
	
	private static int binarySearch(int[] sortedArr, int radius, int length, int valueNeedTosearch) {
		
		if(length>=radius){
			
			int mid=radius+(length-radius)/2;
			
			if(sortedArr[mid]==valueNeedTosearch){
				return mid;
			}else{
				if(sortedArr[mid]>valueNeedTosearch){
					return binarySearch(sortedArr,radius,mid-1,valueNeedTosearch);
				}else{
					return binarySearch(sortedArr,mid+1,length,valueNeedTosearch);
				}
			}		
		}
		return -1;		
	}

	// Sorting array 
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
