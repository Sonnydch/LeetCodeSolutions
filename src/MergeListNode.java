public class MergeListNode {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode listNode, tempNode;
        if (l1==null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }
        int init;
        if (l1.val<l2.val){
            init = l1.val;
            l1 = l1.next;
        }else {
            init = l2.val;
            l2 = l2.next;
        }
        listNode = new ListNode(init);
        tempNode =  listNode;
        while (l1!=null){
            if (l2!=null){

                if (l1.val<l2.val){
                    init = l1.val;
                    l1 = l1.next;
                }else {
                    init = l2.val;
                    l2 = l2.next;
                }
                tempNode.next = new ListNode(init);
                tempNode = tempNode.next;
            }else{
                tempNode.next = l1;
                break;
            }

        }

        if (l2!=null){
            tempNode.next = l2;
        }


        return listNode;
    }

}
