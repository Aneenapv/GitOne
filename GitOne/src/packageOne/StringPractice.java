package packageOne;

public class StringPractice {
	
	
	public static void main (String args[])
	{
		String name = "Aneena Vincent";
		
		System.out.println("length of a string = "+name.length());

     //split method
		String[] nameSplitArray = name.split("");  //(" ")
		
		for(String splitWords: nameSplitArray )
		{
			System.out.println("split words : "+splitWords);
		}
		
		//charAt
	  char charofString = name.charAt(4);
	  System.out.println("charofString :"+charofString);
		
	  //codePointAt
	  int codePoint = name.codePointAt(2);
	  System.out.println("codePoint : "+codePoint);
	  
	  int codePointBefore = name.codePointBefore(3);
	  System.out.println("code point before :"+codePointBefore);
	  
	  int codePointCount = name.codePointCount(2, 5);
	  System.out.println("code point count :"+codePointCount);
	  
	  //compareTo
	  String s1 = "Aneena";
	  String s2 = "Anee";
	  
	  System.out.println(s1.compareTo(s2));
	  System.out.println(s1.compareToIgnoreCase(s2));
	  
	  //concat
	  
	  System.out.println("concatenation of strings : "+s1.concat(s2));
	  
	  //contains
	  
	  System.out.println("contains : "+s1.contains(s2));
		
	}

}
