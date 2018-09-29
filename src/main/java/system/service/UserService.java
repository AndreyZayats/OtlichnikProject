package system.service;

/*
 * Создаем бизнес-логику для работы приложения. При работе сервисов используются методы DAO, имплементированные и
 * реализованные в классе UserDaoImpl.
 */

import org.springframework.stereotype.Component;
import system.impl.UserDaoImpl;
import system.model.User;

import java.util.List;

@Component
public class UserService {
    private UserDaoImpl userDaoImpl = new UserDaoImpl();

    public UserService() {
    }

    public void saveUser(User user) {
        try {
            userDaoImpl.save(user);
            System.out.println("Пользователь успешно сохранен в БД");}
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        try {
            userDaoImpl.update(user);
            System.out.println("Пользователь успешно обновлен в БД");}
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(User user) {
        try {
            userDaoImpl.delete(user);
            System.out.println("Пользователь успешно удален из БД");}
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public List<User> findAll() {
        try {
            userDaoImpl.findAll();
            System.out.println("Все пользователи успешно найдены");}
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
