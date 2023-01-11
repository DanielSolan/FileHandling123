import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

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

    public static void simplestWholeFileRead(String fileName){
        try{
            FileReader fr = new FileReader(fileName);
            int ascii = 0;
            while (ascii!=-1){
                ascii = fr.read();
                char letter = (char)ascii;
                if (ascii!=-1){
                    System.out.print(letter);
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    //Faster than simpler read, stores bytes in RAM instead of retrieving on an individual basis.
    public static void betterWholeFileRead(String fileName){
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            int ascii = 0;
            while (ascii!=-1){
                ascii = br.read();
                char letter = (char)ascii;
                if(ascii!=-1){
                    System.out.print(letter);
                }
            }
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
}
