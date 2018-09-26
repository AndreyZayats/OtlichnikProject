package system.dao;

/*
 * В данном интерфейсе наследуюются методы для их дальнейшей реализации для пользователей
 * (работа с данными таблицы БД users).
 */

import system.model.User;

public interface UserDao extends BaseCrudDao<User> {
}
