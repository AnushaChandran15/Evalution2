package com.anushachandran1502.evelution2;

import java.util.Scanner;

public class WordTwocharactersAppearsOfWordOne {
	
	private boolean wordAppears(String word1,String word2)
	{
		word1=word1.toLowerCase();
		word2=word2.toLowerCase();
		char[] word1Chars=word1.toCharArray();
		String word="";
		outer: for(int i=0;i<word2.length();i++)
		{
			for(int j=0;j<word1Chars.length;j++)
			{
				if(word2.charAt(i)==word1Chars[j])
				{
					word+=""+word2.charAt(i);
					word1Chars[j]=' ';
				}
			}
		}
		return word.equals(word2);
	}

	void print(boolean isformed,String word2)
	{
		if(isformed)
		{
			System.out.println(word2+" can be formed");
		}
		else
		{
			System.out.println(word2+" can not be formed");

		}
	}
	
	
	public static void main(String[] args) {
		WordTwocharactersAppearsOfWordOne obj=new WordTwocharactersAppearsOfWordOne();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Word1");
		String word1=scanner.nextLine();
		System.out.println("Enter a Word2");
		String word2=scanner.nextLine();
		scanner.close();
		obj.print(obj.wordAppears(word1,word2),word2);
		
	
	}

}
