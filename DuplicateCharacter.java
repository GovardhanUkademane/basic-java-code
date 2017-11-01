import java.util.Scanner;
class DuplicateCharacter{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String input = scan.next();
	//	StringBuffer format = new StringBuffer(input.replaceAll(" ",""));
		
		System.out.println("Duplicate characters are :"+getDuplicateChar(input));
		
		
	}
	public static String getDuplicateChar(String str){
		String newStr = "";
		boolean flag = false;
		
		for(int i=0;i<str.length();i++){
			flag = false;
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i) == str.charAt(j)){
					flag = true;
					break;
				}else{
					continue;
				}
			}
			if(flag==true){
				newStr +=str.charAt(i);
			}
			
		}
		
		return newStr;
	}
}