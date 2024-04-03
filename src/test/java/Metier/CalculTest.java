package Metier;

import metier.Calcul;

public class CalculTest {
    private Calcul calcul;
    public void testSomme(){
        calcul=new Calcul();
        double a=5;
        double b=9;
        double expected=14;
        double res=calcul.somme(a,b);
    }
}
