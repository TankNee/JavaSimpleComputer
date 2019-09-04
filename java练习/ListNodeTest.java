import java.util.Arrays;

public class ListNodeTest{
    public static void main(String args[]){
        ListNode test_1 = new ListNode(9);
        ListNode test_2 = new ListNode(9);
        ListNode test_3 = new ListNode(9);
        ListNode newHead = new ListNode(1);
        ListNode node_1 = new ListNode(9);
        ListNode node_2 = new ListNode(9);
        ListNode node_3 = new ListNode(9);
        test_1.next = test_2;
        test_2.next = test_3;
        test_3.next = newHead;
        ListNode Head = newHead;
        newHead.next = node_1;
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = null;
        ListNode result;
        result = removeElements_2(test_1,9);
        int[] A = new int[3];
        A[0] = 2;
        A[1] = 4;
        A[2] = 1;
        Arrays.sort(A);
        System.out.println();
    }
    public static ListNode removeElements_2(ListNode head, int val) {
        /**
         * 确保这个链表的头部不是需要删除的部分
         */
        while(head != null && head.val == val){
            head = head.next;
        }
        /**
         * 处理传入的指针为0的情况
         */
        if(head == null){
            return head;
        }
        /**
         * 新建一个链表节点变量
         * 如果下一个节点是需要删除的节点，则将当前节点的next直接指向下下个节点！
         */
        ListNode previous = head;
        while(previous.next != null){
            if(previous.next.val == val){
                previous.next = previous.next.next;
            }else{
                previous = previous.next;
            }
        }
        return head;
    }
    public static ListNode removeElements(ListNode head, int val) {
        //这种方法存在问题！！！！     
        ListNode pre = null;
        ListNode returnNode = head;
        if(head != null){
            while(head.next != null){
            if(head.val == val){
                head.val = head.next.val;
                head.next = head.next.next;
                if(head.next != null){
                    pre = head;
                }
                
                continue;
            }
            pre = head;
            head = head.next;
        }
            if(head.val == val && pre == null || (head.val == val && head == pre && returnNode.val == val && returnNode.next == null)){
                return null;
            }else if(head.val == val && pre != null){
                pre.next = null;
            }
        }
        return returnNode;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
