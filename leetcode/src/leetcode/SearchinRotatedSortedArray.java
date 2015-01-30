package leetcode;

public class SearchinRotatedSortedArray {

	public int search(int[] A, int target) {
		int pos = -1;
		int first = 0;
		int last = A.length;

		while (first != last) {
			int mid = (first + last) / 2;
			System.out.println(mid);
			if (target == A[mid]) {
				pos = mid;
				break;
			}

			if (A[mid] >= A[first]) {
				if (target >= A[first] && target < A[mid]) {
					last = mid - 1;
				} else {
					first = mid + 1;
				}

			} else {
				if (target > A[mid] && target <= A[last-1]) {
					first = mid + 1;
				} else {
					last = mid;
				}
			}

		}

		return pos;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1 };
		SearchinRotatedSortedArray arsa = new SearchinRotatedSortedArray();
		System.out.println(arsa.search(A, 1));

	}

}
