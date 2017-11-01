import java.util.Scanner;
import java.io.*;

class ReplaceStringInFile{
   
   public static void main(String[] args) throws IOException{
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter the file name");
	String inputFile = scan.next();
	File file = new File(inputFile);
	System.out.println("Enter the string to be replaced");
	String oldString = scan.next();
	System.out.println("Enter the new string");
	String newString = scan.next();
	
	replaceString(file,oldString,newString);
	
   }
   
   public static void replaceString(File file,String oldString,String newString) throws IOException{
	   BufferedReader br = null;
	   FileWriter writer = null;
	   
	   String oldContent = "";
	   String path ="";
	   try{
		   br = new BufferedReader(new FileReader(file));
		   String line = br.readLine();
	      
		   while(line != null){
		   
		   oldContent = oldContent+line+System.lineSeparator();
		   line = br.readLine();
	       }
	      String newContect = oldContent.replaceAll(oldString,newString);
		  writer = new FileWriter(file);
		  writer.write(newContect);
		  
		  
		  
	   }catch(IOException e){
		   e.printStackTrace();
	   }finally{
		   br.close();
		   writer.close();
	   }  
	      
	   
   }
}