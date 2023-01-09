import java.io.FileReader;
import java.io.IOException;

class Main {
    public static void simplestRead(){
        try{
            FileReader fr = new FileReader("input_File.txt");
            int ascii = fr.read();
            char letter = (char)ascii;
            System.out.println(letter);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void simplestwholeFileRead(){
        try{
            FileReader fr = new FileReader("input_File.txt");
            int ascii = 0;
            while (ascii!=-1){
                ascii = fr.read();
                char letter = (char)ascii;
                System.out.println(letter);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        simplestRead();
    }
}
