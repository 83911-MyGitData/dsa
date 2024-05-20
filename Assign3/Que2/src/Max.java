public class Max {
	private int stack[];
	private int maxstack[];
	private int top;
	private int maxTop;
	
	public Max(int capacity) {
		stack = new int[capacity];
		maxstack = new int[capacity];
		top = -1;
		maxTop = -1;
	}
	 
	public void push(int value) {
		top++;
		stack[top] = value;
		
		if(isEmpty() || value >= maxstack[maxTop]) {
			maxTop++;
			maxstack[maxTop] = value;
		}
	}
	
	public int pop() {
		int value = stack[top];
		top--;
		
		if(value == maxstack[maxTop])
			maxTop--;
		return value;
	}
	
	public int peek() {
		return stack[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == stack.length - 1;
	}
	
	public int getMax() {
		return maxstack[maxTop];
	}




	public static void main(String[] args) {
		
		Max st = new Max(5);
		
		st.push(1);
		st.push(5);
		st.push(4);
		st.push(78);
		
		System.out.print("Max value in the stack = "+st.getMax());

	}
}





