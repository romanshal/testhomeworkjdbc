package by.courses.roma.java.crudOperation;

import java.sql.Connection;

public interface Crud<T> {

    void create(T obj, Connection conn);

    T read(int id, Connection conn);

    void update(T obj, Connection conn);

    void delete(T obj, Connection conn);
}
