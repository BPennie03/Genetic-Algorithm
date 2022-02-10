import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Chromosome extends ArrayList<Item> implements Comparable<Chromosome> {
    
    // Used for random number generation
    private static Random rng = new Random();

    // This no-arg constructor can be empty
    public Chromosome() {
    }

    // Adds a copy of each of the items passed in to this Chromosome. Uses random number to decide whether
    // each item's included field is set to true or false
    public Chromosome(ArrayList<Item> items) {

        Collections.shuffle(items);

        for (int i=0; i<7; i++) {
            this.add(items.get(i));

            items.get(i).setIncluded(rng.nextBoolean());
            System.out.println(this);
        }
    }

    // Creates and returns a new child chromosome by performing the crossover operation on this chromosome
    // and other one that is passed in (for each item, use a random number to decide which parent's item should
    // be copied and added to the child)
    public Chromosome crossover(Chromosome other) {

        Chromosome child = new Chromosome();
        int randNum = rng.nextInt(11);

        for (Item s: this) {
            if (randNum > 0 && randNum <= 5) {
                //child.get().setIncluded();
            } else {

            }


        }

        return child;
    }

    // Performs the mutation operation on this chromosome (for each item in this chromosome, use a random number
    // to decide whether to flip it's included field from true to false or vice versa)
    public void mutate() {
        for (Item s: this) {
            int randNum = rng.nextInt(10);

            if (randNum == 1) {
                if (!s.isIncluded()) {
                    s.setIncluded(true);
                } else {
                    s.setIncluded(false);
                }
            }
        }
    }

    // Returns the fitness of this chromosome. If the sum of all the included items' weights are greater than 10,
    // the fitness is 0. Otherwise, the fitness is equal to the sum of all the included items' values
    public int getFitness() {

        int value = 0;
        int weight = 0;

        for (Item s: this) {
            if (s.isIncluded()) {
                value += s.getValue();
                weight += s.getWeight();
            }
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

        return Integer.compare(other.getFitness(), this.getFitness());

    }

    // Over-written toString method to display the name, weight, and value of all items in this chromosome whose
    // included value is true, followed by the fitness of this chromosome
    public String toString() {

        String returnString = "";
        for (Item s: this) {
            if(!s.isIncluded()) {
                returnString += "F";
            } else {
                returnString += "T";
            }
        }

        return returnString.toString();
    }





}
