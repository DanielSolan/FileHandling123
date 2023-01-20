import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;


public class FileHandler {
    public static void simplestRead(String fileName){
        try{
            FileReader fr = new FileReader(fileName);
            int ascii = fr.read();
            char letter = (char)ascii;
            System.out.println(letter);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void bestWholeFileRead(String fileName){
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line !=null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String readFromFile(String fileName, int lineNumber){
        String line = null;
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            line = br.readLine();
            int lineNum = lineNumber;
            for (int i = 0; i<lineNum; i++){
                line = br.readLine();
            }
            return line;
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return line;
    }

    public static String[] stringRead(String fileName){
        String[] fileData = null;
        int lineCount = 0;
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line !=null){
                lineCount++;
                line = br.readLine();
            }
            fileData = new String[lineCount];
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            for(int i = 0;i<lineCount; i++){
                line = br.readLine();
                fileData[i]=line;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return fileData;
    }

    public static ArrayList<String> arrayListRead(String fileName){
        ArrayList<String> fileData = new ArrayList<String>();
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            int counter = 0;
            String line = br.readLine();
            while(line != null){
                fileData.add(line);
                line = br.readLine();
                counter++;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return fileData;
    }

    public static void writeToFile(String fileName, String text, boolean append) {
    // write text to fileName, overwriting (append = false) or appending (append = true)
        try (
        FileWriter fw = new FileWriter(fileName, append);
        PrintWriter pw = new PrintWriter(fw)
        ) {
        pw.println(text);
        }
        catch (IOException e) {
        e.printStackTrace();
        }
     }

    public static void createFile(String fileName) {
        // write text to fileName, overwriting (append = false) or appending (append = true)
        try (
                FileWriter fw = new FileWriter(fileName);
                PrintWriter pw = new PrintWriter(fw)
        ) {
            pw.println("");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

     public static void compactFile(String fileName){
         try{
             FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr);
             String line = br.readLine();
             line.replaceAll("\\s","");
             while (line !=null){
                 System.out.println(line);
                 line = br.readLine();
             }
         }
         catch (IOException e){
             e.printStackTrace();
         }
     }

}
