/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geneticalgorithms;

import java.util.ArrayList;

/**
 * @filename Population.java
 * @author Shane
 * @date 27 Oct 2012
 */

// -----------------------------------------------------------------------------
// Imports & Definition
// -----------------------------------------------------------------------------

public class Population {
// -----------------------------------------------------------------------------
// Fields
// -----------------------------------------------------------------------------

    ArrayList<Chromosome> population;

    int size;

    final double MUTATIONRATE = 0.007;

//    int targetNumber;



// -----------------------------------------------------------------------------
// Getters $ Setters
// -----------------------------------------------------------------------------

// TODO: Getters & Setters

// -----------------------------------------------------------------------------
// Constructors
// -----------------------------------------------------------------------------

    public Population() {
        this.population = new ArrayList<Chromosome>();
        while (population.size() < 15) {
            Chromosome chromo = new Chromosome();
//            chromo.validate();
//            if (!chromo.getChromosome().isEmpty())
                this.population.add(chromo);
        }
//        this.targetNumber = 35;
    }

    public Population(int _size) {
        this.population = new ArrayList<Chromosome>();
        while (population.size() < _size) {
            Chromosome chromo = new Chromosome();
//            chromo.validate();
//            if (!chromo.getChromosome().isEmpty())
                this.population.add(chromo);
        }
//        this.targetNumber = 35;
    }

// -----------------------------------------------------------------------------
// Inner Classes
// -----------------------------------------------------------------------------

// TODO: Inner Classes

// -----------------------------------------------------------------------------
// Methods
// -----------------------------------------------------------------------------

    public void CrossOver(int _targetNumber) {

        if (Math.random() > 0.7) {
            System.out.println("Did not cross over.");
            return;
        }

        int position = 0;

        int firstChromo = select(_targetNumber);
        int secondChromo = select(_targetNumber);

        System.out.print(Integer.toString(firstChromo) + ", ");
        System.out.println(Integer.toString(secondChromo));

        Chromosome firstChromosome = population.get(firstChromo);
        Chromosome secondChromosome = population.get(secondChromo);

        System.out.println(firstChromosome.decode(false));
        System.out.println(secondChromosome.decode(false));

        String first = firstChromosome.getByteString();
        String second = secondChromosome.getByteString();

        position = (int)(Math.random() * first.length());

        System.out.println("The crossover position is: " + Double.toString(position / 4));

        String subfirst = first.substring(position + 1);
        String subsecond = second.substring(position + 1);


        String newFirst = first.substring(0, position+1) + subsecond;
        String newSecond = second.substring(0, position+1) + subfirst;

        Chromosome newFirstChromosome = new Chromosome(newFirst);
        Chromosome newSecondChromosome = new Chromosome(newSecond);

        firstChromosome = new Chromosome(newFirstChromosome);
        secondChromosome = new Chromosome(newSecondChromosome);

        firstChromosome.mutate();
        secondChromosome.mutate();

        System.out.println(firstChromosome.decode(false));
        System.out.println(secondChromosome.decode(false));
    }

    public int select(int _targetNumber) {
        int chromo = 0;
        double sum = 0;
        double randomNumber = -1.0;
        double progress = 0;


        double[] numberLine = new double[population.size()];


        for (int i = 0; i < population.size(); i++) {
            numberLine[i] = population.get(i).determineFitness(_targetNumber);
            sum += population.get(i).determineFitness(_targetNumber);
        }

        randomNumber = Math.random() * (sum + 0.1);

        System.out.println("The sum is:" + Double.toString(sum));
        System.out.println("The random number is:" + Double.toString(randomNumber));

        for (int i = 0; i < population.size(); i++) {
            progress += numberLine[i];
            if (progress > randomNumber) {
                chromo = i;
                break;
            }
        }


        return chromo;
    }

    public double getSum(int _targetNumber) {

        double sum = 0;
        double[] numberLine = new double[population.size()];


        for (int i = 0; i < population.size(); i++) {

            numberLine[i] = population.get(i).determineFitness(_targetNumber);
            sum += population.get(i).determineFitness(_targetNumber);
        }
        return sum;



    }



// -----------------------------------------------------------------------------
// Main
// -----------------------------------------------------------------------------


}
