package controllers;


import domen.Person;
import domen.WorkingPerson;

import java.util.List;
/**
 * Класс, представляющий контроллер для управления счетами и выплаты зарплаты работающим сотрудникам.
 */
public class AccountController {
    /**
     * Метод для выплаты зарплаты работающему сотруднику.
     *
     * @param person Объект типа T, должен быть экземпляром класса, расширяющего WorkingPerson
     * @param salary Сумма зарплаты для выплаты
     */
    public static  <T extends WorkingPerson, V> void paySalary(T person, V salary) {
        System.out.println(person.getName() + " выплаченная зарплата: " + salary);

    }

    /**
     * @apiNote Метод для определения среднего возраста людей из списка. Тип человека ограничивается наследием класса Person
     * @param list лист с объектами-наследниками класса Person для определения среднего возраста
     * @param <M> тип-наследник класса Person
     */
    public static <M extends Person> void averageAge(List<M> list) {
        double sumForAverageAge = 0;
        for (M m : list) {
            sumForAverageAge = sumForAverageAge + m.getAge();
        }
        double averageAge = sumForAverageAge/ list.size();
        System.out.println("Средний возраст: "  + averageAge);
}}
