/*
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Notes:
You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, 
and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or 
deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
*/
--------------------------------------------------------------------------------
class MyStack {
    LinkedList<Integer> list = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        if(list.isEmpty()){
            list.add(x);
        }else{
            list.add(x);
            while(list.peek()!=x){
                int val = list.poll();
                list.add(val);
            }
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        
            list.poll();
        
    }

    // Get the top element.
    public int top() {
        return list.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return(list.isEmpty());
    }
}
/*
class MyStack {
//using two queue. The push is inefficient.
private Queue<Integer> q1 = new LinkedList<Integer>();
private Queue<Integer> q2 = new LinkedList<Integer>();
public void push(int x) {
    if(q1.isEmpty()) {
        q1.add(x);
        for(int i = 0; i < q2.size(); i ++)
            q1.add(q2.poll());
    }else {
        q2.add(x);
        for(int i = 0; i < q1.size(); i++)
            q2.add(q1.poll());
    }
}

public void pop() {
    if(!q1.isEmpty()) 
        q1.poll();
    else
        q2.poll();
}
public int top() {
    return q1.isEmpty() ? q2.peek() : q1.peek();
}
public boolean empty() {
    return q1.isEmpty() && q2.isEmpty();
}
}
*/
