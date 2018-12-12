package searching;

public class FindPairWithGivenDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5,98, 20, 3, 2, 50, 80};
		int n = 78 ;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]-arr[j]==n ||arr[j]-arr[i]==n){
					System.out.println("Value pairs are "+arr[i]+" and "+arr[j]);
				}
			}
		}
	}

}
