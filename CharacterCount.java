import java.io.*;
class CharacterCount{
	public static void main(String[] arsg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String input = br.readLine();
		
		getCount(input);
	}
	public static void getCount(String input){
		String str = input.trim();
		int count = 0;
		
		//char ch ='';
		for(int i=0;i < str.length();i++){
			char ch = str.charAt(i);
			count = 0;
			for(int j = 0;j < str.length();j++){
				if(str.charAt(j) == ch){
					count++;
				}
			}
			System.out.println("Count of "+ch+" is :"+count);
		}
	}
}