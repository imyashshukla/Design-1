class MinStack {

    Stack<Integer> mainStack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    
        
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        if (mainStack.size()==0){
            mainStack.push(x);
            minStack.push(x);
        }
        else{
            
            if(x < minStack.peek()){
                minStack.push(x);
            }
            else{
                minStack.push(minStack.peek());
            }
            mainStack.push(x);
        }
        
    }
    
    public void pop() {
        if(!mainStack.isEmpty())
        {
            mainStack.pop();
            minStack.pop();
        }
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}



/*
  Time Complexity: O(1)
  Space Complexity: O(n)  
*/

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

