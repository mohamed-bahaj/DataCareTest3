package Model_DAO;

import java.sql.Connection;

public abstract class DAO<T> {
    protected Connection dbConnect;
    public void setConnection(Connection dbConnect ){this.dbConnect = dbConnect;}
    public abstract T read(String id) throws Exception;
    public abstract T create(T obj) throws Exception;
    public abstract T update(T obj) throws Exception;
    public abstract void delete(T obj) throws Exception;

}
