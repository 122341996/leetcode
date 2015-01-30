package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
public String getPermutation(int n, int k) {
	String res="";
	List<Integer> list=new ArrayList<Integer>();
	k=k-1;
	for(int i=1;i<n+1;i++)
	{
		list.add(i);
	}
	for(int i=n;i>0;i--)
	{
		int sum=1;
		for(int j=1;j<i;j++)
		{
			sum=sum*j;
		}
		
		int a=k/sum;
		k=k%sum;
		//System.out.println(list.get(a));
		res+=String.valueOf(list.get(a));
		list.remove(a);
		
		
		
	}
	
	
	
	System.out.println(res);
	return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationSequence ps=new PermutationSequence();
		ps.getPermutation(3, 1);

	}

}
