/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
*/
--------------------------------------------------------------------------------
  class Elem{
    public int value;
    public int min;
    public Elem next;
    
    public Elem(int value,int min){
        this.value= value;
        this.min = min;
    }
}

public class MinStack {

    /** initialize your data structure here. */
    public Elem top;
    
    public MinStack() {
         
    }
    
    public void push(int x) {
       if(top ==null){
           top = new Elem(x,x);
       }else{
           Elem e = new Elem(x,Math.min(x,top.min));
           e.next = top;
           top = e;
       }
    }
    
    public void pop() {
        if(top ==null){
            return;
        }
        Elem temp = top.next;
        top.next = null;
        top = temp;
    }
    
    public int top() {
        if(top == null){
            return -1;
        }
        return top.value;
    }
    
    public int getMin() {
        if(top == null){
            return -1;
        }
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
 
 //http://www.programcreek.com/2014/02/leetcode-min-stack-java/
 /*
 To make constant time of getMin(), we need to keep track of the minimum element for each element in the stack. 
 Define an element class that holds element value, min value, and pointer to elements below it.
 */
