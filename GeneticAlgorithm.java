import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GeneticAlgorithm {
    
    // Reads in data file with the format (on rubric) and creates and returns an ArrayList of Item objects
    public static ArrayList<Item> readData(String filename) throws FileNotFoundException {

        ArrayList<Item> items = new ArrayList<>(); // new arraylist to store items
        Scanner readIn = new Scanner(new File(filename));

        // while the file still has lines, read in the line and split it into the core pieces:
        // name, weight, and value
        while (readIn.hasNextLine()) {
            String line = readIn.nextLine();
            String[] splitString = line.split(", "); // splits the string after each comma
            items.add(new Item(splitString[0], Double.parseDouble(splitString[1]), Integer.parseInt(splitString[2])));
            // adds the items into the arrayList

            //System.out.println(items); // print statement for testing
        }



        // returns the arrayList of Items
        return items;
    }

    // Creates and returns an ArrayList of populationSize Chromosome objects that each contain the items, with
    // their included field randomly set to true
    public static ArrayList<Chromosome> initializePopulation(ArrayList<Item> items, int populationSize) {

        ArrayList<Chromosome> chromosome = new ArrayList<>();


        return chromosome;
    }

    // Reads the data about the items in from a file called items.txt and performs the steps described in the
    // "Running the Genetic Algorithm" section on .pdf
    public static void main(String[] args) throws FileNotFoundException {

        // calls the readData on the more_items.txt file
        ArrayList<Item> items = readData("more_items.txt");

        for (int i=0; i<20; i++) {

            // *** INSERT STEPS 2-6 ***

        } // loop to iterate over steps 2-6 in the rubric 20 times
    }

}
