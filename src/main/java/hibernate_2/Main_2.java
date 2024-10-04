package hibernate_2;

import hibernate_2.models.Car_2;
import hibernate_2.enums.CarType_2;
import hibernate_2.models.DriveLicense;
import hibernate_2.models.Owner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Конфигурирование и создание фабрики сессий
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        // Создание объектов для тестирования
        DriveLicense license = new DriveLicense("A12345");
        Owner owner = new Owner("John Doe", license);
        Car_2 car21 = new Car_2("Toyota Camry", CarType_2.SEDAN, 150, 20000, 2018);
        Car_2 car22 = new Car_2("Ford Fiesta", CarType_2.HATCHBACK, 120, 15000, 2020);

        // Ассоциация автомобилей с владельцем
        car21.setOwner(owner);
        car22.setOwner(owner);

        // Открытие сессии и сохранение данных в базе данных
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            // Сохранение объектов
            session.save(license);
            session.save(owner);
            session.save(car21);
            session.save(car22);

            // Подтверждение транзакции
            transaction.commit();
            System.out.println("Данные успешно сохранены!");
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}