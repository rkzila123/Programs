package array;

public class HowToFindAllPairsInArrayWhoseSumIsEqualToGivenNumber {

	public static void main(String[] args) {
		
		int [] arr={10,25,23,115,123,29,45,231,2,9,-3,5};
		
		int length=arr.length;
		
		int value=7;
		
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				
				if(arr[i]+arr[j]==value){
					System.out.println("Pairs are :"+arr[i]+" , "+arr[j]);
				}
				
			}
		}

	}

}
