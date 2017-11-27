package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    //private static double p = 0.01;
    private static double tabA[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1};
    private static double tabB[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0};
    private static double tabC[] = {0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0};
    private static double tabD[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0};
    private static double tabE[] = {1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1};
    private static double tabF[] = {1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0};
    private static double tabG[] = {1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1};
    private static double tabH[] = {1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1};
    private static double tabI[] = {1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0};
    private static double tabJ[] = {0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0};
    private static double tabK[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1};
    private static double tabL[] = {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1};
    private static double tabM[] = {1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1};
    private static double tabN[] = {1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1};
    private static double tabO[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0};
    private static double tabP[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0};
    private static double tabQ[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1};
    private static double tabR[] = {1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1};
    private static double tabS[] = {1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1};
    private static double tabT[] = {0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0};
// testowe
private static double tabPP[] = {0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0};
    private static double tabAA[] = {0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0};
    private static double tabBB[] = {1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0};
    private static double tabCC[] = {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0};


    private static double taby[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


    public static void main(String[] args) {
        int k = 20;

        int lneuronów = 20;
        int liczbaukr = 15;
        int liczbawyjsc = 20;
        double p = 0.1;
        double[] tab8 = new double[liczbaukr];

        List<NeuralCell> neuronListw = new ArrayList<>();
        List<NeuralCell> neuronListu = new ArrayList<>();
        List<NeuralCell> neuronList = new ArrayList<>();
        List<Double> wagiNeuronu;
        for (int i = 0; i < lneuronów; i++) {
            wagiNeuronu = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                double losowa = ThreadLocalRandom.current().nextDouble(-1.0, 1.0);
                wagiNeuronu.add(losowa);
            }

            neuronList.add(new NeuralCell(wagiNeuronu));


        }
        List<Double> wagiNeuronuu;
        for (int i = 0; i < liczbaukr; i++) {
            wagiNeuronuu = new ArrayList<>();
            for (int j = 0; j < 20; j++) {
                double losowa = ThreadLocalRandom.current().nextDouble(-1.0, 1.0);
                wagiNeuronuu.add(losowa);
            }

            neuronListu.add(new NeuralCell(wagiNeuronuu));


        }
        List<Double> wagiNeuronuw;
        for (int i = 0; i < liczbawyjsc; i++) {
            wagiNeuronuw = new ArrayList<>();
            for (int j = 0; j < liczbaukr; j++) {
                double losowa = ThreadLocalRandom.current().nextDouble(-1.0, 1.0);
                wagiNeuronuw.add(losowa);
            }

            neuronListw.add(new NeuralCell(wagiNeuronuw));


        }

        wpiszwejscie(neuronList, tabA);
        wpiszwejscie(neuronListu, tabA);
        wpiszwejscie(neuronListw, tab8);




        for (int i = 0; i < 40; i++) {


            pom(tabA, neuronListu, neuronList, neuronListw);
            taby[0] = 1;
            taby[19] = 0;

            uczs(neuronListu, neuronList, neuronListw, taby, p);

            pom(tabB, neuronListu, neuronList, neuronListw);
            taby[0] = 0;
            taby[1] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);

            pom(tabC, neuronListu, neuronList, neuronListw);
            taby[1] = 0;
            taby[2] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);

           pom(tabD, neuronListu, neuronList, neuronListw);
            taby[2] = 0;
            taby[3] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);

            pom(tabE, neuronListu, neuronList, neuronListw);
            taby[3] = 0;
            taby[4] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabF, neuronListu, neuronList, neuronListw);
            taby[4] = 0;
            taby[5] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabG, neuronListu, neuronList, neuronListw);
            taby[5] = 0;
            taby[6] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabH, neuronListu, neuronList, neuronListw);
            taby[6] = 0;
            taby[7] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabI, neuronListu, neuronList, neuronListw);
            taby[7] = 0;
            taby[8] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabJ, neuronListu, neuronList, neuronListw);
            taby[8] = 0;
            taby[9] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabK, neuronListu, neuronList, neuronListw);
            taby[9] = 0;
            taby[10] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabL, neuronListu, neuronList, neuronListw);
            taby[10] = 0;
            taby[11] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabM, neuronListu, neuronList, neuronListw);
            taby[11] = 0;
            taby[12] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabN, neuronListu, neuronList, neuronListw);
            taby[12] = 0;
            taby[13] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabO, neuronListu, neuronList, neuronListw);
            taby[13] = 0;
            taby[14] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabP, neuronListu, neuronList, neuronListw);
            taby[14] = 0;
            taby[15] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabQ, neuronListu, neuronList, neuronListw);
            taby[15] = 0;
            taby[16] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabR, neuronListu, neuronList, neuronListw);
            taby[16] = 0;
            taby[17] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabS, neuronListu, neuronList, neuronListw);
            taby[17] = 0;
            taby[18] = 1;
            uczs(neuronListu, neuronList, neuronListw, taby, p);
            pom(tabT, neuronListu, neuronList, neuronListw);
            taby[18] = 0;
            taby[19] = 1;
          uczs(neuronListu, neuronList, neuronListw, taby, p);


        }

        //wsywietlanie:
        System.out.println("    A      B      C     D      E      F      G      H      I      J      K      L      M      N      O      P      Q      R      S      T ");

        pom(tabAA, neuronListu, neuronList, neuronListw);
        licz(neuronListw );
        pom(tabBB, neuronListu, neuronList, neuronListw);
        licz(neuronListw );
        pom(tabCC, neuronListu, neuronList, neuronListw);
        licz(neuronListw );
        pom(tabPP, neuronListu, neuronList, neuronListw);
       licz(neuronListw );


    }




    public static void wpiszwejscie(List<NeuralCell> x, double[] tab) {


        for (int j = 0; j < x.size(); j++) {
            for (double i : tab) {
                int a = (int) i;
                x.get(j).newIn(a, tab[a]);
            }


        }
    }


    public static void zmienwejscie(List<NeuralCell> x, double[] tab, int index) {


        for (int i = 0; i < x.size(); i++) {
            for (double j : tab) {
                int a = (int) j;
                x.get(i).setInputData(a, tab[a]);
            }


        }


    }


    public static void ww(List<NeuralCell> to, List<NeuralCell> from) {


        for (int p = 0; p < to.size(); p++) {
            for (int j = 0; j < from.size(); j++) {


                to.get(p).setInputData(j, from.get(j).finalizeData(from.get(j).getMembranePotential()));


            }

        }


    }


    public static void uczs(List<NeuralCell> ukr, List<NeuralCell> wej, List<NeuralCell> wyj, double[] tab, double p) {


        double[] bladwyj = new double[wyj.size()];
        double[] bladukr = new double[ukr.size()];
        double[] bladwej = new double[wej.size()];
        double y;


        for (int i = 0; i < wyj.size(); i++) {
            bladwyj[i] = 0;


        }

        for (int i = 0; i < wyj.size(); i++) {
            bladwyj[i] = (tab[i] - wyj.get(i).finalizeData(wyj.get(i).getMembranePotential()));


        }
        for (int i = 0; i < ukr.size(); i++) {
            bladukr[i] = 0;
            for (int j = 0; j < wyj.size(); j++) {
                bladukr[i] += (ukr.get(i).getInputWeight(j) * bladwyj[j]);
            }

        }

        for (int i = 0; i < wej.size(); i++) {
            bladwej[i] = 0;
            for (int j = 0; j < ukr.size(); j++) {

                bladwej[i] += wej.get(i).getInputWeight(j) * bladukr[j];
            }

        }


        for (int i = 0; i < wej.size(); i++) {
            for (int j = 0; j < wej.get(i).getInputSize(); j++) {
                wej.get(i).setInputWeight(j, (wej.get(i).getInputWeight(j) + (p * bladwej[i] * dx(wej.get(i).finalizeData(wej.get(i).getMembranePotential())) * wej.get(i).getInputData(j))));
            }


        }


        for (int i = 0; i < ukr.size(); i++) {

            for (int j = 0; j < ukr.get(i).getInputSize(); j++) {

                ukr.get(i).setInputWeight(j, (ukr.get(i).getInputWeight(j) + (p * bladukr[i] * dx(ukr.get(i).finalizeData(ukr.get(i).getMembranePotential())) * wej.get(j).finalizeData(wej.get(j).getMembranePotential()))));
            }

        }
        for (int i = 0; i < wyj.size(); i++) {
            for (int j = 0; j < wyj.get(i).getInputSize(); j++) {
                wyj.get(i).setInputWeight(j, (wyj.get(i).getInputWeight(j) + (p * bladwyj[i] * dx(wyj.get(i).finalizeData(wyj.get(i).getMembranePotential())) * ukr.get(j).finalizeData(ukr.get(j).getMembranePotential()))));
            }

        }


    }

    public static double dx(double a) {
        return a * (1 - a);
    }


    public static void licz(List<NeuralCell> neuron ) {

        double[] wyj = new double[neuron.size()];



            for (int i = 0; i < neuron.size(); i++){

                wyj[i] = neuron.get(i).finalizeData(neuron.get(i).getMembranePotential());
                java.text.DecimalFormat df = new java.text.DecimalFormat("0.000");
                    System.out.print("  " + df.format(wyj[i]));


            }
            System.out.println();
        }



    public static void pom(double[] tab, List<NeuralCell> ukr, List<NeuralCell> wej, List<NeuralCell> wyj) {

        zmienwejscie(wej, tab, 0);
        ww(ukr, wej);
        ww(wyj, ukr);


    }


    public static void rysuj(double[] tab ){
        System.out.print("\n");
        int k = 0 ;
        for (int i = 0; i <5 ; i++) {

            System.out.print("");
            for (int j = 0; j <4 ; j++) {
                if(tab[k]>0){
                    System.out.print("*");

                }
                else {
                    System.out.print(" ");
                }
                k++;


            }
            System.out.print("\n");

        }

        System.out.print("\n");

    }


}





