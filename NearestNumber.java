import java.util.Scanner;

class NearestNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number");
		int num2 = scan.nextInt();
		System.out.println("Enter the actual number");
		int actualNum = scan.nextInt();
		
		getNearestNum(num1,num2,actualNum);
	}
	public static void getNearestNum(int num1,int num2,int actualNum){
		int diff1 = Math.abs(actualNum - num1);
		int diff2 = Math.abs(actualNum - num2);
		
		if(diff1 <diff2){
			System.out.println("The number nearest is "+num1);
		}else{
			System.out.println("The number nearest is "+num2);
		}
	}
}