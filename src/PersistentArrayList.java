import java.util.Scanner;
public class PersistentArrayList {

    public static void New(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the name of the arrayList?");
        String fileName = userInput.nextLine();
        FileHandler.createFile(fileName);
    }

    public static int get(int i){
        return 0;
    }

    public static void add(String element){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the file name?");
        String fileName = userInput.nextLine();
        System.out.println("What do you want to add?");
        String input = userInput.nextLine();
        FileHandler.writeToFile(fileName, input, true);
    }

    public static void clear(){

    }

    public static int size(){
        return 0;
    }

    public static boolean contains(String element){
        return true;
    }

    public static int indexOf(String element){
        return 0;
    }
}
