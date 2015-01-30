package leetcode;

public class RemoveDuplicatesfromSortedArray {

	public int removeDuplicates(int[] A) {
		if (A.length > 0) {

			int s = 0;
			for (int i = 0; i < A.length; i++) {
				if (A[s] == A[i]) {
					continue;
				} else {
					s++;
					A[s] = A[i];
				}

			}

			return s + 1;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2};
		RemoveDuplicatesfromSortedArray rdfsa = new RemoveDuplicatesfromSortedArray();
		int res = rdfsa.removeDuplicates(A);
		System.out.println(res);

	}

}
