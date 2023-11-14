/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geneticalgorithms;

import java.util.ArrayList;

/**
 * @filename Chromosome.java
 * @author Shane
 * @date 15 Oct 2012
 */

// -----------------------------------------------------------------------------
// Imports & Definition
// -----------------------------------------------------------------------------

public class Chromosome {
// -----------------------------------------------------------------------------
// Fields
// -----------------------------------------------------------------------------

    ArrayList<Gene> chromosome;



// -----------------------------------------------------------------------------
// Getters $ Setters
// -----------------------------------------------------------------------------

    public ArrayList<Gene> getChromosome() {
        return chromosome;
    }

    private void setChromosome(ArrayList<Gene> _chromosome) {
        this.chromosome = _chromosome;
    }

// -----------------------------------------------------------------------------
// Constructors
// -----------------------------------------------------------------------------

    public Chromosome(Chromosome _chromo) {
        this.chromosome = new ArrayList<Gene>();
        for (int i = 0; i < _chromo.getChromosome().size(); i++) {
            this.chromosome.add(_chromo.getChromosome().get(i));
        }
    }

    public Chromosome() {
        this.chromosome = new ArrayList<Gene>();
        for (int i = 0; i < 15; i++) {
            this.chromosome.add(new Gene());
        }
    }

    public Chromosome(int _initialSize) {
        chromosome = new ArrayList<Gene>();
        for (int i = 0; i < _initialSize; i++) {
            chromosome.add(new Gene());
        }
    }

   public Chromosome(Boolean _validate) {
        Chromosome chromo;
        do {
            chromo = new Chromosome();
            chromo.validate();
        } while (chromo.getChromosome().isEmpty());
        this.chromosome = chromo.getChromosome();
    }

    public Chromosome(Boolean _validate, int _initialSize) {
        Chromosome chromo;
        do {
            chromo = new Chromosome(_initialSize);
            chromo.validate();
        } while (chromo.getChromosome().isEmpty());
        this.chromosome = chromo.getChromosome();
    }

    public Chromosome(String _bytestring) {
        Chromosome chromo = new Chromosome(0);
        Gene gene;
        String geneString;
        for (int i = 0; i < _bytestring.length(); i = i + 4) {
            geneString = _bytestring.substring(i, i + 4);
            gene = new Gene(Byte.parseByte(geneString, 2));
            chromo.getChromosome().add(gene);
        }
        this.setChromosome(chromo.getChromosome());

    }

// -----------------------------------------------------------------------------
// Methods
// -----------------------------------------------------------------------------

    public String decode() {
        String output = "";

        validate();

        for (int i = 0; i < chromosome.size(); i++) {
            output += chromosome.get(i).decode();
        }
        return output;
    }

    public String decode(Boolean _validate) {
        String output = "";
        ArrayList<Integer> validChromosome;
        if (_validate){
             validate();
        }
        for (int i = 0; i < chromosome.size(); i++) {
            output += chromosome.get(i).decode();
        }
        return output;
    }

    public Chromosome validate() {
        Chromosome chromo = new Chromosome(this);
        Boolean finished = false;
        ArrayList<Gene> chrome = chromo.getChromosome();
        while (!finished) {
        
            for (int i = 0; i < chrome.size(); i++) {
                if (chrome.get(i).getGene() > Gene.DIV) {
                    chrome.remove(i);
                    break ;
                }
                if(i % 2 == 0) {
                    if (chrome.get(i).getGene() > Gene.NINE){
                        chrome.remove(i);
                        break ;
                    }                        
                }
                if(i % 2 != 0) {
                    if (chrome.get(i).getGene() < Gene.PLUS) {
                        chrome.remove(i);
                        break ;
                    }
                }
                if (i == chrome.size() - 1){
                    finished = true;
                    break;
                }
            }
        }

        if (chrome.get(chrome.size() - 1).getGene() > Gene.NINE){
            chrome.remove(chrome.size() - 1);

        }


//        int removed = 0;
//        do {
//            removed = 0;
//            for (int i = 0; i < chromo.getChromosome().size(); i++) {
//
//                if (chromo.getChromosome().get(i).getGene() > Gene.DIV) {
//                    chromo.getChromosome().remove(i);
//                    removed++;
//                }
//
//                else if(i % 2 == 0) {
//                    if (chromo.getChromosome().get(i).getGene() < Gene.PLUS) {
//                        chromo.getChromosome().remove(i);
//                        removed++;
//                    }
//                }
//                else {
//                    if (chromo.getChromosome().get(i).getGene() >= Gene.PLUS) {
//                        chromo.getChromosome().remove(i);
//                        removed++;
//                    }
//                }
//            }
//        } while (removed > 0);
//
//        if (chromo.getChromosome().size() > 0) {
//            if (chromo.getChromosome().get(0).getGene() >= Gene.PLUS) {
//                chromo.getChromosome().remove(0);
//            }
//        }
//        if (chromo.getChromosome().size() > 0) {
//            if (chromo.getChromosome().get(chromo.getChromosome().size() - 1).getGene() >= Gene.PLUS) {
//                chromo.getChromosome().remove(chromo.getChromosome().size() - 1);
//            }
//        }

//        while (this.getChromosome().isEmpty()) {
//            Chromosome chromo = new Chromosome();
//            chromo.validate();
//            this.setChromosome(chromo.getChromosome());
//        }

        return chromo;
        
    }

    public String getByteString() {
        String output = "";

        for (int i = 0; i < chromosome.size(); i++) {
            output += chromosome.get(i).getByteString();
        }

        return output;
    }

    public double evaluate() {
        Chromosome chromo = this.validate();

        if (chromo.getChromosome().isEmpty()) return (float) 0.0;

        double value =  (double) chromo.getChromosome().get(0).getGene();
        double operator;
        double temp;
        for (int i = 1; i < chromo.getChromosome().size(); i += 2) {
            try {
                operator = (float)chromo.getChromosome().get(i).getGene();
                temp = (float)chromo.getChromosome().get(i+1).getGene();
                if (operator == Gene.PLUS) {
                    value = value + temp;
                } else if (operator == Gene.MINUS) {
                    value = value - temp;
                } else if (operator == Gene.TIMES) {
                    value = value * temp;
                } else if (operator == Gene.DIV) {
                    value = value / temp;
                }
            } catch(IndexOutOfBoundsException e) {
                return value;
            }
        }
        return value;
    }



    public void mutate() {
        String byteString = this.getByteString();

        String mutateString = "";

        for (int i = 0; i < byteString.length(); i++) {
            if (Math.random() > 0.001) {
                if (byteString.charAt(i) == '0') {
                    mutateString += '1';
                }
                else {
                    mutateString += '0';
                }
            }
            else {
                mutateString += byteString.charAt(i);
            }
       }

       this.setChromosome(new Chromosome(mutateString).getChromosome());
    }

    public double determineFitness(int _targetNumber) {

        if (_targetNumber == this.evaluate()) return 0;

        double output = 1 / (_targetNumber - this.evaluate());

        if (output < 0) output *= -1;

        return output;
    }






// -----------------------------------------------------------------------------
// Main
// -----------------------------------------------------------------------------


}
