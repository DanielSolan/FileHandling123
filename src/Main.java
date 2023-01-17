import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Main {
    public static void main(String[] args) {
        System.out.println("Do you want to write?");
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the file name?");
        String fileName = userInput.nextLine();
        //The scanner reads the string and stores it in username.
        System.out.println("What is the writing?");
        String writing = userInput.nextLine();
        FileHandler.writeToFile(fileName, writing, true);
      
        
        

    }

    public static void login(){
        Scanner login = new Scanner(System.in);
        System.out.println("Enter your username:");
        //The scanner reads the string and stores it in username.
        String username = login.nextLine();
        System.out.println(username);
        //All the usernames on the file are read into a string array.
        String[] userNames = FileHandler.stringRead("usernames.txt");
        for(int j = 0; j<userNames.length;j++){
            //If the writtten username matches one on the file, it has been found.
            if(userNames[j].equals(username)){
                System.out.println("Your usernames has been found");
            }
        }
    }

    public static void wordCount(){
        int wordCount = 0;
        //All the lines of the file are read onto the lines array.
        String[] lines = FileHandler.stringRead("input_File.txt");
        for(int k = 0; k<lines.length; k++){
            //At each line, it is read into a string variable then split where there is a space.
            String singleLine = lines[k];
            //These individual words are then tallied up to be added to the word count.
            String words[] = singleLine.split(" ");
            wordCount = wordCount + words.length;
        }
        System.out.println("Number of words in file: " + wordCount);

        ArrayList<String> people = FileHandler.arrayListRead("peopleData.txt");
        Collections.sort(people);
        System.out.println(people);
    }
}
