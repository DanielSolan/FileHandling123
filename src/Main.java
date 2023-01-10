class Main {
    public static void main(String[] args) {
        //FileHandler.simplestRead("input_File.txt");
        //FileHandler.simplestWholeFileRead("input_File.txt");
        //FileHandler.betterWholeFileRead("input_File.txt");
        //FileHandler.bestWholeFileRead("input_File.txt");

        String[] peopleNames = new String[5];
        int counter = 0;
        while (FileHandler.stringRead("people_names.txt") != null){
            peopleNames[counter] = FileHandler.stringRead("people_names.txt");
            counter++;
        }
        for(int i = 0; i<peopleNames.length;i++ ){
            System.out.println(peopleNames[i]);
        }
    }
}
