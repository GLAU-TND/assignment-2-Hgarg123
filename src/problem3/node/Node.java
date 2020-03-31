/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

import problem3.Student;
public class Node {
    private Student data;
    private Node next;

    public Node(Student data, Node next) {
        this.data = data;
        this.next = next;
    }
}
