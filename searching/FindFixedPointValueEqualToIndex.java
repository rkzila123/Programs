package searching;

public class FindFixedPointValueEqualToIndex {

	public static void main(String[] args) {
		
		int arr[] = {-10, -5, 0, 3, 7};
		
		for(int i=0;i<arr.length;i++){
			if(i==arr[i]){
				System.out.println(i);
			}
		}

	}

}
