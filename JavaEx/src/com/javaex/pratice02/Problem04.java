package com.javaex.pratice02;

public class Problem04 {
	public static void main(String[] args)
	{
		int[] num = new int[6];
		int count = 0;
		
		while (count < num.length) 
		{
    		int temp = (int)(Math.random() * 45) + 1;
    		boolean check = false;
    		if( count == 0)
    		{
    			num[count] = temp;
        		count++;
    		}
    		else
    		{
 
	    		for(int i=0; i<count;i++)
	    		{
	    			if(num[i] == temp)
	    			{
	    				check = true;
	    				break;
	    			}
	    		}
	    		if(!check)
	    		{
	        		num[count] = temp;
	        		count++;
	    		}
    		}
    }
    
    for(int i : num)
    {
        System.out.print(i + "  ");
    }
    System.out.println();
}
}
