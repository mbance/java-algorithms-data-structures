import java.util.Stack;

import sun.misc.Queue;

public class StackQueue {
    private static Stack<E> s;
    private static Queue<T> q;
    public static void main(String[] args) {
	prepare();
	System.out.print(q.dequeue());
	System.out.print(s.pop());
	System.out.print(s.pop());
	System.out.print(q.dequeue());
	s.pop();
	q.dequeue();
	System.out.print(s.pop());
	System.out.print(q.dequeue());
	System.out.print(s.pop());
	System.out.println(q.dequeue());
	s.pop();
	q.dequeue();
    }
    private static void prepare() {
    	
    	s = new Stack();
    	q = new Queue();
    	
    	s.push(0);
    	s.push(6);
    	s.push(2);
    	s.push(0);
    	s.push(5);
    	s.push(3);
    	q.enqueue(3);
    	q.enqueue(5);
    	q.enqueue(0);
    	q.enqueue(7);
    	q.enqueue(2);
    	q.enqueue(0);
    	
    }
}
