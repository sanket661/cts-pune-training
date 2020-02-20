package com.sanket;



public class SelectionSort {
   public static void main(String...args)
   {
	   String[] str= {"Neena", "Meeta", "Geeta", "Reeta", "Seeta"};

	   System.out.println("string before Sorting: ");
	   
	   System.out.println(str);
	   Sort(str);
	   System.out.println("string after Sorting: ");
   }
   public static void Sort(String[] str)
   {   int i,j;
	   int n=str.length;
	   for(i=0;i<n-1;i++)
	   {
		   int index=i;
		   for(j=i+1;j<n;j++)
           {
        	  if(str[j].compareTo(str[index])<0)
        	          index=j;
           }
		   String temp=str[index];
		   str[index]=str[i];
		   str[i] = temp;
		   
		   
	       }
      } 
   }
