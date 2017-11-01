class Sample{
	public static void main(String[] args){
		
		invertedPyramid(13);
	}
	public static void invertedPyramid(int rows){
		rows = rows/2+1;
		
		for(int i =1;i<=rows;i++){
			for(int j = 1;j<=i;j++){
				System.out.print((j)+" ");
			}
			System.out.println();
			
		}
		for(int i =rows-1;i>=1;i--){
			for(int j = 1;j<=i;j++){
				System.out.print((j)+" ");
			}
			System.out.println();
			
		}
		
		
		
	}
	public static void printFloydIdentical(int rows){
		for(int i=1;i<rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void printDecresingInvertedTri(int rows){
		int num = 0;
		for(int i=1;i<=rows;i++){
			num = 0;
			for(int j=rows;j>=i;j--){
				System.out.print((++num)+" ");
			}
			System.out.println();
		}
		
	}
	public static void printInvertedTri(int rows){
		int num = 0;
		for(int i =1 ;i<=rows;i++){
			num = rows;
			for(int j = 1;j<=i;j++){
				
				System.out.print((num--)+" ");
			}
			System.out.println();
		}
		
	}
	public static void decreasingTriangle(int rows){
		for(int i = 1 ;i<=rows ;i++){
			for(int j = rows;j>=i;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void floyd(int rows, int column){
		int num = 0;
		for(int i = 0;i<rows;i++){
			for(int j=0;j<=i;j++){
				System.out.print(++num+" ");
			}
			System.out.println();
		}
		
	}
	public static void increasingTriangle(int rows){
		for(int i = 1;i<=rows;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void palindrome(int number){
		int digit = 0 , rev = 0, copy = number;
		
		while(number != 0){
			digit = number % 10;
			rev = rev * 10 + digit;
			number = number / 10;
		}
		if(rev == copy){
			System.out.println("Is palindrome");
		}else{
			System.out.println("Not a palindrome");
		}
		
	}
	public static String printPrimes(int n1,int n2){
		String str ="";
		boolean flag = false;
		
		for(int i=n1;i<=n2;i++){
			if(i == 1)
				continue;
			flag = true;
			for(int j=2;j<i;j++){
				if(i % j == 0){
					flag = false;
				}
			}
			if(flag == true)
				str +=i+" ";
		}
		return str;
	}
	public static void primeCheck(int number){
       boolean flag = false;
	   
	   for(int i=2;i<number;i++){
		   if(number % i == 0){
			   flag = false;
			 break;
		   }else{
			   flag = true;
		     break;
		   }
		   
		}
	   
	   if(flag == true)
		   System.out.println("Is a prime");
	   else
		   System.out.println("Is not prime");
	   }
	   
	
}