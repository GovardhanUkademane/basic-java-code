/*
  1
  2 6
  3 7 10
  4 8 11 13
  5 9 12 14 15
  
*/
class Sample7{
	
	public static void main(String[] args){
		method(5);
	}
	
	public static void method(int rows){
	     int num = 0;
		for(int i=1;i<=rows;i++){
			num = i;
			for(int j=1;j<=i;j++){
					
					System.out.print(num+" ");
				num = num+rows-j;
				}
			
			System.out.println();
		}
	}
	
} 