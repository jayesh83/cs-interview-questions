package questions.linkedlist;

import api.Node;

public class Cycle {

    public static boolean hasCycle(Node<Integer> node) {
        if (node == null || node.next == null) {
            return false;
        }

        Node<Integer> first = node;
        Node<Integer> second = node;

        while (first.next != null && second.next != null) {
            first = first.next;
            second = second.next.next;

            if (first.equals(second)) {
                return true;
            }
        }

        return false;
    }
}