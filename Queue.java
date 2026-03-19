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



- Remove specific element (YES, manual!)
q.remove(20);
- poll() (most used)
q.poll();
Removes front element
Returns it
Returns null if empty
