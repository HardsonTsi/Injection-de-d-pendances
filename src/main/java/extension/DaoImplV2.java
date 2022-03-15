package extension;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("daoImplV2")
public class DaoImplV2 implements IDao {


    @Override
    public double getData() {
        System.out.println("Nouvelle version du l'application");
        return 88;
    }
}
