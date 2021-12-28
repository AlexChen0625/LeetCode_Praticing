package algorithms.leetcode.editor.en;
//Given n non-negative integers representing an elevation map where the width 
//of each bar is 1, compute how much water it can trap after raining. 
//
// 
// Example 1: 
//
// 
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Explanation: The above elevation map (black section) is represented by array [
//0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) 
//are being trapped.
// 
//
// Example 2: 
//
// 
//Input: height = [4,2,0,3,2,5]
//Output: 9
// 
//
// 
// Constraints: 
//
// 
// n == height.length 
// 1 <= n <= 2 * 10⁴ 
// 0 <= height[i] <= 10⁵ 
// 
// Related Topics Array Two Pointers Dynamic Programming Stack Monotonic Stack ?
//? 15540 👎 223

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
	public int trap(int[] height) {
		int arrayLength = height.length;
		int maxHeight = 0;

		for (int i = 0; i < arrayLength; i++) {
			if (height[i] > maxHeight) {
				maxHeight = height[i];
			}
		}
		int totalTripping = 0;
		for (int heightIndex = 0; heightIndex < maxHeight; heightIndex++) {
			int start = 0;
			int end = 0;
			boolean startTrippingWater = false;
			System.out.println("=====================================");
			System.out.println("heightIndex:" + heightIndex);
			for (int arrayIndex = 0; arrayIndex < arrayLength; arrayIndex++) {
				System.out.println("arrayIndex = " + arrayIndex);

				if (startTrippingWater && height[arrayIndex] > heightIndex) {
					System.out.println("stopTripping at arrayIndex = " + arrayIndex);
					startTrippingWater = false;
					end = arrayIndex;
					totalTripping += (end - start - 1);
					System.out.println("totalTripping = " + totalTripping);
				}

				//現在處為突起
				if (arrayIndex < arrayLength - 1) {
					if (height[arrayIndex] > heightIndex && height[arrayIndex + 1] <= heightIndex && !startTrippingWater) {
						System.out.println("startTripping at arrayIndex = " + arrayIndex);
						startTrippingWater = true;
						start = arrayIndex;
					}
				}

			}
		}

		return totalTripping;
	}
}
//leetcode submit region end(Prohibit modification and deletion)
