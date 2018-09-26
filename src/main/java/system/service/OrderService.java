package system.service;

/*
 * Создаем бизнес-логику для работы приложения. При работе сервисов используются методы DAO, имплементированные и
 * реализованные в классе OrderDaoImpl.
 */

import system.impl.OrderDaoImpl;
import system.model.Order;

import java.util.List;

public class OrderService {
    private OrderDaoImpl orderDaoImpl = new OrderDaoImpl();

    public OrderService() {
    }

    public void saveOrder(Order order) {
        try {
        orderDaoImpl.save(order);
        System.out.println("Заказ успешно сохранен в БД");}
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void updateOrder(Order order) {
        try {
            orderDaoImpl.update(order);
            System.out.println("Заказ успешно обновлен в БД");}
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteOrder(Order order) {
        try {
            orderDaoImpl.delete(order);
            System.out.println("Заказ успешно удален из БД");}
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public List<Order> findAll() {
        try {
            orderDaoImpl.findAll();
            System.out.println("Все заказы успешно найдены");}
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Order> findOrdersById(int id) {
        try {
            orderDaoImpl.findOrdersById(id);
            System.out.println("Все заказы пользователя успешно найдены");}
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
