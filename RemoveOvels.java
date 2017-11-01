import java.util.Scanner;
class RemoveOvels{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string here");
		String input = scan.next();
		System.out.println("String after removing ovels is :"+" "+removeOvels(input));
		
	}
/*	
	public static String removeOvels(String str){
		String newStr = "";
		char ch[] = {'a','e','i','o','u'};
		
		for(int i=0;i<str.length();i++){
			if((str.charAt(i) == 'a')|(str.charAt(i) == 'e')|(str.charAt(i) == 'i')|(str.charAt(i) == 'o')|(str.charAt(i) == 'u')){
				newStr +=" ";
			}else{
				newStr +=str.charAt(i);
			}
		}
		return newStr;
	}
  
  */	
 /*	public static String removeOvels(String str){
		String newStr = "";
		char ch[] = {'a','e','i','o','u','A','E','I','O','U'};
		boolean flag= false;
		
		for(int i=0;i<str.length();i++){
			flag = false;
			for(int j=0;j<ch.length;j++){
              if(str.charAt(i) == ch[j]){
				flag = true;
				break;
			  }else
                flag = false;				  
			   
			}
			if(flag == true){
				newStr +=" ";
			}else{
				newStr += str.charAt(i);
			}
			
		}
		return newStr;
	}
*/
  	public static String removeOvels(String str){
		
		String newStr = str.replaceAll("[AEIOUaeiou]"," ");
		
		return newStr;
	}
}