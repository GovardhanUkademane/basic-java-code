import java.io.*;

class CharWordLineCountFile{
	private static BufferedReader br = null; 
		
	public static void main(String[] args){
		File file = null;
		
		try{
			
			
			System.out.println("Enter the file name");
			String name = br.readLine();
			
			file = new File(name);
             br = new BufferedReader(new FileReader(file));
			 
			 getCount(file);
			
		}catch(IOException e){
			e.printStackTrace();
		}

		
		
	}
	
	public static void getCount(File file){
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		try{
		   String currentLine = br.readLine();
		
		while(currentLine != null){
			String[] arr = currentLine.split(" ");
			lineCount++;
			
			  wordCount = wordCount+arr.length;
			  
			  for(String i :arr){
				  charCount = charCount+ i.length();
			  }
			
		    }	
		 }catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
					br.close();
				
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		System.out.println("Character count is: "+" "+charCount);
		System.out.println("Words     count is: "+" "+wordCount);
		System.out.println("Line      count is: "+" "+lineCount);
	}
}