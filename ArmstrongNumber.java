import java.util.Scanner;

class ArmstrongNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number to check for its Armstrong nature");
		String input = scan.next();
		boolean status = isArmStrongOrNot(input);
		if(status == true){
			System.out.println(input+" is an Armstrong number");
		}else{
			System.out.println(input+" is not an Armstrong number");
		}
		
	}
	public static boolean isArmStrongOrNot(String str){
		int number = Integer.valueOf(str);
		str = Integer.toString(number);
		
		int digits = str.length();
		int num = Integer.parseInt(str);
		int digit = 0;
		int copy = num;
		int sum = 0;
		
		while(num > 0){
			digit = num%10;
			int digitToPower = 1; 
			for(int i=0;i<digits;i++){
				digitToPower = digitToPower * digit;
			}
			sum +=  digitToPower;
			num = num/10;
		}
		if(sum == copy)
			return true;
		else
			return false;
	}
	public static int power(int digit,int power){
		return digit ^ power;
	}
}