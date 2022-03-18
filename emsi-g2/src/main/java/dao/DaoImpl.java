package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getdata() {
        /*
        se connecter à la bd pour récupérer la température
         */

        System.out.println("capteur de base de donnée");
        double temp=Math.random()*40;
        return temp;
    }
}
