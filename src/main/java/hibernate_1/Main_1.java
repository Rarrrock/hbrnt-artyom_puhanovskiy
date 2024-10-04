package hibernate_1;

import hibernate_1.models.Word;
import hibernate_1.models.Car_1;
import hibernate_1.enums.CarType_1;
import hibernate_1.utils.HibernateUtil;

import java.util.List;

public class Main_1 {
    public static void main(String[] args) {
        // Создание объектов Word и сохранение в базу
        HibernateUtil.saveWord(new Word("Hello"));
        HibernateUtil.saveWord(new Word("Hibernate"));
        HibernateUtil.saveWord(new Word("Java"));

        // Получение всех значений из таблицы Word
        List<String> wordValues = HibernateUtil.getAllWordValues();
        System.out.println("Word values: " + wordValues);

        // Создание объекта Car и сохранение в базу
        Car_1 car11 = new Car_1("Toyota", CarType_1.SUV, 300, 30000, 2020);
        HibernateUtil.saveCar(car11);

        // Вывод на экран значений объектов Word
        System.out.println("All word values: " + HibernateUtil.getAllWordValues());
    }
}