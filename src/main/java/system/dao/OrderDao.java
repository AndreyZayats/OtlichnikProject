package system.dao;

/*
* В данном интерфейсе наследуюются методы для их дальнейшей реализации для заказов
* (работа с данными таблицы БД orders) + добавляется специфичный для заказов метод поиска
* всех заказов пользователя по Id.
*/

import system.model.Order;
import java.util.List;

public interface OrderDao extends BaseCrudDao<Order> {
    List<Order> findOrdersById(int id);
}
