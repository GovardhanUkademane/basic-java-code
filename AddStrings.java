import java.io.*;
class AddStrings{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = null;
		String str2 = null;
		
		try{
		   System.out.println("Enter the first string");
		   str1 = br.readLine();
           System.out.println("Enter the second string");
           str2 = br.readLine();
           System.out.println("Strings after swapping are :");
		   addStrings(str1,str2);
           
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void addStrings(String str1,String str2){
		str1 = str1+str2;
		
		str2 = str1.substring(0,str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);
		
	}
	
}