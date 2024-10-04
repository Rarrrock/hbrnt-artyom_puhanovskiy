package hibernate_1.models;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
// Аннотация @Entity указывает, что этот класс представляет сущность базы данных.
@Table(name = "word")
// Аннотация @Table определяет таблицу в базе данных,
// которая будет соответствовать этому классу. В данном случае — это таблица word.
@NoArgsConstructor
public class Word {
    // Поле id имеет аннотацию @Id, которая указывает, что это первичный ключ.
    // Аннотация @GeneratedValue(strategy = GenerationType.IDENTITY)
    // задает автоинкрементное значение для этого поля.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "value")
    // Поле value хранит строковое значение слова и маппится на столбец таблицы.
    private String value;

    public Word(String value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}