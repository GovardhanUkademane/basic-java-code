import java.util.*;
class CommonElements{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the first array");
		int s1 = scan.nextInt();
		String[] str1 = new String[s1];
		System.out.println("Enter the array elements");
		for(int i=0;i<str1.length;i++){
			str1[i] = scan.next();
		}
		System.out.println("Enter the size of the second array");
		int s2 = scan.nextInt();
		String[] str2 = new String[s2];
		System.out.println("Enter the array elements");
		for(int j=0;j<s2;j++){
			str2[j] = scan.next();
		}
		getCommonElements(str1,str2);
		
	}
	public static void getCommonElements(String[] str1, String[] str2){
		Set<String> common = new HashSet<String>();
		
		for(int i=0;i<str1.length;i++){
			for(int j=0;j<str2.length;j++){
				if(str1[i].equals(str2[j])){
					common.add(str1[i]);
				}
			}
		}
		System.out.println("Common elements are: "+common);
	}
}