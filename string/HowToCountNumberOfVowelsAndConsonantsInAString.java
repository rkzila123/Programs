package string;

public class HowToCountNumberOfVowelsAndConsonantsInAString {

	public static void main(String[] args) {
		
		String str="sdfasdfkji  ehdkalnfl&*^";
		str= str.toUpperCase();
		
		char[] ch=str.toCharArray();
		
		int vowelCount=0; 
		int consCount=0;
		int specialAndSpaceCount=0;
		
		
		for(int i=0;i<ch.length;i++){
			
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
				vowelCount=vowelCount+1;
			}else if(Character.isAlphabetic(ch[i])){
				consCount=consCount+1;
			}else{
				specialAndSpaceCount=specialAndSpaceCount+1;
			}
		}
		
		System.out.println("Total Vowel is :"+ vowelCount + " And Consonents count is :"+ consCount);
		System.out.println("Other than vowel count is :" +specialAndSpaceCount);

	}

}
