package dao;

import org.springframework.stereotype.Component;

@Component("daoImpl")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
//        Se connecter a la BD pour recuperer la temperature
        System.out.println("Version de la base de donnees ...");
        double temperature = Math.random() * 40;
        return temperature;
    }

    public DaoImpl() {
    }

}
