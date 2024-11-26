import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] freq = new int[26];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // Using HashMap to solve the problem
    // static boolean isAnagram(String a, String b) {
    // if (a.length() != b.length()) {
    // return false;
    // }
    // a = a.toLowerCase();
    // b = b.toLowerCase();
    // Map<Character, Integer> freq = new HashMap<>();
    // for (int i = 0; i < a.length(); i++) {
    // freq.put(a.charAt(i), freq.getOrDefault(a.charAt(i), 0) + 1);
    // }
    // for (int i = 0; i < b.length(); i++) {
    // freq.put(b.charAt(i), freq.getOrDefault(b.charAt(i), 0) - 1);
    // }
    // for (int i = 0; i < a.length(); i++) {
    // if (freq.get(a.charAt(i)) != 0) {
    // return false;
    // }
    // }

    // All Anagrams of a String
    // static void generateAnagrams(String str, int l, int r) {
    // if (l == r) {
    // System.out.println(str);
    // } else {
    // for (int i = l; i <= r; i++) {
    // str = swap(str, l, i);
    // generateAnagrams(str, l + 1, r);
    // str = swap(str, l, i);
    // }
    // }
    // }
    // static String swap(String a, int i, int j) {
    // char temp;
    // char[] charArray = a.toCharArray();
    // temp = charArray[i];
    // charArray[i] = charArray[j];
    // charArray[j] = temp;
    // return String.valueOf(charArray);
    // }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
