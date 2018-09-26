package system.impl;

/*
 * Реализация, согласно концепции DAO, методов работы с таблицами БД путем наследования этих методов от
 * класса инструментов работы с данными BaseImpl и имплементирования интерфейса OrderDao с данными методами.
 */

import org.springframework.stereotype.Repository;
import system.dao.OrderDao;
import system.model.Order;
import java.util.List;

import static system.util.HibernateSessionFactoryUtil.openSession;

@Repository
public class OrderDaoImpl extends BaseImpl implements OrderDao {
    public void save(Order order) {
        saveObject(order);
    }

    public void update(Order order) {
        updateObject(order);
    }

    public void delete(Order order) {
        deleteObject(order);
    }


    public List<Order> findAll() {
        List<Order> orders = (List<Order>) openSession().createQuery("from system.model.Order").list();
        return orders;
    }

    public List<Order> findOrdersById(int id) {
        return (List<Order>) openSession().get(Order.class, id);
    }
}
