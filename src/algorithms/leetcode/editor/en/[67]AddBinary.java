package algorithms.leetcode.editor.en;
//Given two binary strings a and b, return their sum as a binary string. 
//
// 
// Example 1: 
// Input: a = "11", b = "1"
//Output: "100"
// Example 2: 
// Input: a = "1010", b = "1011"
//Output: "10101"
// 
// 
// Constraints: 
//
// 
// 1 <= a.length, b.length <= 10⁴ 
// a and b consist only of '0' or '1' characters. 
// Each string does not contain leading zeros except for the zero itself. 
// 
// Related Topics Math String Bit Manipulation Simulation 👍 3764 👎 439

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public String addBinary(String a, String b) {
		int i = a.length();
		int j = b.length();

		StringBuffer sb = new StringBuffer();

		int nextInt = 0;
		while (i > 0 || j > 0) {
			System.out.println("i = " + i + "j = " + j);
			int sum = 0;
			if (i > 0) {
				sum += Integer.parseInt(a.substring(i - 1, i));
				i--;

			}
			if (j > 0) {
				sum += Integer.parseInt(b.substring(j - 1, j));
				j--;

			}
			int add = sum + nextInt;
			if (add >= 2) {
				nextInt = 1;
			} else {
				nextInt = 0;
			}

			sb.append(add % 2);
		}
		if (nextInt == 1)
			sb.append(nextInt);

		return sb.reverse().toString();
	}
}
//leetcode submit region end(Prohibit modification and deletion)
