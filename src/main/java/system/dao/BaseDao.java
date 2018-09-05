package system.dao;

import system.model.User;

public interface BaseDao<T> {
    void save(T model);
    T getT(T model);
}
