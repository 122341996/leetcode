package leetcode;

import java.util.HashSet;

public class ValidSudoku {

	public boolean isValidSudoku(char[][] board) {

		if (board.length > 9 || board[0].length > 9)
			return false;

		for (int i = 0; i < board.length; i++) {
			HashSet<Character> set = new HashSet<Character>();
			for (int j = 0; j < board[0].length; j++) {
				if (!String.valueOf(board[i][j]).equals(".")) {
					if (set.contains(board[i][j])) {
						System.out.println("row error");
						
						return false;
					} else {
						set.add(board[i][j]);
					}
				}

			}
		}
		for (int i = 0; i < board[0].length; i++) {
			HashSet<Character> set = new HashSet<Character>();
			for (int j = 0; j < board.length; j++) {

				if (!String.valueOf(board[j][i]).equals(".")) {
					if (set.contains(board[j][i])) {
						System.out.println("col error!");
						return false;
					} else {
						set.add(board[j][i]);
					}
				}

			}
		}

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				HashSet<Character> set = new HashSet<Character>();
				for (int m = 0; m < 3; m++) {
					for (int n = 0; n < 3; n++) {
						if (!String.valueOf(board[3*j + m][3*i + n]).equals(".")) {
							if (set.contains(board[3*j + m][3*i + n])) {
								System.out.println("9x9 error!"+j+":"+i);
								return false;
							} else {
								set.add(board[3*j + m][3*i + n]);
							}
						}

					}
				}

			}
		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] board=new char[9][9];
		String[] str={"..5.....6","....14...",".........",".....92..","5....2...",".......3.","...54....","3.....42.","...27.6.."};
		for(int i=0;i<str.length;i++)
		{
			board[i]=str[i].toCharArray();
			
		}
		ValidSudoku vs=new ValidSudoku();
		System.out.println(vs.isValidSudoku(board));
		
	}

}
