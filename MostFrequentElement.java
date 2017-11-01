import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class MostFrequentElement{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		int[] input = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++){
			input[i] = scan.nextInt();
		}
	    getFrequentElement(input);
	}
	public static void getFrequentElement(int[] arr){
		HashMap<Integer,Integer> inputMap = new HashMap<Integer,Integer>();
		
		for(int i:arr){
			if(inputMap.containsKey(i)){
				inputMap.put(i,inputMap.get(i)+1);
			}else{
				inputMap.put(i,1);
			}
		}
		int element = 0;
		int frequent = 1;
		
		Set<Entry<Integer,Integer>> setEntry = inputMap.entrySet();
		
		   for(Entry<Integer,Integer> entry:setEntry){
			   if(entry.getValue()> frequent){
				 element = entry.getKey();
                 frequent = entry.getValue();				 
			   }
		   }
		System.out.println("The frequent element is :"+" "+element);
		System.out.println("The count is :"+" "+frequent);
	}
}