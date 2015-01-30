package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class LongestConsecutiveSequence {
	
public int longestConsecutive(int[] num) {
	int length=0;
	int max=0;
	HashMap<Integer,Boolean> flagmap=new HashMap<Integer,Boolean>();
	for(int i=0;i<num.length;i++)
	{
		flagmap.put(num[i], false);
	}
	
	for(int i=0;i<num.length;i++)
	{
		if(flagmap.get(num[i]))
		{
			continue;
		}
		else
		{
			boolean left=true;
			int leftnum=num[i]-1;
			length=1;
			flagmap.put(num[i], true);
			while(left)
			{
				Boolean tempflag=flagmap.get(leftnum);
				if(tempflag!=null)
				{	
					length++;
					flagmap.put(leftnum, true);
					leftnum--;
					
				}
				else
				{
					left=false;	
				}
			}
			boolean right=true;
			int rightnum=num[i]+1;
			while(right)
			{
				Boolean tempflag=flagmap.get(rightnum);
				if(tempflag!=null)
				{	
					length++;
					flagmap.put(rightnum, true);
					rightnum++;
					
				}
				else
				{
					right=false;
				}
			}
			
			max=Math.max(max, length);
			
			
			
			
		}
		
	}
	
	return max;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={1,2,4,3,7,6,5,9,10,1,1,2};
		LongestConsecutiveSequence lcs=new LongestConsecutiveSequence();
		System.out.println(lcs.longestConsecutive(num));

	}

}
