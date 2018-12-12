package string;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		
		String str="sdfdf  asfasf";
		
		str=reverseString(str);
		
		System.out.println(str);

	}

	private static String reverseString(String str) {
		
		if(str==null || str.length()<=1){
			return str;
		}
		
		return reverseString(str.substring(1))+str.charAt(0);
		
		
	}

}
