package leetcode;

public class BinarySearch {
	
	public int search(int[] A, int target) {
		int pos=-1;
		
		int first=0;
		int last=A.length;
		
		while(first!=last)
		{
			int mid=(first+last)/2;
			if(target==A[mid])
			{
				pos=mid;
				break;
			}
			else if(target>A[mid])
			{
				first=mid+1;
			}
			else
			{
				last=mid;
			}
		}
		
		
		
		
		
		
		return pos;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1,2,3,4,5,6,7 };
		BinarySearch ts=new BinarySearch();
		System.out.print(ts.search(A, 3));

	}

}
