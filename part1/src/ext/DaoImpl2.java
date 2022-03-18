package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getdata() {
        System.out.println("version capteurs");
        double temp=6000;
        return temp;
    }
}
