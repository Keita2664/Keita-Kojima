import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int wordCount = 0;
        ArrayList<String> word = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        br.close();

        Scanner scanner = new Scanner(System.in);

        System.out.println("type in a word: ");
        String str = scanner.nextLine();
        System.out.println("a word typed in: " + str);

        char [] charTyped = new char[str.length()];
        String [] stringTyped = new String[str.length()];
        for (int x = 0; x < str.length(); x++) {
            char typed = str.charAt(x);
            charTyped[x] = typed;
            stringTyped[x] = String.valueOf(typed);
        }


        for (int i = 0; i < lines.size(); i++) {
            String arrayLine = lines.get(i);
            int position = arrayLine.indexOf(str);
            int positionKeep = 0;
            System.out.print("Lines: " + i + " position: ");
            if (position != -1){
                System.out.print(position + positionKeep + " ");
            }
            else {
                System.out.print("none");
            }
            for(int j = 0; position != -1; j++) {
                positionKeep += position + str.length();
                arrayLine = arrayLine.substring(position + str.length());
                position = arrayLine.indexOf(str);
                if (position != -1){
                    System.out.print(position + positionKeep + " ");
                }
            }
            System.out.println();
         }
         /*   char [] charaArrayLine = new char[arrayLine.length()];
            String[] stringArrayLine = new String[arrayLine.length()];
            for (int k = 0; k < arrayLine.length(); k++) {
                char c = arrayLine.charAt(k);
                charaArrayLine[k] = c;
                stringArrayLine[k] = String.valueOf(c);
            }
            for (int z = 0; z < arrayLine.length(); z++){
                for (int y = 0; y < str.length(); y++){
                    if (stringArrayLine[y] == stringTyped[y]){
                        wordCount++;
                    }
                }
            }
        }*/
    }
}
