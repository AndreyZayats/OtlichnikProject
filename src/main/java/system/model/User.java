package system.model;

import javax.persistence.*;
import java.util.List;

/**
 * 1. User - класс, возданный для взаимодействия кода Java с БД (name = "users").
 * 2. Взаимодействие кода Java с БД осуществляется посредством ORM Hibernate (подключение библиотек для работы
 * с ним описывается в файле pom.xml).
 */

/*
 *  Класс-сущность, соответствующий БД (Java-класс User), помечается аннотациями @Entity и @Table
 *  с указанием названия таблицы, которой соответствует созданный класс Java.
 */
@Entity
@Table(name = "users")
public class User {

    /*
     * Аннотация @Id указывает на то, что это поле является идентификатором объектов класса User.
     * Аннотация @GeneratedValue указывает на то, что в нашем случае id для наших объектов будут
     * генерироваться автоматически, поэтому сеттер для данного поля не создается.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /*
     * Соответствие между приватными полями класса Java (userName, userLogin, userPassword, userEMail,
     * userTelephone) и столбцами БД устанавливается с помощью аннотации @Column с указанием названия столбцов в БД.
     */

    @Column(name = "username")
    private String userName;

    @Column(name = "userlogin")
    private String userLogin;

    @Column(name = "userpassword")
    private String userPassword;

    @Column(name = "useremail")
    private String userEMail;

    @Column(name = "usertelephone")
    private String userTelephone;

    /*
     * Аннотация @OneToMany предназначенв для отражения факта того, что одному пользователю в таблице users
     * может соответствовать несколько записей в таблице orders. При этом настройки cascade и orphanRemoval
     * предназначены для выполнения операций CREATE, REMOVE, UPDATE, DELETE на связанные с пользователями заказы.
     */
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders;

    /*
     * Создан конструктор по умолчанию и параметризованный конструктор с параметрами: userName, userLogin,
     * userPassword, userEMail, userTelephone.
     */

    public User() {
    }

    public User(String userName, String userLogin, String userPassword, String userEMail, String userTelephone) {
        this.userName = userName;
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.userEMail = userEMail;
        this.userTelephone = userTelephone;
    }

    /*
     * Созданы геттеры и сеттеры для полей класса User, а также переопределен метод toString().
     */

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEMail() {
        return userEMail;
    }

    public void setUserEMail(String userEMail) {
        this.userEMail = userEMail;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userLogin='" + userLogin + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEMail='" + userEMail + '\'' +
                ", userTelephone='" + userTelephone + '\'' +
                '}';
    }
}
