package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesumclosest {
	
	
public int threeSumClosest(int[] num, int target) {
	
	int sum=0;
	int gap=Integer.MAX_VALUE;
	
	
	
	Arrays.sort(num);

	for(int i=0;i<num.length-2;i++)
	{
	    
	    
	   
		int a=i;
		int b=i+1;
		int c=num.length-1;
		while(b<c)
		{
			if(num[a]+num[b]+num[c]-target>0)
			{
				if(Math.abs(num[a]+num[b]+num[c]-target)<gap)
				{
					gap=Math.abs(num[a]+num[b]+num[c]-target);
					sum=num[a]+num[b]+num[c];
				}
				c--;
				
				
				
				
			}
			else if(num[a]+num[b]+num[c]-target<0)
			{
				if(Math.abs(num[a]+num[b]+num[c]-target)<gap)
				{
					gap=Math.abs(num[a]+num[b]+num[c]-target);
					sum=num[a]+num[b]+num[c];
				}
				b++;
				
			}
			else if(num[a]+num[b]+num[c]-target==0)
			{
				gap=0;
				sum=num[a]+num[b]+num[c];
				break;
			}
		}
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	return sum;
	
        
    }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={-3,-6,2,3,6,7,3,6,3,2};
		
		Threesumclosest tsc=new Threesumclosest();
		System.out.println(tsc.threeSumClosest(num, 100));

	}

}
