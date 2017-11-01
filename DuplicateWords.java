import java.util.Scanner;
import java.util.*;
class DuplicateWords{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();
		System.out.println("Enter the elements of the array");
		String[] input = new String[size];
		for(int i=0;i<size;i++){
			input[i] = scan.next();
		}
		getDuplicates(input);
		
	}
/*	public static void getDuplicates(String[] str){
		
		String duplicates = "";
		
		for(int i=0;i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				if(str[i].equals(str[j]) && (i != j)){
					duplicates +=str[i]+", ";
				}
			}
		}
		System.out.println("Duplicate words are/is: "+duplicates);
		
	}
*/	
	public static void getDuplicates(String[] str){
		Set<String> noDuplicates = new HashSet<>();
		Set<String> duplicates = new HashSet<>();
		for(String s:str){
			if(! noDuplicates.add(s)){
				duplicates.add(s);
			}else{
				noDuplicates.add(s);
			}
		}
		
		
		System.out.println("Not Duplicate words are/is: "+noDuplicates);
		System.out.println("Duplicate words are/is: "+duplicates);
		
	}
}