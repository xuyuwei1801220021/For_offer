/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        int temp = 0;
        for(int i =0;i<in.length;i++){
            if(root.val == in[i]){
                temp=i;
                break;
            }
        }
        int [] left_pre = new int[temp];
        int [] left_in = new int[temp];
        int [] right_pre = new int[in.length-temp-1];
        int [] right_in = new int[in.length-temp-1];
        
        for(int i = 0;i<temp;i++){
            left_pre[i]=(pre[i+1]);
            left_in[i]=(in[i]);
        }
        int j = 0;
        for(int i = temp+1;i<in.length;i++){
            right_pre[j]=(pre[i]);
            right_in[j]=(in[i]);
            j++;
        }
        
        root.left = reConstructBinaryTree(left_pre,left_in);
        root.right = reConstructBinaryTree(right_pre,right_in);
        
        return root;
    }
}
