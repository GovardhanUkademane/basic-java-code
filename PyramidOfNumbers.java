class PyramidOfNumbers{
   public static void main(String[] args){
	   printPyramidOfNumbers(5,5);
   }	
   public static void printPyramidOfNumbers(int rows,int colum){
	   int num = 1;
	   for(int i = rows;i>0;i--){
		   for(int j = 1;j<=i;j++){
			   System.out.print(" ");
		   }
		   for(int k = 1;k<=num;k++){
			   System.out.print(num+" ");
		   }
          System.out.println();		 
		 num++;
	   }
	   
   }
}