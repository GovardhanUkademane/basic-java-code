import java.util.Scanner;

class CountWords{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = scan.next();
		System.out.println(getCountOfWords(input));
	}
	public static int getCountOfWords(String str){
		int count = 0;
		
		for(int i= 1;i< str.length();i++){
			
			  if((str.charAt(i-1) == ' ' ) && str.charAt(i) != ' ' )
				++count;
			  	
			
			
		}
		return count;
	}
}