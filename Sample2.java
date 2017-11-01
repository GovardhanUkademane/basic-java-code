/*
   1234567
   123456
   12345
   1234
   123
   12 
   1
   12
   123
   1234
   12345
   123456
   1234567
*/
class Sample2{
	
	public static void main(String[] args){
		method(7);
	}
	public static void method(int rows){
		for(int i =rows;i>=1;i--){
			for(int j =1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i = 2;i<=rows;i++){
			for(int j =1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}