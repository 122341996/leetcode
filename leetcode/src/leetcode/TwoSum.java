package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
	
	 public int[] twoSum(int[] numbers, int target) {
		 int[] res=new int[2];
		 
		 HashMap<Integer,Integer> numset=new HashMap<Integer,Integer>();
		 
		 for(int i=0;i<numbers.length;i++)
		 {
			 numset.put(numbers[i],i);
		 }
		 for(int i=0;i<numbers.length;i++)
		 {
			 int temp=target-numbers[i];
			 
			 Integer index=numset.get(temp);
			 
			 if(index!=null)
			 {
				 if(i!=index)
				 {
				 res[0]=i+1;
				 res[1]=index+1;
				 
//				 numset.remove(numbers[i]);
//				 numset.remove(numbers[index]);
//				 System.out.println(res[0]+","+res[1]);
//				 
				 }
				 
			 }
		 }
		 
		 
		 
		 
		 
		 return res;
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={3,2,4,5,7,9};
		TwoSum ts=new TwoSum();
		int[] res=ts.twoSum(numbers, 12);
		//System.out.println(res[0]+","+res[1]);

	}

}
