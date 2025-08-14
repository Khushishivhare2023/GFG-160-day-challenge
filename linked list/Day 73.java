class Solution {
    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    static void removeLoop(Node head) {
        HashSet<Node> st = new HashSet<>();
        Node prev = null;
        while (head != null) {
            if (!st.contains(head)) {
                st.add(head);
                prev = head;
                head = head.next;
            }
            else {
                prev.next = null;
                break;
            }
        }
    }
}