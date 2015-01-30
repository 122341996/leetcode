package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	
	 static List<List<Integer>> result=new ArrayList<List<Integer>>();
	 
	
	 public List<List<Integer>> permute(int[] num) {
		 
		
		 List<Integer> restnum=new ArrayList<Integer>();
		 List<Integer> sortnum=new ArrayList<Integer>();
		 for(int i=0;i<num.length;i++)
		 {
			 restnum.add(num[i]);
		 }
		 

		 for(int i=0;i<restnum.size();i++)
		 {

			 sortnum.add(restnum.get(i));
			 
			 List<Integer> temprestnum=new ArrayList<Integer>();
			 
			 for(int j=0;j<restnum.size();j++)
			 {
				 if(j!=i)
				 {
					 temprestnum.add(restnum.get(j)); 
				 }
				 
			 }
			 	 
			 allsort(sortnum,temprestnum);
			 sortnum.remove(sortnum.size()-1);

			 
			 
		 }

		return result;
	        
	    }
	 public void allsort(List<Integer> sortnum,List<Integer> restnum)
	 {
		 
		 if(restnum.size()==0)
		 {
			 
			 
			 List<Integer> newsortnum=new ArrayList<Integer>();
			 
			 for(int i=0;i<sortnum.size();i++)
			 {
				 newsortnum.add(sortnum.get(i));
			 }
			 
			 
			 result.add(newsortnum);	
			 

			 return;
		 }
		 else
		 {
			 for(int i=0;i<restnum.size();i++)
			 {
				 sortnum.add(restnum.get(i));
				 
				 List<Integer> temprestnum=new ArrayList<Integer>();
				 
				 for(int j=0;j<restnum.size();j++)
				 {
					 if(j!=i)
					 {
						 temprestnum.add(restnum.get(j)); 
					 }
					 
				 }
				 	 
				 allsort(sortnum,temprestnum);
				 
				 sortnum.remove(sortnum.size()-1);
				 
				 
			 }
		 }
		
		 
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num={0,1};

		Permutations p=new Permutations();
		List<List<Integer>> result=p.permute(num);
		System.out.println("print result");
		for(int i=0;i<result.size();i++)
		{
			List<Integer> temp=result.get(i);
			for(int j=0;j<temp.size();j++)
			{
				System.out.print(temp.get(j));
			}
			System.out.print("\n");
		}
		
		
		
		

	}

}
