class RotatedStrings{
	public static void main(String[] args){
		String s1 = "SpringsHibernate";
		String s2 = "HibernateSprings";
		
		System.out.println(rotatedOrNot(s1,s2));
	}
	public static boolean rotatedOrNot(String str1,String str2){
		String s3 = "";
		if(str1.length() == str2.length()){
			s3 = str2+str2;
		}
		
		if(s3.contains(str1))
			return true;
		else
			return false;
	}
}