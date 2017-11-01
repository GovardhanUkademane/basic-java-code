/* 1010101
   0101010
   1010101
   0101010
   1010101
   0101010
   1010101   

*/
class Sample6{
	public static void main(String[] args){
		
		method(7);
	}
	public static void method(int rows){
		int num = 0;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(i%2 == 1){
				  if(i%2==1 && j%2==1){
					System.out.print(1);
				}else{
					System.out.print(0);
				}	
				}else{
					
					if(i%2==0 && j%2==1){
					System.out.print(0);
				}else{
					System.out.print(1);
				}
				}
				
			}
			System.out.println();
		}
	}
}