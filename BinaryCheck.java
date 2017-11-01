import java.util.Scanner;
class BinaryCheck{
	
	public static void main(String[] args){
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter the number");
	   String input = scan.next();
	   
	   int num = Integer.parseInt(input);
      System.out.println(isBinaryOrNot(num));	   
	}
	public static boolean isBinaryOrNot(int number){
		boolean flag = true;
		int digit = 0;
		
		while(number > 0){
			digit = number % 10;
			
			if(digit > 1){
				flag = false;
				break;
			}else{
				number = number/10;
			}
		}
		
		return flag;
	}
}