package leetcode;

public class MedianofTwoSortedArrays {

	public double findMedianSortedArrays(int A[], int B[]) {
		double media = 0;
		if(A.length > 0 && B.length == 0)
		{
			if(A.length%2!=0)
			{
				return (double)A[A.length/2];
			}
			else
			{
				return (double)(A[A.length/2-1]+A[A.length/2])/2;
			}
		}
		if(B.length > 0 && A.length == 0)
		{
			if(B.length%2!=0)
			{
				return (double)B[B.length/2];
			}
			else
			{
				return (double)(B[B.length/2-1]+B[B.length/2])/2;
			}
		}

		if (A.length > 0 && B.length > 0) {
			int flag = (A.length + B.length) % 2;
			int m = (A.length + B.length) / 2;
			boolean isodd = true;
			if (flag != 0) {
				isodd = true;
			} else {
				isodd = false;
			}
			if (isodd) {
				int total = 0;
				int acount = 0;
				int bcount = 0;
				while (total <= m) {
					if(acount<A.length&&bcount<B.length)
					{
						if (A[acount] < B[bcount]) {
							media = A[acount];
							acount++;
							total++;
						} else {
							media = B[bcount];
							bcount++;
							total++;
						}
						
					}
					else if(acount==A.length&&bcount<B.length)
					{
						media = B[bcount];
						bcount++;
						total++;
						
					}
					else if(acount<A.length&&bcount==B.length)
					{
						media = A[acount];
						acount++;
						total++;
					}
						
					
				}

			} else {
				int total = 0;
				int acount = 0;
				int bcount = 0;
				while (total < m) {
					if(acount<A.length&&bcount<B.length)
					{
						if (A[acount] < B[bcount]) {
							media = A[acount];
							acount++;
							total++;
						} else {
							media = B[bcount];
							bcount++;
							total++;
						}
						
					}
					else if(acount==A.length&&bcount<B.length)
					{
						media = B[bcount];
						bcount++;
						total++;
						
					}
					else if(acount<A.length&&bcount==B.length)
					{
						media = A[acount];
						acount++;
						total++;
					}
						
					
				}
				
				if(acount<A.length&&bcount<B.length)
				{
					System.out.println("i:"+media);
					if (A[acount] <= B[bcount]) {
						media += A[acount];
						acount++;
						total++;
					} else {
						media += B[bcount];
						bcount++;
						total++;
					}
					media = (double) media / 2.0;
					
				}
				else if(acount==A.length&&bcount<B.length)
				{
					media += B[bcount];
					bcount++;
					total++;
					media = (double) media / 2.0;
					
				}
				else if(acount<A.length&&bcount==B.length)
				{
					media += A[acount];
					acount++;
					total++;
					media = (double) media / 2.0;
				}
				

			}
		}

		return media;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1,2};
		int[] B = { 1,2 };
		MedianofTwoSortedArrays mtsa = new MedianofTwoSortedArrays();
		System.out.println(mtsa.findMedianSortedArrays(A, B));

	}

}
