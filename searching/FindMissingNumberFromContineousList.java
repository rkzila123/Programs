package searching;

public class FindMissingNumberFromContineousList {

	public static void main(String[] args) {
		
		int[] arr={1,2,3,4,5,7,8,9,10};
		int sequenceLastDigit=10;
		
		int missedNumber=findMissedNumber(arr
				,sequenceLastDigit);
		
		System.out.println("Missed number is :"+missedNumber);
	}

	private static int findMissedNumber(int[] arr, int sequenceLastDigit) {
		
		int temp=0;
		for(int i=0;i<arr.length;i++){
			temp=temp+arr[i];
		}
		
		int sumOfNumber=(sequenceLastDigit*(sequenceLastDigit+1))/2;
		
		return sumOfNumber-temp;
	}

}
