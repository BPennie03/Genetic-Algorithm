import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GeneticAlgorithm {
    
    // Reads in data file with the format (on rubric) and creates and returns an ArrayList of Item objects
    public static ArrayList<Item> readData(String filename) throws FileNotFoundException {

        Scanner in = new Scanner(new File(filename));
        ArrayList<Item> items = new ArrayList<Item>();

        while (in.hasNext()) {
            String item = in.nextLine();
            String[] arrOfStr = item.split(",");
            System.out.println(in.nextLine());
            System.out.println(Arrays.toString(arrOfStr));

        }

        return items;
    }

    // Creates and returns an ArrayList of populationSize Chromosome objects that each contain the items, with
    // their included field randomly set to true
    public static ArrayList<Chromosome> initializePopulation(ArrayList<Item> items, int populationSize) {

        return null;
    }

    // Reads the data about the items in from a file called items.txt and performs the steps described in the
    // "Running the Genetic Algorithm" section on .pdf
    public static void main(String[] args) throws FileNotFoundException {

        readData("more_items.txt");
    }

}
