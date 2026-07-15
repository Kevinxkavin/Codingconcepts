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
