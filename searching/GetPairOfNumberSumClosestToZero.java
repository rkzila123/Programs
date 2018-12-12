package searching;

public class GetPairOfNumberSumClosestToZero {

	public static void main(String[] args) {
		
		int[] arr={10,1,-5,11,-11,-3,-7,4,6};
		int minSum=arr[0]+arr[1];
		for(int i=0;i<arr.length;i++){			
			for(int j=1+1;j<arr.length-1;j++){			
			int sum=arr[i]+arr[j];
			if(Math.abs(minSum)>Math.abs(sum)){
				minSum=sum;
				

			}
			}
		}
		
		
		int[] sortedArr=sortArray(arr);
		printArray(sortedArr);
		
		for(int i=0;i<sortedArr.length;i++){
			for(int j=i+1;j<sortedArr.length;j++){
				if(minSum==0){
					if(sortedArr[i]+sortedArr[j]==minSum){
						System.out.println();
						System.out.println("Pairs sum closest to zero is :"+sortedArr[i]+" , "+sortedArr[j]);
					}
				}else{
					if(sortedArr[i]+sortedArr[j]==minSum || sortedArr[i]+sortedArr[j]==(minSum)*-1){
						System.out.println();
						System.out.println("Pairs sum closest to zero is :"+sortedArr[i]+" , "+sortedArr[j]);
					}
				}
			}
		}
		
	}
	
	private static void printArray(int[] sortedArr) {
		
		for(int k=0;k<sortedArr.length;k++){
			if(k>0){
				System.out.print(", ");
				System.out.print(sortedArr[k]);
			}else{
				System.out.print(sortedArr[k]);
			}
		}
		
	}

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
