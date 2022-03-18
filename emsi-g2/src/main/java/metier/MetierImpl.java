package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
    @Autowired
    //couplage faible
    private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getdata();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
   /*
   injecter dans la variable Dao un objet d'une classe qui implémente l'interface IDao pour eviter new // couplage fort
    */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
