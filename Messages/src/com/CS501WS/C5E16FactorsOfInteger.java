package com.CS501WS;

public class C5E16FactorsOfInteger {

	public static void main(String[] args) {
		  {   
			    int C=346;
			    int x = C;
			    int a = 0;
				for (int i = 2; i<=C; i++) 
			    {   
					//System.out.println(i);
			        while (x % i == 0) 
			        {
				      x = x / i;
				      System.out.print(i + " "); 
			        }
			        //System.out.println(a);
			        
			    }
		  }
	}
}
