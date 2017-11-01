import java.util.*;
class ArrayEquality{
	public static void main(String[] args){
		int[] a1 = {2,1,4,6,9};
		int[] a2 = {1,2,4,6,9};
		
		System.out.println(getEquality(a1,a2));
		
	}
/*	public static boolean getEquality(int[] array1, int[] array2){
		boolean flag = true;
		
		if(array1.length == array2.length){
			for(int i=0;i<array1.length;i++){
				if(array1[i] != array2[i]){
					flag = false;
				}
			}
			
		}else{
			flag = false;
		}
		
			if(flag == true)
				return true;
			else
				return false;
		
	}
*/	
/*	public static boolean getEquality(int[] array1, int[] array2){
		if(Arrays.equals(array1,array2))
			return true;
		else
            return false;			
		
	}
*/	
	public static boolean getEquality(int[] array1, int[] array2){
		Arrays.sort(array1);
	    Arrays.sort(array2);
		if(Arrays.equals(array1,array2))
			return true;
		else
            return false;			
		
	}
}