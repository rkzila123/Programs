package searching;

public class SmallestAlphabetGreaterThanGivenCharacter {

	public static void main(String[] args) {
		
		char[] character={'d','g','l','r','u'};
		
		char needtoFind='u';
		
		//int index=binarySearch(character,0,character.length-1,needtoFind);
		int value=findSmallestAphabetGreaterThanGivenChar(character,needtoFind);
		if(value==0){
			System.out.println("Smallest Aphabet Greater Than Given Character is:"+character[0]);
		}else{
			System.out.println("Smallest Aphabet Greater Than Given Character is:"+character[value]);
		}
		/*if(index==-1){
			int value=findSmallestAphabetGreaterThanGivenChar(character,needtoFind);
			if(value==0){
				System.out.println("Smallest Aphabet Greater Than Given Character is:"+character[0]);
			}else{
				System.out.println("Smallest Aphabet Greater Than Given Character is:"+character[value]);
			}
		}else{
			System.out.println("Character present at index :"+index);
		}*/

	}

	private static int findSmallestAphabetGreaterThanGivenChar(char[] character, char needtoFind) {
		
		if((int)needtoFind >= (int)character[character.length-1]){
			return 0;
		}else{
		
		for(int i=0 ;i<character.length;i++){
			if((int)needtoFind < (int)character[i]){
				return i;
			}
		}
		}
		return -1;
		
	}

	/*private static int binarySearch(char[] character, int radius, int length, char needtoFind) {
		
		if(length>=radius){
		int mid=radius+(length-radius)/2;
				
		if((int) character[mid]==(int) needtoFind){
		
			return mid;
		}
		if((int) character[mid]>(int) needtoFind){
			return binarySearch(character,0,mid-1,needtoFind);
		}else{
			return binarySearch(character,mid+1,length,needtoFind);
		}
		
		
		}
		return -1;
	}*/

}
