package ext;

import dao.IDao;

public abstract class DaoImplVWS implements IDao {
    @Override
    public double getData(){
        System.out.println("web service");
        return 90;
    }

}