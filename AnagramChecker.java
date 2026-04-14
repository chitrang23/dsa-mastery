import java.util.Arrays;

public class AnagramChecker {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char [] sChars =s.toCharArray();
        char [] tChars =t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        AnagramChecker solver = new AnagramChecker();
        String s = "rat", t = "car";
        System.out.println("Is anagram: " + solver.isAnagram(s, t));
    }
}