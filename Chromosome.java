import java.util.ArrayList;
import java.util.Random;

public class Chromosome extends ArrayList<Item> implements Comparable<Chromosome> {
    
    // Used for random number generation
    private static Random rng;

    // This no-arg constructor can be empty
    public Chromosome() {
    }

    // Adds a copy of each of the items passed in to this Chromosome. Uses random number to decide whether
    // each item's included field is set to true or false
    public Chromosome(ArrayList<Item> items) {

    }

    // Creates and returns a new child chromosome by performing the crossover operation on this chromosome
    // and other one that is passed in (for each item, use a random number to decide which parent's item should
    // be copied and added to the child)
    public Chromosome crossover(Chromosome other) {

        return other;
    }

    // Performs the mutation operation on this chromosome (for each item in this chromosome, use a random number
    // to decide whether to flip it's included field from true to false or vice versa)
    public void mutate() {

    }

    // Returns the fitness of this chromosome. If the sum of all the included items' weights are greater than 10,
    // the fitness is 0. Otherwise, the fitness is equal to the sum of all the included items' values
    public int getFitness() {

        int value = 0;
        int weight = 0;

        for (Item s: this) {
            value += s.getValue();
            weight += s.getWeight();
        }

        // if the weight of all the items is over 10, 0 is returned
        // if the weight of all the items is under 10, the value is returned
        if(weight > 10) {
            return 0;
        } else {
            return value;
        }

    }

    // Returns -1 if this chromosome's fitness is greater than the other's fitness, +1 if this chromosome's fitness
    // is less than the other one's, and 0 if their fitness is the same
    public int compareTo(Chromosome other) {

        if (this.getFitness() > other.getFitness()) {
            return -1;
        } else if (this.getFitness() < other.getFitness()) {
            return 1;
        } else {
            return 0;
        }

    }

    // Over-written toString method to display the name, weight, and value of all items in this chromosome whose
    // included value is true, followed by the fitness of this chromosome
    public String toString() {

        return null;
    }





}
