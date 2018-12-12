package array;

public class WriteAProgramToRemoveDuplicatesFromArray {

	public static void main(String[] args) {


		int [] arr={1,1,1,2,1,3,2,4,5,6,6};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					arr[j]=0;
				}
			}
		}
		
		for(int k=0;k<arr.length;k++){
			if(k==0){
				System.out.print(arr[k]);
			}else{
				System.out.print(" , "+arr[k]);
			}
		}

	}

}
