import java.util.*;
class Main {
    public static void main(String[] args) {
       String s = "banana";

int[] freq = new int[26];

for(char ch : s.toCharArray()) {
    freq[ch - 'a']++;
}

for(int i = 0; i < 26; i++) {
    if(freq[i] > 1) {
        System.out.println((char)(i + 'a') + " -> " + freq[i]);
    }
}
}
}
