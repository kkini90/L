/*
Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
Notes:
You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
*/
------------------------------------------------------------------------------------------
class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> stackNewest = new Stack<Integer>();
    Stack<Integer> stackOldest = new Stack<Integer>();
    
    public void push(int x) {
        stackNewest.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()){
                stackOldest.push(stackNewest.pop());
            }
        }
        stackOldest.pop();
    }

    // Get the front element.
    public int peek() {
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()){
                stackOldest.push(stackNewest.pop());
            }
        }
        return stackOldest.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return  stackNewest.isEmpty() && stackOldest.isEmpty();
    }
}



