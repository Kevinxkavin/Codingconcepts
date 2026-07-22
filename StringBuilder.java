class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Kavin");
        sb.delete(0,1);
        System.out.println(sb);
        String s = sb.toString();
        System.out.println(s);
        
    }
}

Code - 2 

    class Main {
    public static void main(String[] args) {
        String a = "Surender";
        StringBuilder n = new StringBuilder();
        n.append(a);
        String p=n.reverse().toString();
        System.out.println(p);
    }
}

append()
insert()
delete()
reverse()
length()
charAt()
toString()
