Stack (LIFO)

👉 Last In, First Out

🧠 Idea:

Like a plate stack → last plate goes first

✅ Operations:

push() → add

pop() → remove top

peek() → see top

💻 Java Code:

import java.util.Stack;
import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
	    Stack<Integer> st = new Stack<>();
	    st.push(10);
	    st.push(20);
	    System.out.println(st.pop());
	    System.out.println(st.peek());
	    
		
	}
}
