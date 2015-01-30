package leetcode;

import java.util.Arrays;

/**
 * @author xhb
 *
 */
public class NextPermutation {
	
	 public void nextPermutation(int[] num) {
		 boolean bin=false;
		 if(num.length<2)
			 return;
		 else
		 {
			 int changeindex=num.length-1;
			 for(int i=num.length-1;i>0;i--)
			 {
				 if(num[i-1]<num[i])
				 {
					 changeindex=i-1;
					 bin=true;
					 break;
					 
				 }
					 
			 }
			 System.out.println(changeindex);
			 if(!bin)
			 {
				 swap(num, 0, num.length);
				 return;
			 }
			 else if(changeindex!=num.length-1)
			 {
				 swap(num, changeindex+1, num.length);
				 
				 for(int i=0;i<num.length;i++)
					{
						System.out.print(num[i]+",");
					}
				 System.out.print("\n");
				 
				 for(int i=changeindex+1;i<num.length;i++)
				 {
					 if(num[changeindex]<num[i])
					 {
						 int temp=num[i];
						 num[i]=num[changeindex];
						 num[changeindex]=temp;
						 break;
					 }
				 }
				 
			 }
			
			 
		 }
		
		 
		 
	        
	    }
	
	
	 public void swap(int[] num,int start,int end){
		 
		 for(int i=start;i<(start+end)/2;i++)
		 {
			 int temp=num[i];
			 num[i]=num[end-(i-start)-1];
			 num[end-(i-start)-1]=temp;
			 			 
		 }
		 
		 
		 
		 
	 }
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={3,2,1};
		NextPermutation np=new NextPermutation();
		np.nextPermutation(num);
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+",");
		}
		

	}

}
