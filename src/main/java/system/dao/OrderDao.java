package system.dao;

import system.model.Order;
import java.util.List;

public interface OrderDao extends BaseCrudDao<Order> {
    List<Order> findOrdersById(int id);
}
