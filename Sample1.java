/*
   111111
   111122
   111333
   114444
   155555
   666666
*/
class Sample1{
	
	public static void main(String[] args){
		method(7);
		
	}
	public static void method(int rows){
		int i = 0,j = 0;
		int num = 0;
		for(i=1;i<=rows;i++){
			for(j = rows-1;j>=i;j--){       //j = 6-1 = 5
				System.out.print(1+" ");
			  }
			for(int k = 1;k<=i;k++){       //j = 6-1 = 5
				System.out.print(i+" ");
			  }  
			  System.out.println();
			}
        
		
	}
}