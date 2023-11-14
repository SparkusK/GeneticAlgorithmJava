/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geneticalgorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @filename NumberSequence.java
 * @author Shane
 * @date 15 Oct 2012
 */

// -----------------------------------------------------------------------------
// Imports & Definition
// -----------------------------------------------------------------------------

public class NumberSequence {
// -----------------------------------------------------------------------------
// Fields
// -----------------------------------------------------------------------------

//    final int ZERO = 0;
//    final int ONE = 1;
//    final int TWO = 2;
//    final int THREE = 3;
//    final int FOUR = 4;
//    final int FIVE = 5;
//    final int SIX = 6;
//    final int SEVEN = 7;
//    final int EIGHT = 8;
//    final int NINE = 9;
//    final int PLUS = 10;
//    final int MINUS = 11;
//    final int TIMES = 12;
//    final int DIV = 13;





// -----------------------------------------------------------------------------
// Getters $ Setters
// -----------------------------------------------------------------------------



// -----------------------------------------------------------------------------
// Constructors
// -----------------------------------------------------------------------------

// TODO: Constructors

// -----------------------------------------------------------------------------
// Inner Classes
// -----------------------------------------------------------------------------

// TODO: Inner Classes

// -----------------------------------------------------------------------------
// Methods
// -----------------------------------------------------------------------------

//    public String decode(int _gene) {
//        String output = "";
//
//        switch(_gene) {
//            case ZERO:
//                output = "0 ";
//                break;
//            case ONE:
//                output = "1 ";
//                break;
//            case TWO:
//                output = "2 ";
//                break;
//            case THREE:
//                output = "3 ";
//                break;
//            case FOUR:
//                output = "4 ";
//                break;
//            case FIVE:
//                output = "5 ";
//                break;
//            case SIX:
//                output = "6 ";
//                break;
//            case SEVEN:
//                output = "7 ";
//                break;
//            case EIGHT:
//                output = "8 ";
//                break;
//            case NINE:
//                output = "9 ";
//                break;
//            case PLUS:
//                output = "+ ";
//                break;
//            case MINUS:
//                output = "- ";
//                break;
//            case TIMES:
//                output = "* ";
//                break;
//            case DIV:
//                output = "/ ";
//                break;
//        }
//
//        return output;
//    }

//    public String decode(int[] _chromosome) {
//        String output = "";
//        for (int i = 0; i < _chromosome.length; i++){
//            output += decode(_chromosome[i]);
//        }
//        return output;
//    }

//    public String decode(ArrayList<Integer> _chromosome) {
//        String output = "";
//
//        ArrayList<Integer> validChromosome = validateChromosome(_chromosome);
//
//        for (int i = 0; i < validChromosome.size(); i++) {
//            output += decode(_chromosome.get(i));
//        }
//        return output;
//    }

//    public String decode(ArrayList<Integer> _chromosome, Boolean _validate) {
//        String output = "";
//        ArrayList<Integer> validChromosome;
//        if (_validate){
//             validChromosome = validateChromosome(_chromosome);
//        }
//        else {
//            validChromosome = _chromosome;
//        }
//        for (int i = 0; i < validChromosome.size(); i++) {
//            output += decode(_chromosome.get(i));
//        }
//        return output;
//    }

//    public void Crossover(ArrayList<Integer> _chromo1, ArrayList<Integer> _chromo2) {
//
//    }

//    public String getByteString(int _gene) {
//        String output = "";
//
//        output = Integer.toBinaryString(_gene);
//
//        while (output.length() != 4) {
//            output = "0" + output;
//        }
//
//        return output;
//    }

//    public String getByteString(ArrayList<Integer> _chromosome) {
//        String output = "";
//
//        for (int i = 0; i < _chromosome.size(); i++) {
//            output += getByteString(_chromosome.get(i));
//        }
//
//        return output;
//    }

//    public ArrayList<Integer> validateChromosome(ArrayList<Integer> _chromosome) {
//        int removed = 0;
//        do {
//            removed = 0;
//            for (int i = 0; i < _chromosome.size(); i++) {
//
//                if (_chromosome.get(i) > DIV) {
//                    _chromosome.remove(i);
//                    removed++;
//                }
//
//                else if(i % 2 == 0) {
//                    if (_chromosome.get(i) < PLUS) {
//                        _chromosome.remove(i);
//                        removed++;
//                    }
//                }
//                else {
//                    if (_chromosome.get(i) >= PLUS) {
//                        _chromosome.remove(i);
//                        removed++;
//                    }
//                }
//            }
//        } while (removed > 0);
//
//        if (_chromosome.size() > 0) {
//            if (_chromosome.get(0) >= PLUS) {
//                _chromosome.remove(0);
//            }
//        }
//        if (_chromosome.size() > 0) {
//            if (_chromosome.get(_chromosome.size() - 1) >= PLUS) {
//                _chromosome.remove(_chromosome.size() - 1);
//            }
//        }
//        return _chromosome;
//    }

//
//    public ArrayList<Integer> getChromosome() {
//        ArrayList<Integer> chromo = new ArrayList<Integer>();
//        for (int i = 0; i < 15; i++) {
//            chromo.add((int)(Math.random() * 16));
//        }
//        return chromo;
//    }
//
//    public ArrayList<Integer> getChromosome(int _initialSize) {
//        ArrayList<Integer> chromo = new ArrayList<Integer>();
//        for (int i = 0; i < _initialSize; i++) {
//            chromo.add((int)(Math.random() * 16));
//        }
//        return chromo;
//    }
//
//    public ArrayList<Integer> getValidChromosome() {
//        ArrayList<Integer> chromo;
//        do {
//            chromo = getChromosome();
//            chromo = validateChromosome(chromo);
//        } while (chromo.isEmpty());
//        return chromo;
//    }
//
//    public ArrayList<Integer> getValidChromosome(int _initialSize) {
//        ArrayList<Integer> chromo;
//        do {
//            chromo = getChromosome(_initialSize);
//            chromo = validateChromosome(chromo);
//        } while (chromo.isEmpty());
//        return chromo;
//    }
//
//    public ArrayList<Integer> getChromosome(String _bytestring) {
//        ArrayList<Integer> chromo = new ArrayList<Integer>();
//        int gene;
//        String geneString;
//        for (int i = 0; i < _bytestring.length(); i = i + 4) {
//            geneString = _bytestring.substring(i, i + 4);
//            gene = Byte.parseByte(geneString, 2);
//            chromo.add(gene);
//        }
//
//        return chromo;
//    }


// -----------------------------------------------------------------------------
// Main
// -----------------------------------------------------------------------------


}
