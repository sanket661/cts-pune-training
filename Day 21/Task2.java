package com.sanket;

public class Task2 {

	public static void main(String...args)
	{
		int Maphne[]=new Maphne[];
		
		
		
		
	}	
	public int isDaphne(int [] a)
    {
        boolean isEven = false, isOdd = false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                isEven = true;
            }
            else
            {
                isOdd = true;
            }
        }
       
        if(isEven && isOdd)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
