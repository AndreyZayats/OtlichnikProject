package system.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * 1. Order - класс, возданный для взаимодействия кода Java с БД (name = "orders").
 * 2. Взаимодействие кода Java с БД осуществляется посредством ORM Hibernate (подключение библиотек для работы
 * с ним описывается в файле pom.xml).
 */

/*
 *  Класс-сущность, соответствующий БД (Java-класс User), помечается аннотациями @Entity и @Table
 *  с указанием названия таблицы, которой соответствует созданный класс Java.
 */
@Entity
@Table(name = "orders")
public class Order {

    /*
     * Аннотация @Id указывает на то, что это поле является идентификатором объектов класса Order.
     * Аннотация @GeneratedValue указывает на то, что в нашем случае id для наших объектов будут
     * генерироваться автоматически, поэтому сеттер для данного поля не создается.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /*
     * Соответствие между приватными полями класса Java (orderName, orderFilesPath, orderCommentaries, orderDeadline,
     * orderDate) и столбцами БД устанавливается с помощью аннотации @Column с указанием названия столбцов в БД.
     */

    @Column(name = "ordername")
    private String orderName;

    @Column(name = "orderfilespath")
    private String orderFilesPath;

    @Column(name = "ordercommentaries")
    private String orderCommentaries;

    @Column(name = "orderdeadline")
    private LocalDateTime orderDeadline;

    @Column(name = "orderdate")
    private LocalDateTime orderDate;

    /*
     * Аннотация @ManyToOne предназначенв для отражения факта того, что многим заказам в таблице orders может
     * соответствовать один уникальный пользователь таблицы users.
     * Аннотация @JoinColumn связывает столбец в таблице orders с таблицей user по внешнему ключу user_id.
     */

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    /*
     * Создан конструктор по умолчанию и параметризованный конструктор с параметрами: orderName, orderFilesPath,
     * orderCommentaries, orderDeadline, orderDate.
     */

    public Order() {
    }

    public Order(String orderName, String orderFilesPath, String orderCommentaries, LocalDateTime orderDeadline, LocalDateTime orderDate) {
        this.orderName = orderName;
        this.orderFilesPath = orderFilesPath;
        this.orderCommentaries = orderCommentaries;
        this.orderDeadline = orderDeadline;
        this.orderDate = orderDate;
    }

    /*
     * Созданы геттеры и сеттеры для полей класса Order, а также переопределен метод toString().
     */

    public int getId() {
        return id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderFilesPath() {
        return orderFilesPath;
    }

    public void setOrderFilesPath(String orderFilesPath) {
        this.orderFilesPath = orderFilesPath;
    }

    public String getCommentaries() {
        return orderCommentaries;
    }

    public void setCommentaries(String commentaries) {
        this.orderCommentaries = commentaries;
    }

    public LocalDateTime getOrderDeadline() {
        return orderDeadline;
    }

    public void setOrderDeadline(LocalDateTime orderDeadline) {
        this.orderDeadline = orderDeadline;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderName='" + orderName + '\'' +
                ", orderFilesPath='" + orderFilesPath + '\'' +
                ", commentaries='" + orderCommentaries + '\'' +
                ", orderDeadline=" + orderDeadline +
                ", orderDate=" + orderDate +
                '}';
    }
}
