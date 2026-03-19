import java.util.HashMap;
import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
	    HashMap<Integer,String> st = new HashMap<>();
	    st.put(10,"A");
	    st.put(10,"B");
	    st.put(1,"C");
	    System.out.println(st.get(10));
	    st.remove(10);
	    System.out.println(st.get(10));
	    
		
	}
}
