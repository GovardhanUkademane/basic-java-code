/*
1
121
12321
1234321
123454321

*/
class Sample8{
	public static void main(String[] args){
		
		method(7);
	}
	public static void method(int rows){
		int j = 0;
		for(int i=1;i<=rows;i++){
			for(j=1;j<=i;j++){
				System.out.print(j);
			}
			for(int k =i-1;k>=1;k--){
			  System.out.print(k);	
			}
			System.out.println();
		}
		
	}
}