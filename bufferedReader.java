import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine().trim());
	    long m= Long.parseLong(br.readLine().trim());
	    
		System.out.println("Hello World");
		System.out.println(m);
	}
}


The throws IOException thing
javapublic static void main(String[] args) throws IOException {
BufferedReader can fail while reading (file missing, etc), so Java forces you to add throws IOException. Just always write it — don't overthink it.
