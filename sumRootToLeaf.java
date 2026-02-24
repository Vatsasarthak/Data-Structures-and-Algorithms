public class sumRootToLeaf {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public int sumRootToLeaf(TreeNode root) {
            return dfs(root, 0);
        }

        private int dfs(TreeNode node, int current) {
            if (node == null) return 0;

            current = current * 2 + node.val;

            if (node.left == null && node.right == null) {
                return current;
            }

            return dfs(node.left, current) + dfs(node.right, current);
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);

        Solution sol = new Solution();
        int result = sol.sumRootToLeaf(root);

        System.out.println("Sum of Root to Leaf Binary Numbers: " + result);
    }
}