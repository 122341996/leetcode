package leetcode;

public class SearchinRotatedSortedArrayII {

	public boolean search(int[] A, int target) {
		boolean pos = false;
		int first = 0;
		int last = A.length;

		while (first != last) {
			int mid = (first + last) / 2;
			System.out.println(mid);
			if (target == A[mid]) {
				pos = true;
				break;
			}

			if (A[mid] == A[first]) {
				if (target == A[first]) {
					pos =true;
					break;
				} else {
				first++;
				continue;
				}

			}

			if (A[mid] > A[first]) {
				if (target >= A[first] && target < A[mid]) {
					last = mid ;
				} else {
					first = mid ;
				}

			} else if (A[mid] < A[first]) {
				if (target > A[mid] && target <= A[last - 1]) {
					first = mid ;
				} else {
					last = mid;
				}
			}

		}

		
			return pos;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1,3 };
		SearchinRotatedSortedArrayII arsa = new SearchinRotatedSortedArrayII();
		System.out.println(arsa.search(A, 1));

	}

}
