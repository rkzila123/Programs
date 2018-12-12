package searching;

public class FindMaximumElementInArrayFirstIncreasingThenDecreasing {

	public static void main(String[] args) {
		
	int	arr[] = {8, 10, 20, 80, 100, 200, 400, 3, 2, 1};
	
	for(int i=0;i<arr.length;i++){
		if(arr[i]>arr[i+1]){
			System.out.println(arr[i]);
			break;
		}
	}

	}

}
