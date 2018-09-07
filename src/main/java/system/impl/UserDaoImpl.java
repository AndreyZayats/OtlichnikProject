package system.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import system.dao.UserDao;
import system.model.User;

import java.util.List;

import static system.util.HibernateSessionFactoryUtil.openSession;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {
        Session session = openSession();
        Transaction transaction1 = session.beginTransaction();
        session.save(user);
        transaction1.commit();
        session.close();
    }


    @Override
    public void update(User user) {
        Session session = openSession();
        Transaction transaction1 = session.beginTransaction();
        session.update(user);
        transaction1.commit();
        session.close();
    }

    @Override
    public void delete(User user) {
        Session session = openSession();
        Transaction transaction1 = session.beginTransaction();
        session.delete(user);
        transaction1.commit();
        session.close();
    }

    @Override
    public List<User> findAll() {
        List<User> users = (List<User>) openSession().createQuery("from system.model.User").list();
        return users;
    }
}
