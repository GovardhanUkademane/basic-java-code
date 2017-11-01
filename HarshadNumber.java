import java.util.Scanner;
class HarshadNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int input = scan.nextInt();
		boolean flag = isHarshadNumber(input);
		if(flag){
			System.out.println("The number is a Harshad number");
		}else{
			System.out.println("The number is not a Harshad number");
		}
	}
	public static boolean isHarshadNumber(int number){
		int digit = 0;
		int sum = 0;
		int copy = number;
		
		while(number > 0){
			digit = number % 10;
			sum += digit;
			number = number/10;
		}
		if(copy%sum == 0)
			return true;
		else
			return false;
	}
}