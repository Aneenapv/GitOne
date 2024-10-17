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
		
	  int codePoint = name.codePointAt(2);
	  System.out.println("codePoint : "+codePoint);
		
	}

}
