import java.io.*;
class RemoveWhiteSpaces{
	public static void main(String[] args) throws IOException{
		//Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string here to remove while spaces");
		String str = br.readLine();
		System.out.println(removeBlanks(str));
	}
	public static String removeBlanks(String str){
		
		String newStr = "";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == ' '){
			    newStr +="";
			}else{
				newStr +=str.charAt(i);
			}
			
		}
		return newStr;
	}
}