package system.impl;

/*
 * Базовый механизм работы с данными таблиц БД (сохранение, обновление, удаление данных),
 * исползуемый впоследующем в классах OrderDaoImpl и UserDaoImpl.
 */

import org.hibernate.Session;
import org.hibernate.Transaction;

import static system.util.HibernateSessionFactoryUtil.openSession;

public class BaseImpl {
    public void saveObject(Object object) {
        Session session = openSession();
        Transaction transaction1 = session.beginTransaction();
        session.save(object);
        transaction1.commit();
        session.close();
    }

    public void updateObject(Object object) {
        Session session = openSession();
        Transaction transaction1 = session.beginTransaction();
        session.update(object);
        transaction1.commit();
        session.close();
    }

    public void deleteObject(Object object) {
        Session session = openSession();
        Transaction transaction1 = session.beginTransaction();
        session.delete(object);
        transaction1.commit();
        session.close();
    }
}
