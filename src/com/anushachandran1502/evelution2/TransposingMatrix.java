package com.anushachandran1502.evelution2;

import java.util.Arrays;
import java.util.Scanner;

public class TransposingMatrix {
	private int[][] printTransposingMatrix(int row,int column)
	{
		Scanner scanner =new Scanner(System.in);
		int[][] matrix=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println("Index of:"+"["+ i +"]"+"["+ j +"]");
				matrix[i][j]=scanner.nextInt();
			}
		}
		scanner.close();
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=i+1;j<matrix.length;j++)
			{
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
	return matrix;
		
	}
	public static void main(String[] args) {
		TransposingMatrix transposingMatrix=new TransposingMatrix();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a Row");
		int row=scanner.nextInt();
		System.out.println("Enter a Column");
		int column=scanner.nextInt();
		
		System.out.println(Arrays.deepToString(transposingMatrix.printTransposingMatrix(row,column)));
		
		
	}
	

}
