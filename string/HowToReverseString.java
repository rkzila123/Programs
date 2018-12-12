package string;

public class HowToReverseString {

	public static void main(String[] args) {
		
		String str="dsjkfjkh";
		
		char[] chArray=str.toCharArray();
		
		StringBuffer sbuffer= new StringBuffer();
		
		for(int i=chArray.length-1;i>=0;i--){
			sbuffer.append(chArray[i]);
		}

		System.out.println(sbuffer.toString());
	}

}
