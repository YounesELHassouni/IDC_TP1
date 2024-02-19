package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    // Couplage faible
    private IDao dao;
    public MetierImpl (IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    /*
    Injecter dans la variable dao objet
    d'une classe qui implement l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
