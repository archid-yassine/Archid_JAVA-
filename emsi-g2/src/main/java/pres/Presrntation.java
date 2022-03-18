package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Presrntation {
    public static void main(String[] args) {
        DaoImpl2 dao=new DaoImpl2();// couplage fort
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);//injection des dépendance
        System.out.println("Résultat="+metier.calcul());
    }
}
