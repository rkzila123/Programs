package searching;

import java.util.Scanner;

public class NumberOfOccurenceinArray {

	public static void main(String[] args) {
		
		int[] arr={1,14,13,12,15,20,15,12,13,12};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int valueNeedtoFind=sc.nextInt();
		int temp=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==valueNeedtoFind){
				temp=temp+1;
			}
		}
		
		if(temp==0)
		System.out.println("Value doesn't exist in Array");
		else{
			System.out.println("Value present "+ temp +" times");
		}
			

	}

}
