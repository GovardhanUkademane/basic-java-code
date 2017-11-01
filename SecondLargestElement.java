import java.util.Scanner;
class SecondLargestElement{
	public static void main(String[] arsg){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size intput array");
		String inputSize = scan.next();
		int size = Integer.parseInt(inputSize);
		int[] arr = new int[size];
		System.out.println("Enter the array elements");
		for(int i= 0 ;i< size;i++){
			arr[i] = scan.nextInt();
		}
		System.out.println("Second largest element of in the array is : "+getSecondLargest(arr));
	}
	
	public static int getSecondLargest(int[] arr){
		int firstLargest = 0;
		int secondLargest = 0;
		
		if(arr[0] > arr[1]){
			firstLargest = arr[0];
			secondLargest = arr[1];
		}else{
			firstLargest = arr[1];
			secondLargest = arr[0];
		}
		for(int i=2;i<arr.length;i++){
			
			if(arr[i]>firstLargest){
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}else if(arr[i] < firstLargest && arr[i] > secondLargest){
				secondLargest = arr[i];
			}
		}
		return secondLargest;
		
	}
}