class MinStack {
  Stack<Long> st=new Stack<>();
  Long minval;
    public MinStack() {
        
    }
    
    public void push(int val) {
        long v= val;
        if(st.isEmpty()){
            st.push(v);
            minval=v;

        }
        else{
            if(v<minval){
                st.push(2*v-minval);
                minval=v;
            }else{
                st.push(v);
            }
        }
    }
    
    public void pop() {
        if(st.peek()<minval){
            minval=2*minval-st.peek();
        }
        st.pop();
    }
    
    public int top() {
        long top = st.peek();
         if(st.peek() < minval){
            return minval.intValue();
         }
       return (int) top;
    }
    
    public int getMin() {
        return minval.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */