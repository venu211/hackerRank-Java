import java.util.Arrays;
import java.util.Scanner;

class Anagram {
    static boolean isAnagram(String A, String B) {
        char[] chars = A.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        char[] chars1 = B.toCharArray();
        Arrays.sort(chars1);
        String sorted1 = new String(chars1);
        return sorted.equalsIgnoreCase(sorted1) ? true : false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

