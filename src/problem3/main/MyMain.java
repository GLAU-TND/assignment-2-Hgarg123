/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("Harshit", 11));
        queue.enqueue(new Student("Garg", 12));
        queue.enqueue(new Student("Aman", 13));
        queue.enqueue(new Student("Hardik", 14));

        queue.show();
        queue.dequeue();
        queue.show();

    }
}
