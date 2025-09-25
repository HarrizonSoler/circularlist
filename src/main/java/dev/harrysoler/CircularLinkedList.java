package dev.harrysoler;

public class CircularLinkedList {
    Node last;

    public CircularLinkedList(Node last) {
        this.last = last;

        if (this.last != null) {
            this.last.next = last;
        }
    }

    void addToEnd(int data) {
        Node n = new Node(data);

        if (last == null) {
            n.next = n;
        }
        else {
            n.next = last.next;
            last.next = n;
        }

        last = n;
    }

    void addToStart(int data) {
        Node n = new Node(data);

        if (last == null) {
            n.next = n;
            last = n;
        } else {
            n.next = last.next;
            last.next = n;
        }
    }

    void addAfter(int insertAfter, int data) {
        if (last != null) {
            Node curr = last;
            do {
                if (curr.data == insertAfter) {
                    Node n = new Node(data);
                    n.next = curr.next;
                    curr.next = n;
                    break;
                }

                curr = curr.next;
            } while (curr != last);
        }
    }

    Node deleteLast() {
        Node toDelete = last;
        if (last == null || last.next == last) {
            last = null;
            return toDelete;
        }

        Node prev = last.next;
        while (prev.next != last) {
            prev = prev.next;
        }

        prev.next = last.next;
        last = prev;
        return toDelete;
    }

    Node deleteAfter(int data) {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = last;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }

        return sb.toString();
    }
}
