import java.util.Scanner;
class AmbicablePair{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scan.nextInt();
	    System.out.println("Enter the second number");
		int num2 = scan.nextInt();
		boolean  flag = isAmbicablePair(num1,num2);
		
		if(flag == true){
			System.out.println("Is Ambicable pair");
		}else{
			System.out.println("Not an Ambicable pair");
		}
		
	}
	
	public static boolean isAmbicablePair(int num1, int num2){
		boolean flag = false;
		int sum1 = 0, sum2 = 0;
		
		for(int i = 1;i<num1;i++){
			if(num1 % i == 0){
				sum1 +=i;
			}
		}
		if(num2 == sum1){
		    for(int i = 1;i<num2;i++){
		     	if(num2 % i == 0){
				sum2 +=i;
			}
		  }	
		}else{
			flag = false;
		}
		
		if(sum2 == num1 && sum1 == num2){
				flag = true;
			}else{
				flag = false;
			}
			
		return flag;
	}
}