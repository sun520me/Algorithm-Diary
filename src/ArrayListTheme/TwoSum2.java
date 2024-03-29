package ArrayListTheme;

/**
 * @author : qizidog
 * @date : 2021-03-23 13:39
 * @description :
 * 剑指 Offer 57. 和为s的两个数字
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。
 * 如果有多对数字的和等于s，则输出任意一对即可。
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[2,7] 或者 [7,2]
 *
 * 示例 2：
 * 输入：nums = [10,26,30,31,47,60], target = 40
 * 输出：[10,30] 或者 [30,10]
 *
 **/

public class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {
        int len;
        if(nums==null || (len=nums.length)==0){
            return null;
        }

        int l = 0;
        int r = len-1;

        while(l<r){
            int temp = nums[l]+nums[r];
            if(temp==target){
                return new int[]{nums[l], nums[r]};
            }else if(temp<target){
                l++;
            }else{
                r--;
            }
        }
        return null;
    }

}
