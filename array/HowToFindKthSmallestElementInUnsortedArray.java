package array;

public class HowToFindKthSmallestElementInUnsortedArray {

	public static void main(String[] args) {
		
		int [] arr= {1, 2, 3, 9, 4,5,7,6,8};
		
		int k=2;
		
		int [] arr2=new int [k];
		
		int min=arr[0];
		int min2=arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println(min);
		
		for(int j=0;j<arr.length;j++){
			
		}

	}

}
