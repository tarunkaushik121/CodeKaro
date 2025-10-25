/* Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true
 */
package org.example.leetCode;

import java.util.HashSet;

public class hasDuplicate {

    public static void main(String args[]){
        int[] arr ={1,2,3,3};

        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            if(set.contains(num)){
                System.out.println(true);
            }
            set.add(num);
        }
    }
}
