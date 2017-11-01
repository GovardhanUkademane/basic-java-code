class Pyramid{
	public static void main(String[] args){
		printPyramid(5,5);
		printInvertedPyramid(5,5);
	}
	public static void printPyramid(int rows,int col){
		for(int i=1;i<=rows;i++){
			for(int j = 1;j<=rows-i;j++){
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	public static void printInvertedPyramid(int rows,int col){
		for(int i=rows;i>=1;i--){
			
			for(int k = 1;k<=i;k++){
				System.out.print("*"+" ");
			}
			for(int j = rows-i;j>=1;j--){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}