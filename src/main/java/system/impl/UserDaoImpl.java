package system.impl;

/*
 * Реализация, согласно концепции DAO, методов работы с таблицами БД путем наследования этих методов от
 * класса инструментов работы с данными BaseImpl и имплементирования интерфейса UserDao с данными методами.
 */

import org.springframework.stereotype.Repository;
import system.dao.UserDao;
import system.model.User;

import java.util.List;

import static system.util.HibernateSessionFactoryUtil.openSession;

@Repository
public class UserDaoImpl extends BaseImpl implements UserDao {

    @Override
    public void save(User user) {
        saveObject(user);
    }

    @Override
    public void update(User user) {
        updateObject(user);
    }

    @Override
    public void delete(User user) {
        deleteObject(user);
    }

    @Override
    public List<User> findAll() {
        List<User> users = (List<User>) openSession().createQuery("from system.model.User").list();
        return users;
    }
}
