import java.util.Arrays;
import java.util.HashSet;
class UniAndInterOfArrays{
	
	public static void main(String[] args){
	    Integer[] inputArray1 = {2, 3, 4, 7, 1};   
        Integer[] inputArray2 = {4, 1, 3, 5};
        Integer[] inputArray3 = {8, 4, 6, 2, 1};
        Integer[] inputArray4 = {7, 9, 4, 1};
	   
	   getIntersection(inputArray1,inputArray2,inputArray3,inputArray4);
	   
	}
	
	public static void getUnion(Integer[] ...arr){
		
		HashSet<Integer> unionSet = new HashSet<Integer>();
		
		for(Integer[] input:arr){
			for(int i:input){
				unionSet.add(i);
			}
		}
		System.out.println(unionSet);
	}
	public static void getIntersection(Integer[] ...arr){
		
		
		 HashSet<Integer> intersectionSet = new HashSet<>(Arrays.asList(arr[0]));
         
        //Calling retainAll() method of first object by passing 2nd, 3rd, 4th... objects
         for (int i = 1; i < arr.length; i++)
        {
            HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(arr[i]));
             
            intersectionSet.retainAll(set);
        }
		System.out.println(intersectionSet);
	}
}