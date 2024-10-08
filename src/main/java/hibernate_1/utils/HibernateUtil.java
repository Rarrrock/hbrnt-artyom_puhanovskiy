package hibernate_1.utils;

import hibernate_1.models.Word;
import hibernate_1.models.Car_1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HibernateUtil {

    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public static void saveWord(Word word) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(word);
        transaction.commit();
        session.close();
    }

    public static List<String> getAllWordValues() {
        Session session = sessionFactory.openSession();
        List<String> words = session.createQuery("SELECT w.value FROM Word w", String.class).getResultList();
        session.close();
        return words;
    }

    public static void saveCar(Car_1 car1) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(car1);
        transaction.commit();
        session.close();
    }
}
