package searching;

public class FindTwoLowestNumberInArray {

	public static void main(String[] args) {
		
		int[] arr={1,5,11,9,13,8,3};
		
		int[] sortedArray=sortArray(arr);
		
		System.out.println("Two smallest NUmber in array are :"+sortedArray[0]+" ,"+sortedArray[1]);

	}

	private static int[] sortArray(int[] arr) {
		
		boolean swap=true;
		int temp;
		int j=0;
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
