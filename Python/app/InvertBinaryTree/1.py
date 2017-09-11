
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution(object):
    def invertTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        if root:
            # tmp = root.left
            # root.left = self.invertTree(root.right)
            # root.right = self.invertTree(tmp)

            invert = self.invertTree
            root.left, root.right = invert(root.right), invert(root.left)  # 和上面效果相同
            return root
