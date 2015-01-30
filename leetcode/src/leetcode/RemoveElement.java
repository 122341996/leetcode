package leetcode;

public class RemoveElement {
	
	 public int removeElement(int[] A, int elem) {
		 int index=0;
		 for(int i=0;i<A.length;i++)
		 {
			 if(A[i]!=elem)
			 {
				 A[index]=A[i];
				 index++;
			 }
		 }
		 
		 return index;
	        
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A={1,1,1,1,1,1,1,2};
		RemoveElement re=new RemoveElement();
		System.out.println(re.removeElement(A, 2));

	}

}
