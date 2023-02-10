package com.zhudz.letcode_2022.easy;

import java.util.Arrays;

/**
 * 66. 加一
 * https://leetcode-cn.com/problems/plus-one/
 * 如果 {digits}digits 的末尾没有 99，例如 [1, 2, 3][1,2,3]，那么我们直接将末尾的数加一，得到 [1, 2, 4][1,2,4] 并返回；
 *
 * 如果{digits}digits 的末尾有若干个 99，例如 [1, 2, 3, 9, 9][1,2,3,9,9]，那么我们只需要找出从末尾开始的第一个不为 99 的元素，即 33，将该元素加一，得到 [1, 2, 4, 9, 9][1,2,4,9,9]。随后将末尾的 99 全部置零，得到 [1, 2, 4, 0, 0][1,2,4,0,0] 并返回。
 *
 * 如果{digits}digits 的所有元素都是 99，例如 [9, 9, 9, 9, 9][9,9,9,9,9]，那么答案为 [1, 0, 0, 0, 0, 0][1,0,0,0,0,0]。我们只需要构造一个长度比 \textit{digits}digits 多 11 的新数组，将首元素置为 11，其余元素置为 00 即可。
 *
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/plus-one/solution/jia-yi-by-leetcode-solution-2hor/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Leetcode66 {
    public int[] plusOne(int[] digits) {
        //最后一位不为9的情况 eg: 128 -> 输出： 129
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] ++;
            return digits;
        }

        //eg： 18999 -> 输出19000
        //从数组最后一位开始遍历，找到第一个不为9的元素，将该位值加1，该位后面的元素值置为0，然后返回
        for (int i = digits.length - 1;i >= 0; i--) {
            if (digits[i] != 9){
                digits[i]++;
                for (i = i + 1; i < digits.length; i++) {
                    digits[i] = 0;
                }
                return digits;
            }
        }

        //数组中值全为9的情况。eg：99999 -> 输出：100000
        int[] digits1 = Arrays.copyOf(digits, digits.length + 1);
        digits1[0] = 1;
        for (int i = 1; i < digits1.length; i++) {
            digits1[i] = 0;
        }
        return digits1;
    }
}
