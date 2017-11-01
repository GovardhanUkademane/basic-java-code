/* 12345
    2345
     345
      45
       5
      45
     345
    2345
   12345	

*/


class Sample3{
	public static void main(String[] args){
		method1(7);
	}
	
	public static void method1(int rows){
		int j=0;
		for(int i = 1;i<=rows;i++){
			//j=i;
			if(i>1){
				for(int k =1;k<=i-1;k++){
				   System.out.print(" ");	
				}
			}
			for( j = i;j<=rows;j++){
				
				System.out.print((j));
			}
		    
			System.out.println();
		}
          
	}
		public static void method2(int rows){
		int j=0;
		for(int i = 1;i<=rows;i++){
			//j=i;
			
			for( j = i;j<=rows;j++){
				System.out.print("*"+" ");
			}
		    for(int k = 1;k<=i-1;k++){
				System.out.print(" ");
			}
			System.out.println();   
		}
	  }
}