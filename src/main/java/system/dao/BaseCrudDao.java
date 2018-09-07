package system.dao;

/*
 * В данном интерфейсе описывается список методов для реализации в классах UserDaoImpl и OrderDaoImpl по работе с
 * БД UserDate (таблицы orders и users).
 */

import java.util.List;

public interface BaseCrudDao<T> {
    void save(T object);
    void update(T object);
    void delete(T object);
    List<T> findAll();
}
