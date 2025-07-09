/**
 * xiebaoma
 * 2025-07-09
 */

#include <algorithm>
using namespace std;

struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution
{
public:
    int maxDepth(TreeNode *root)
    {
        if (root == nullptr)
        {
            return 0;
        }
        else if (root->left == nullptr && root->right == nullptr)
        {
            return 1;
        }
        else
        {
            return 1 + max(maxDepth(root->right), maxDepth(root->left));
        }
    }
};