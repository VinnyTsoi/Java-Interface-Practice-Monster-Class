import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created	by Vinny Tsoi on 06/01/2019
 * A simple interface that allows an object to be saved to a storage medium.
 */
public class Main {
    public static void main(String[] args) {

        Monster monster = new Monster("Joe", 60, false);
        System.out.println(monster.toString());
        saveObject(monster);

        monster.setStrength(80);
        monster.setGood(true);
        System.out.println(monster);

        saveObject(monster);
        loadObject(monster);
        System.out.println(monster);

        }



    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("\nChoose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("\nChoose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("\nEnter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device\n***");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

} //class























