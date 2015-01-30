package leetcode;

public class MergeSortedArray {

	public void merge(int A[], int m, int B[], int n) {
		
		int[] c = new int[m + n];
		int count = 0;
		int m1 = 0;
		int n1 = 0;

		while (count < m + n) {
			if (m1 < m && n1 < n) {
				if (A[m1] <= B[n1]) {

					c[count] = A[m1];
					m1++;
					count++;
				} else {
					c[count] = B[n1];
					n1++;
					count++;

				}
			}
			else if(m1 == m && n1 < n)
			{
				c[count] = B[n1];
				n1++;
				count++;
				
			}
			else if(m1 < m && n1 == n)
			{
				c[count] = A[m1];
				m1++;
				count++;
			}

		}
		for (int i = 0; i < m + n; i++) {
			A[i] = c[i];
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[20];
		A[0] = 1;
		A[1] = 2;
		A[2] = 5;
		A[3] = 6;
		A[4] = 8;
		int[] B = { 1, 3, 4, 7, 9, 10 };

		MergeSortedArray msa = new MergeSortedArray();
		msa.merge(A, 5, B, 6);

		for (int i = 0; i <A.length; i++) {
			System.out.println(A[i]);
		}

	}

}
