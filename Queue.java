import java.util.Queue;
import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
	    Queue<Integer> q= new LinkedList<>();
	    q.add(10);
	    q.add(20);
	    System.out.println(q.poll());
	    
		
	}
}

Queue (FIFO)

👉 First In, First Out

🧠 Idea:

Like a line → first person goes first

✅ Operations:

add() / offer() → insert

remove() / poll() → delete

peek() → front
