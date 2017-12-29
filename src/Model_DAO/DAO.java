package Model_DAO;

import ConnectionSingleton.ConnectionToDB;

import java.sql.Connection;
import java.util.List;

public abstract class DAO<T> {
    public Connection connect = ConnectionToDB.getInstance();
    public abstract List<T> read() throws Exception;
    public abstract void create(T obj) throws Exception;
    public abstract T update(T obj) throws Exception;
    public abstract void delete(T obj) throws Exception;



}
