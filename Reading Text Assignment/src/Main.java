import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        // copies each line of ProgrammingHistory.txt
        ArrayList<String> copyLines = new ArrayList<>();

        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
            copyLines.add(line);
        }


            // word search:
            System.out.println("\nWord search: ");
            String wordSearch = scan.nextLine();
            System.out.println("Now looking for: " + wordSearch);

        for (int lineIndex = 0; lineIndex < copyLines.size(); lineIndex++) {
            if (copyLines.get(lineIndex).contains(wordSearch)) {
                System.out.println("\nWord found on arrayList index: " + lineIndex);
            }
        }

        }
    }











