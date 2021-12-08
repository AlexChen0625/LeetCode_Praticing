package algorithms.leetcode.editor.en;
//Write a function to find the longest common prefix string amongst an array of 
//strings. 
//
// If there is no common prefix, return an empty string "". 
//
// 
// Example 1: 
//
// 
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
// 
//
// Example 2: 
//
// 
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
// 
// Constraints: 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] consists of only lower-case English letters. 
// 
// Related Topics String 👍 6052 👎 2613

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length != 0) {
			String commonPrefix = strs[0];

			for (int i = 1; i < strs.length; i++) {

				String compareString = strs[i];

				for (int j = 0; j < commonPrefix.length(); j++) {
					if (compareString.startsWith(commonPrefix.substring(0, commonPrefix.length() - j))) {
						commonPrefix = commonPrefix.substring(0, commonPrefix.length() - j);
						break;
					} else if (j == commonPrefix.length() - 1) {
						commonPrefix = "";
					}
				}
			}

			return commonPrefix;

		} else {
			return "";
		}
	}
}
//leetcode submit region end(Prohibit modification and deletion)
