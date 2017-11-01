import java.io.*;
import java.text.DecimalFormat;

class PercentageOfCharacters{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			String input = br.readLine();
			getPercentage(input);
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	public static void getPercentage(String str){
		int upper = 0,lower = 0, digits = 0,special = 0;
		
		
		for(int i = 0;i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)){
				upper++;
			}else if(Character.isLowerCase(ch)){
				lower++;
			}else if(Character.isDigit(ch)){
				special++;
			}else {
				digits++;
			}
			
		}
		double total = upper+lower+digits+special;
		
		double upperCase = (upper* 100.0)/total;
		double lowerCase = (lower*100.0)/total;
		double numbers = (special*100.0)/total;
		double specialChars = (digits*100.0)/total;
		
		DecimalFormat formatter = new DecimalFormat("##.##");
		
		System.out.println("Percentage fo Uppercase letters is : "+formatter.format(upperCase));
		System.out.println("Percentage fo Lower letters is : "+formatter.format(lowerCase));
		System.out.println("Percentage fo special letters is : "+formatter.format(numbers));
		System.out.println("Percentage fo digits is : "+formatter.format(specialChars));
		
	}
}