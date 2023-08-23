class MyQueue {
    Stack < Integer > s1 = new Stack < > ();
    Stack < Integer > s2 = new Stack < > ();
    public MyQueue() {

    }
    
    public void push(int x) {
        while (s1.empty()==false){
            s2.push(s1.peek());
            s1.pop();
        }
        s1.push(x);
        while(s2.empty()==false){
            s1.push(s2.peek());
            s2.pop();
        }
    }
    
    public int pop() {
        int temp = s1.peek();
        s1.pop();
        return temp;
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */