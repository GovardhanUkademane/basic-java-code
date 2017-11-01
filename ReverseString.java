import java.io.*;
class ReverseString{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the string here");
		String input = br.readLine();
		System.out.println(reverseTheString(input));
		
	}
	
	public static String reverseTheString(String str){
		String newStr = "";
		String[] arr = str.split(" ");
		
		for(int j=0;j<arr.length;j++){
		   String a = arr[j];
		   for(int i=a.length()-1;i>=0;i--){
			  newStr += a.charAt(i);	
		
		   }
           	newStr +=" ";	   
		}
		
		return newStr;
	}
	
	
}