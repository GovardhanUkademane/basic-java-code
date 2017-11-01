import java.util.*;
class ArrayListDemo{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(getEvenNumbers(arr));
	}
	public static ArrayList<Integer> getEvenNumbers(int[] array){
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> evenList = new ArrayList<>();
		
		for(Integer i:array){
			list.add(i);
		}
		for(Integer o:list){
			if(o%2 == 0){
				evenList.add(o);
			}
		}
		return evenList;
	}
	
}