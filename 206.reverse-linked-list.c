/*
 * [206] Reverse Linked List
 *
 * https://leetcode-cn.com/problems/reverse-linked-list/description/
 *
 * algorithms
 * Easy (54.28%)
 * Total Accepted:    22.4K
 * Total Submissions: 41.3K
 * Testcase Example:  '[1,2,3,4,5]'
 *
 * 反转一个单链表。
 * 
 * 示例:
 * 
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * 
 */
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
        if (head == NULL){
        return head;
    }
    
    struct ListNode *p = head->next;
    head->next = NULL;
    
    while(p != NULL){
        struct ListNode *tmp = p->next;
        p->next = head;
        head = p;
        p = tmp;
    }
    
    return head;
}
