package system.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import system.model.Order;
import system.model.User;

/*
 * 1. В данном классе cоздаем новый объект конфигураций Configuration, и передаем ему те классы, которые он должен воспринимать
 * как сущности - User и Order.
 * 2. Параметры для работы Hibernate находятся в файле hibernate.cfg.xml.
 * 3. Файл hibernate.cfg.xml сканируется системой при исполнении следующего кода: new Configuration().configure().
 *
 */

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {
    }

    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(User.class);
                configuration.addAnnotatedClass(Order.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Ошибка: " + e);
            }
        }
        return sessionFactory;
    }

    public static Session openSession() {
        return getSessionFactory().openSession();
    }
}
