class Main {
    public static void main(String[] args) {
       String str = "I Love Java";
       String[] words = str.split(" ");
       System.out.println(words.length);
       for(String i:words)
       {
         System.out.println(i);   
       }
}
}
---- using split()
