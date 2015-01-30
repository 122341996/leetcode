package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] num) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		
		HashSet<Integer> resset = new HashSet<Integer>();
		
		HashMap<Integer, Integer> numset = new HashMap<Integer, Integer>();

		for (int i = 0; i < num.length; i++) {
			numset.put(num[i], i);
		}

		for (int i = 0; i < num.length; i++) {

			int tempsum = 0 - num[i];
			for (int j = i; j < num.length; j++) {
				int tempsum2 = tempsum - num[j];
				Integer index = numset.get(tempsum2);
				if (index != null) {
					if (i != j && i != index && j != index) {
						int[] targetArr = { num[i], num[j], tempsum2 };
						String str = sort(targetArr);
						if (!resset.contains(str)) {
							System.out.println(str);
							List<Integer> reslist = new ArrayList<Integer>();
							reslist.add(num[i]);
							reslist.add(num[j]);
							reslist.add(tempsum2);
							res.add(reslist);

						}

					}
					// System.out.println(num[i]+","+num[j]+","+tempsum2);

				}

			}
		}

		return res;

	}

	public String sort(int[] targetArr) {// 小到大的排序

		String str = "";

		int temp = 0;
		for (int i = 0; i < targetArr.length; i++) {
			for (int j = i; j < targetArr.length; j++) {

				if (targetArr[i] > targetArr[j]) {

					temp = targetArr[i];
					targetArr[i] = targetArr[j];
					targetArr[j] = temp;

				}

			}
		}

		for (int i = 0; i < targetArr.length; i++) {
			str += targetArr[i];
		}
		return str;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 0,0,0,0 };
		ThreeSum ts = new ThreeSum();
		ts.threeSum(num);

	}

}
