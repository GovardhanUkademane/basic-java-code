import java.util.Scanner;

class BiggerNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = scan.nextInt();
		System.out.println("Enter the second number");
	    int b = scan.nextInt();
         printBiggerNumber(a,b);		
	}
	public static void printBiggerNumber(int a,int b){
		if(a>b && (a-b)>=2){
			System.out.println("a");
		}else if(b>a && (b-a)>=2){
			System.out.println("b");
		}else{
			System.out.println("INCONCLUSIVE");
		}
	}
}