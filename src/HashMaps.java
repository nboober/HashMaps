import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class HashMaps {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        File file = new File("data.txt");
        Scanner scannerInput = null;//note that Scanner can read from a file!
        try {
            scannerInput = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scannerInput.hasNextLine()) {
            String line = scannerInput.nextLine();
            System.out.println(line);
        }

        int input = 0;

        System.out.println("Enter a number and I will print the value: ");
        HashMap<Integer, String> myMap = new HashMap<Integer, String>();
        myMap.put(10, "ten");
        myMap.put(12, "twelve");

        input = scanner.nextInt();

        System.out.println("You entered " + myMap.get(input));



    }
}
