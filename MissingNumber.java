import java.io.*;
class MissingNumber{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input array");
		String input1 = br.readLine();
		String[] arr = input1.split(" ");
		int[] actual = new int[arr.length];
		
		for(int i =0;i<arr.length;i++){
			actual[i] = Integer.parseInt(arr[i]);
		}
		
		System.out.println("Enter the size of the actual input");
		String input2 = br.readLine();
		int size = Integer.parseInt(input2);
		
		missingNumber(actual,size);
		
	}
	
	public static void missingNumber(int[] array,int size){
		int sum = sum(array);
		int actualSum = findSum(size);
		
		int missingNumber = actualSum - sum;
		
        System.out.println("The missing number is :"+missingNumber);		
	}
	
	public static int sum(int[]array){
		int sum = 0;
		for(int i=0;i<array.length;i++){
			sum +=array[i];
		}
		
		return sum;
	}
	
	public static int findSum(int n){
		return (n*(n+1)/2);
	}
}