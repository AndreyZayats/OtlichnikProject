package system.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import system.model.Order;
import system.util.HibernateSessionFactoryUtil;
import java.util.List;

public class OrderDaoImpl implements OrderDao {
    public void save(Order order) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction1 = session.beginTransaction();
        session.save(order);
        transaction1.commit();
        session.close();
    }

    public void update(Order order) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction1 = session.beginTransaction();
        session.update(order);
        transaction1.commit();
        session.close();
    }

    public void delete(Order order) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction1 = session.beginTransaction();
        session.delete(order);
        transaction1.commit();
        session.close();
    }


    public List<Order> findAll() {
        List<Order> orders = (List<Order>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From UserData").list();
        return orders;
    }

    public List<Order> findById(int id) {
        return (List<Order>) HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Order.class, id);
    }

}
