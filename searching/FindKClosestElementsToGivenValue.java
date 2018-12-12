package searching;

public class FindKClosestElementsToGivenValue {

	public static void main(String[] args) {
		
		int k = 4, value = 32;
			     int  arr[] = {12, 16, 22, 30, 35, 39, 42, 15 ,23,
			               45, 48, 50, 53, 55, 56} ;
			   
			     int[] sortedArray=sortArray(arr);
			     
			     int  arrN[]=new int[sortedArray.length];
			     
			     for(int i=0;i<sortedArray.length;i++){
			    	 if(sortedArray[i]<value)
			    	 {
			    		 arrN[i]=sortedArray[i]-value;
			    		 System.out.println(arrN[i]);
			    	 }
			    	 else {
			    		 arrN[i]=sortedArray[i]-value;
			    		 System.out.println(arrN[i]);
			    	 }
			    	 
			     }
		
			     int[]	sortedArrayN=sortArrayN(arrN);
			    for(int i=0;i<sortedArrayN.length;i++){
			    	
			    	if((sortedArrayN[i]+value)!=value)
			    	{
			    		if(i==0){
			    		System.out.print(""+(sortedArrayN[i]+value));
			    		k--;
			    	}else{
			    		System.out.print(" , "+(sortedArrayN[i]+value));
			    		k--;
			    	}
			    		
			    	}
			    	if(k==0)
			    		break;
			    }
		   
	}


	private static int[] sortArray(int[] arr) {


		boolean swap=true;
		int j=0;
		int temp;
		while(swap){
			swap=false;
			j++;
			for(int i=0;i<arr.length-j;i++){
				if(arr[i]>arr[i+1]){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					swap=true;
				}
			}
			
			
		}
		return arr;
				
		
	}

	private static int[] sortArrayN(int[] arr) {


		boolean swap=true;
		int j=0;
		int temp;
		while(swap){
			swap=false;
			j++;
			for(int i=0;i<arr.length-j;i++){
				if(Math.abs(arr[i])>Math.abs(arr[i+1])){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					swap=true;
				}
			}
			
			
		}
		return arr;
				
		
	}
}
