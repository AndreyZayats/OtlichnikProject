package system.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import system.dao.OrderDao;
import system.model.Order;
import java.util.List;

import static system.util.HibernateSessionFactoryUtil.openSession;

public class OrderDaoImpl implements OrderDao {
    public void save(Order order) {
        Session session = openSession();
        Transaction transaction1 = session.beginTransaction();
        session.save(order);
        transaction1.commit();
        session.close();
    }

    public void update(Order order) {
        Session session = openSession();
        Transaction transaction1 = session.beginTransaction();
        session.update(order);
        transaction1.commit();
        session.close();
    }

    public void delete(Order order) {
        Session session = openSession();
        Transaction transaction1 = session.beginTransaction();
        session.delete(order);
        transaction1.commit();
        session.close();
    }


    public List<Order> findAll() {
        List<Order> orders = (List<Order>) openSession().createQuery("from system.model.Order").list();
        return orders;
    }

    public List<Order> findOrdersById(int id) {
        return (List<Order>) openSession().get(Order.class, id);
    }

}
