package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        Se connecte a la Base de donnee pour récupérer la température
         */
        System.out.println("Version BD");
        double temp = Math.random()*40;
        return temp;
    }
}
