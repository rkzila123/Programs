package string;

public class HowToCheckIfAStringContainsOnlyDigits {

	public static void main(String[] args) {


		String str="234534";
		
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			if(Character.isLetter(ch[i])){
				System.out.println("String contains alphabets also ");
				break;
			}
		}

	}

}
