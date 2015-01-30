package leetcode;

public class RemoveDuplicatesfromSortedArrayII {

	public int removeDuplicates(int[] A) {
		int index = 0;
		for (int i = 0; i < A.length; ++i) {
		if (i > 0 && i < A.length - 1 && A[i] == A[i - 1] && A[i] == A[i + 1])
		continue;
		A[index++] = A[i];
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,1,1,1,2,2,2,3,3};
		RemoveDuplicatesfromSortedArrayII rdfsa = new RemoveDuplicatesfromSortedArrayII();
		int res = rdfsa.removeDuplicates(A);
		System.out.println(res);
		for(int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
			
		}

	}

}
