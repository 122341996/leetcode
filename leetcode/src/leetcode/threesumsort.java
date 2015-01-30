package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class threesumsort {
	

	
	
	public List<List<Integer>> threeSum(int[] num) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		//HashSet<String> resset = new HashSet<String>();
			
		Arrays.sort(num);
//		for(int i=0;i<num.length;i++)
//		{
//			System.out.println(num[i]);
//		}
		for(int i=0;i<num.length-2;i++)
		{
		    
		    if (i == 0 || num[i] > num[i - 1]) {
		    
		    if(num[i]>0)
		    break;
			int a=i;
			int b=i+1;
			int c=num.length-1;
			while(b<c)
			{
				if(num[a]+num[b]+num[c]>0)
				{
					c--;
				}
				else if(num[a]+num[b]+num[c]<0)
				{
					b++;
				}
				else if(num[a]+num[b]+num[c]==0)
				{
					

						List<Integer> ares=new ArrayList<Integer>();
						ares.add(num[a]);
						ares.add(num[b]);
						ares.add(num[c]);
						res.add(ares);
						
						while(b<c&&num[b]==num[b+1])
						b++;
						while(b<c&&num[c]==num[c-1])
						c--;

						b++;
						c--;

				
					
				}
			}
			
			
		}
		}
		
	
		return res;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={-3,-6,2,3,6,7,3,6,3,2};
		threesumsort tss=new threesumsort();
		tss.threeSum(num);

	}

}
