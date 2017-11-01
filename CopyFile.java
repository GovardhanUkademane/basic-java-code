import java.util.*;
import java.io.*;
class CopyFile{
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the source file");
		String src = scan.next();
		System.out.println("Enter the destination file");
		String dest = scan.next();
		
		copyFileToAnother(src,dest);
	}
	public static void copyFileToAnother(String file1,String file2) throws IOException{
		File src = new File(file1);
	
		FileInputStream input = new FileInputStream(file1);
		File dest = new File(file2);
	
		FileOutputStream output = new FileOutputStream(file2);
		
		byte[] buffer = new byte[1024];
		int length = buffer.length;
		
		while((length = input.read(buffer)) != -1){
			output.write(buffer,0,length);
		}
		
		
	//	input.close();
		output.close();
	}
}