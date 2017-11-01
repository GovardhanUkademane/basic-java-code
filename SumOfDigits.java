import java.util.Scanner;
class SumOfDigits{
	public static void main(String[] args){
	  Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number");
      String input = scan.next();
      int num = Integer.parseInt(input);
      System.out.println("Sum of the digits of"+num+" is"+getSum(num));
	  scan.close();
	}
	public static int getSum(int num){
		int sum = 0;
		int digit = 0;
		try{
		  while(num > 0){
			digit = num % 10;
			sum +=digit;
			num = num/10;
		 }	
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		
		return sum;
	}
}