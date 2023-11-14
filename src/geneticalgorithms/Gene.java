/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geneticalgorithms;

/**
 * @filename Gene.java
 * @author Shane
 * @date 15 Oct 2012
 */

// -----------------------------------------------------------------------------
// Imports & Definition
// -----------------------------------------------------------------------------

public class Gene {
// -----------------------------------------------------------------------------
// Fields
// -----------------------------------------------------------------------------

    final static int ZERO = 0;
    final static int ONE = 1;
    final static int TWO = 2;
    final static int THREE = 3;
    final static int FOUR = 4;
    final static int FIVE = 5;
    final static int SIX = 6;
    final static int SEVEN = 7;
    final static int EIGHT = 8;
    final static int NINE = 9;
    final static int PLUS = 10;
    final static int MINUS = 11;
    final static int TIMES = 12;
    final static int DIV = 13;

    private int gene;

// -----------------------------------------------------------------------------
// Getters $ Setters
// -----------------------------------------------------------------------------

    public int getGene() {
        return gene;
    }

// -----------------------------------------------------------------------------
// Constructors
// -----------------------------------------------------------------------------

    public Gene() {
        this.gene = ((int)(Math.random() * 16));
    }

    public Gene(int _gene) {
        this.gene = _gene;
    }


// -----------------------------------------------------------------------------
// Methods
// -----------------------------------------------------------------------------

    public String decode() {
        String output = "";

        switch(gene) {
            case ZERO:
                output = "0 ";
                break;
            case ONE:
                output = "1 ";
                break;
            case TWO:
                output = "2 ";
                break;
            case THREE:
                output = "3 ";
                break;
            case FOUR:
                output = "4 ";
                break;
            case FIVE:
                output = "5 ";
                break;
            case SIX:
                output = "6 ";
                break;
            case SEVEN:
                output = "7 ";
                break;
            case EIGHT:
                output = "8 ";
                break;
            case NINE:
                output = "9 ";
                break;
            case PLUS:
                output = "+ ";
                break;
            case MINUS:
                output = "- ";
                break;
            case TIMES:
                output = "* ";
                break;
            case DIV:
                output = "/ ";
                break;
            default:
                output = "? ";
                break;


        }

        return output;
    }

    public String getByteString() {
        String output = "";

        output = Integer.toBinaryString(gene);

        while (output.length() != 4) {
            output = "0" + output;
        }

        return output;
    }

// -----------------------------------------------------------------------------
// Main
// -----------------------------------------------------------------------------


}
