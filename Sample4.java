/*  1
    10
	101
	1010
	10101
    101010
	1010101
*/

class Sample4{
	
	public static void main(String[] args){
		method(7);
	}
	public static void method(int rows){
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				if(j%2 == 1){
					System.out.print(1+" ");
				}else{
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
		
	}
}