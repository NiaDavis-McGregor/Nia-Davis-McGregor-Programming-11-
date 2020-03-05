import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String wordScrambled = ("Th" + word.substring(1) + word.substring(0,1));
        System.out.println(wordScrambled);
        System.out.println(wordScrambled.substring(wordScrambled.length() -1) + word.substring(1));

    }
}
