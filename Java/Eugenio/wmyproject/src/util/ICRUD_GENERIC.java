package util;

import java.util.Iterator;
import java.util.List;

public interface ICRUD_GENERIC<T> {

    public void add(T objeto) throws Exception;

    public void delete(int n) throws Exception;

    public void update(T objeto) throws Exception;

    public Iterator getAll() throws Exception;

    public Object getById(int n) throws Exception;

    public Object getByNome(String nome) throws Exception;

}
