package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDaoImpl;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDaoImpl userDao;

    public List getAllUsers() {
        return userDao.getAllUsers();
    }
}
