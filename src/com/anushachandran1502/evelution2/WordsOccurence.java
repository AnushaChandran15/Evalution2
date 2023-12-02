package com.anushachandran1502.evelution2;

import java.util.HashMap;
import java.util.Map;



import java.util.Scanner;

public class WordsOccurence {
	private void wordsOccurenceOfTheSentance(String sentence)
	{
		 Map<String,Integer> map=new HashMap<String,Integer>();
		 char[] chars=sentence.toCharArray();
		 StringBuilder word=new StringBuilder();
		 for(int i=0;i<=chars.length;i++)
		 {
			 if(i==chars.length || chars[i]==','||chars[i]=='.'|| chars[i]==' ')
			 {
				 	 if(map.containsKey(word.toString()))
				 {
					 map.put(word.toString(), map.get(word.toString())+1);
						
					 
				 }
				 else
				 {
					 map.put(word.toString(), 1);
				 }
					 word=new StringBuilder();
			 }
			 else
			 {
				 word.append(chars[i]);
			 }
		 }
		
System.out.println(map);		
		//int arrayLength=0;
//		int wordsCount=0;
//		for(int i=0;i<sentence.length();i++)
//		{
//			if(sentence.charAt(i)==32||sentence.charAt(i)==',')
//			{
//				arrayLength++;
//			}
//		}
//		sentence=sentence.toLowerCase();
//		String[] words=new String[arrayLength];
//		int j=0;
//		String word="";
//		for(int i=0;i<sentence.length();i++)
//		{
//			if((int)sentence.charAt(i)==32 || (int)sentence.charAt(i)==',')
//			{
//				words[j++]=word;
//				word="";
//			}
//			else
//			{
//				word+=""+sentence.charAt(i);
//			}
//		}
//		System.out.println(Arrays.toString(words));
//		
//		for(int i=0;i<words.length;i++)
//		{
//			wordsCount=0;
//			for(int k=0;k<words.length;k++)
//			{
//				if(words[i].equals(words[k]))
//				{
//					wordsCount++;
//					words[k]="";
//				}
//			}
//			if(!words[i].equals(""))
//			{
			//System.out.println(words[i]+"-"+wordsCount);
			//}
	
//			
	//}
		 
		
	}
	
	public static void main(String[] args) {
		WordsOccurence wordsOccurence=new WordsOccurence();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=scanner.nextLine();
		wordsOccurence.wordsOccurenceOfTheSentance(input);
		scanner.close();
		
	}

}
