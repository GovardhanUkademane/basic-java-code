/* 0000000
   0100000
   0020000
   0003000
   0000400
   0000050
   0000006
*/
class Sample5{
	public static void main(String[] args){
		
		method(7);
	}
	public static void method(int rows){
		int num = 0;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(i ==j){
					System.out.print((num++));
				}else{
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}