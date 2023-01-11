import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        //FileHandler.simplestRead("input_File.txt");
        //FileHandler.simplestWholeFileRead("input_File.txt");
        //FileHandler.betterWholeFileRead("input_File.txt");
        //FileHandler.bestWholeFileRead("input_File.txt");

        String[] peopleNames = FileHandler.stringRead("people_names.txt");
        for(int i = 0; i<peopleNames.length; i++){
            System.out.println(peopleNames[i]);
        }

        //Scanner login = new Scanner(System.in);
        //System.out.println("Enter your username:");
        //String username = login.nextLine();
        //boolean usernameFound = false;
        //while(usernameFound == false){
            //if (FileHandler.stringRead("usernames.txt") == username){
                //usernameFound = true;
                //System.out.println("Your usernames has been found");
            //} else if (FileHandler.stringRead("usernames.txt") == null && usernameFound == false){
                //System.out.println("Your usernames is not on the database.");
            //}
        //}

    }
}
