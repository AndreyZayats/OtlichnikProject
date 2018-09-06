package system.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import system.model.User;
import system.util.HibernateSessionFactoryUtil;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {


    @Override
    public void save(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction1 = session.beginTransaction();
        session.save(user);
        transaction1.commit();
        session.close();
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public List findAll() {
        return null;
    }
}
