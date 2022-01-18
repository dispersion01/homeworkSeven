package ru.spypro.homework;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
    }

    public static void exerciseOne() {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String space = " ";
        String fullName = lastName + space + firstName + space + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

    }

    public static void exerciseTwo() {
        System.out.println("Задание 2");
        String firstNameCopy = "Ivan";
        String firstName = firstNameCopy.toUpperCase();
        String middleNameCopy = "Ivanovich";
        String middleName = middleNameCopy.toUpperCase();
        String lastNameCopy = "Ivanov";
        String lastName = lastNameCopy.toUpperCase();
        String space = " ";
        String fullName = lastName + space + firstName + space + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета —  " + fullName);

    }

    public static void exerciseThree() {
        System.out.println("Задание 3");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String space = " ";
        String fullName = lastName + " " +  firstName + " " +  middleName;
        fullName = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — "+ fullName);

    }

    public static void exerciseFour() {
        System.out.println("Задание 4");
        String firstName = "Иванов";
        firstName = firstName.replace("ё", "е");
        String middleName = "Семён";
        middleName = middleName.replace("ё", "е");
        String lastName = "Семёнович";
        lastName = lastName.replace("ё", "е");
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника — "+ fullName);
    }
}
