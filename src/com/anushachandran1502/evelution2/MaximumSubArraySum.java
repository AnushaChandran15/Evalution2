package com.anushachandran1502.evelution2;

import java.util.Scanner;

public class MaximumSubArraySum {
	private void maximumSumOfSubArray(int length,int[] array)
	{
		int sum=0;
		int maxSum=Integer.MIN_VALUE;
		int start=0,end=0;
		int left=0,right=array.length-1;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		while(left<right)
		{
			if(array[left]>=array[right])
			{
				sum-=array[right];
				right--;
			}
			else
			{
				sum-=array[left];
				left++;
			}
			if(sum>maxSum)
			{
				maxSum=sum;
				start=left;
				end=right;
			}
		}
		for(int i=start;i<=end;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		MaximumSubArraySum maximumSubArraySum=new MaximumSubArraySum();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Array length");
		int length=scanner.nextInt();
		int[] array=new int[length];
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Index of :" + i);
			array[i]=scanner.nextInt();
		}
		maximumSubArraySum.maximumSumOfSubArray(length,array);
	}

}
