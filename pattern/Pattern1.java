package pattern;

public class Pattern1 {

	public static void main(String[] args) {

		 /*
				 *
				 **
				 ***
				 ****
				 *****
				 ******
		 */

		
		  for(int i=1;i<=6;i++)
		  { 
		  for(int j=1;j<i;j++)
		  { 		  
		  System.out.print("*");		  
		  }
		  System.out.println("*");
		  }
		  
		 	
		
		
		 /*
					 ******
					  *****
					   ****
					    ***
					     **
					      *
		 */
		
		 int a=1;
		 for(int i=1;i<=7;i++){
			 for(int j=1;j<=7;j++){
				 if(a>=j){
					 if(i!=j){
					 System.out.print(" ");
					 }
				 }else{
					 System.out.print("*"); 
				 }
			 }
			 a=a+1;
			 System.out.println();
		 }
		 
		 /*
						 *
						**
					   ***
					  ****
					 *****
					******
					
		 */
		 
		 
		 int abc=6;
		 for(int i=1;i<=6;i++){
			 for(int j=1;j<=6;j++){
				 if(a>j){
					 System.out.print(" ");
				 }else{
					 System.out.print("*");
				 }
			 }
			 abc=abc-1;
			 System.out.println();
		 }
		 
		 
		 

		/*
					 ******
					 *****
					 ****
					 ***
					 **
					 *
		 */

		
		  for(int i=6;i>=1;i--)
		  {
		   for(int j=1;j<i;j++)
		   {
		    System.out.print("*"); 
		   }
		  System.out.println("*");
		   }
		 

		/*
		
				  * * * * * * *
				    * * * * *
				      * * *
				        *
		 */
		  
		
		int p = 0;
		int q = 7;
		for (int j = 1; j <= 7; j++) {
			for (int i = 1; i <= 7; i++) {

				if (i <= p) {
					System.out.print(" ");
					System.out.print(" ");

				} else {

					if (i <= q) {
						System.out.print(" ");
						System.out.print("*");
					}
				}

			}

			p = p + 1;
			q = q - 1;
			System.out.println();
		}
		 
		/*
					    *
				      * * * 
				    * * * * *
				  * * * * * * *
				* * * * * * * * *
		*/
		 
		 
		int aa=1 , b=9;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				
				if(j<=b/2){
					 System.out.print(" ");
				 }else{
					if(j<=b/2+aa){
					 System.out.print("*");
					}
					 
				 }
			}
			
			aa=aa+2;
			b=b-2;
			System.out.println();
		}
		
		/*	
					
					    *
				      * * * 
				    * * * * *
				  * * * * * * *
				* * * * * * * * *
				  * * * * * * *
				    * * * * *
				      * * *
				        *
					
		 */
		
		int aaa=1; 
		int bbb=9;
		int ppp =-4;
		int qqq =13;
		for(int i=1;i<=9;i++){
			
			for(int j=1;j<=9;j++){
				if(i<=9/2+1){
				if(j<=bbb/2){
					 System.out.print(" ");
				 }else{
					if(j<=bbb/2+aaa){
					 System.out.print("*");
					}
					 
				 }
				}else{
					if (j <= ppp) {
						System.out.print(" ");

					} else {

						if (j <= qqq) {
							System.out.print("*");
						}
					}
					
					
				}
				
			}
			aaa=aaa+2;
			bbb=bbb-2;
			ppp = ppp + 1;
			qqq = qqq - 1;
			System.out.println();
			
		}
	}

}
