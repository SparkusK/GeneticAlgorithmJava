/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geneticalgorithms;

/**
 * @filename Algo.java
 * @author Shane
 * @date 15 Oct 2012
 */

// -----------------------------------------------------------------------------
// Imports & Definition
// -----------------------------------------------------------------------------

public class Algo {
// -----------------------------------------------------------------------------
// Fields
// -----------------------------------------------------------------------------

    Population pop;

    int solution;
// -----------------------------------------------------------------------------
// Getters $ Setters
// -----------------------------------------------------------------------------

// TODO: Getters & Setters

// -----------------------------------------------------------------------------
// Constructors
// -----------------------------------------------------------------------------

    public Algo(int _size) {
        this.pop = new Population(_size);

    }

// -----------------------------------------------------------------------------
// Inner Classes
// -----------------------------------------------------------------------------

// TODO: Inner Classes

// -----------------------------------------------------------------------------
// Methods
// -----------------------------------------------------------------------------

    public boolean testCurrentPopulation(int _targetNumber) {
        for (int i = 0; i < pop.population.size(); i++) {
            if ( (int) pop.population.get(i).evaluate() == _targetNumber){
                solution = i;
                String value = Double.toString(pop.population.get(i).evaluate());
                System.out.println("The value found was: " + value);
                return true;
            }
        }
        return false;
    }

    public void getSolution(int _targetNumber) {
        while (!testCurrentPopulation(_targetNumber)) {
            pop.CrossOver(_targetNumber);
        }
        System.out.println("Solution was found!");
        System.out.println(pop.population.get(solution).decode());
        System.out.println(pop.population.get(solution).validate().decode());
        System.out.println(pop.population.get(solution).validate().evaluate());

    }

// -----------------------------------------------------------------------------
// Main
// -----------------------------------------------------------------------------


}
