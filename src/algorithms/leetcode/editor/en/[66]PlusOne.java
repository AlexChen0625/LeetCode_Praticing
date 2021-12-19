package algorithms.leetcode.editor.en;
//You are given a large integer represented as an integer array digits, where 
//each digits[i] is the iᵗʰ digit of the integer. The digits are ordered from most 
//significant to least significant in left-to-right order. The large integer does 
//not contain any leading 0's. 
//
// Increment the large integer by one and return the resulting array of digits. 
//
//
// 
// Example 1: 
//
// 
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
// 
//
// Example 2: 
//
// 
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
// 
//
// Example 3: 
//
// 
//Input: digits = [0]
//Output: [1]
//Explanation: The array represents the integer 0.
//Incrementing by one gives 0 + 1 = 1.
//Thus, the result should be [1].
// 
//
// Example 4: 
//
// 
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].
// 
//
// 
// Constraints: 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// digits does not contain any leading 0's. 
// 
// Related Topics Array Math 👍 3256 👎 3786

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int[] plusOne(int[] digits) {
		String all = "";
		for (int i : digits) {
			all.concat(String.valueOf(i));
		}
		String afterAdd = String.valueOf(Integer.parseInt(all) + 1);
		String s = "appParam:{\"chkToken\":\"57efa28398834f3d80a34f9b70f3e83a\",\"deviceNo\":\"c45336cb-ce3c-4048-b414-7aefe782e478\",\"userId\":\"D100000068\"}";
		int[] result = new int[afterAdd.length()];

		for (int i = 0; i < afterAdd.length(); i++) {
			result[i] = Integer.parseInt(afterAdd.substring(i, i + 1));
		}
		return result;
	}
}
//leetcode submit region end(Prohibit modification and deletion)
