/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        
        int low=0;
        int high=n-1;
        
        return create(nums,low, high);
        
        
    }
    
    private TreeNode create(int[] nums, int low, int high){
        
        if(low>high)
            return null;
        int mid= (low+high)/2;
        
        TreeNode root=new TreeNode(nums[mid]);
        root.left=create(nums, low,mid-1);
        root.right=create(nums,mid+1,high);
        
        return root;
    }
}