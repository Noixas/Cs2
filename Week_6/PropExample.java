import java.nio.file.Paths;
import java.io.File;
import java.util.Scanner;
public class PropExample{
  public static void main(String[] args)
  {
    int lineCount = 0;
    int wordCount = 0;
    int charCount = 0;
    try{
        Scanner input;
        input = new Scanner(Paths.get(args[0]));
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] words = line.split("\\s");
            for(int i = 0; i<words.length;i++)
            {
              charCount += words[i].length();
            }
            wordCount += words.length;
            lineCount++;
        }
        System.out.println("This document has:");
        System.out.println(lineCount + " lines");
        System.out.println(wordCount + " words");
        System.out.println(charCount + " characters");
        input.close();
      }catch(Exception e){
        System.out.println("Error trying to read usrs file");
        e.printStackTrace();
      }

  }

}
