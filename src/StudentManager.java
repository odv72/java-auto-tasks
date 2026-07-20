package com.homework;

import java.util.*;

public class StudentManager {

    /**
     * Удаляет студентов со средним баллом < 3
     */
    public static void removePoorStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove();
            }
        }
    }

    /**
     * Переводит студента на следующий курс, если средний балл >= 3
     */
    public static void promoteStudents(List<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    /**
     * Печатает имена студентов, обучающихся на указанном курсе
     */
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты на " + course + " курсе:");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("  - " + student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("  Студентов на этом курсе нет");
        }
    }

    // Метод для демонстрации работы
    public static void main(String[] args) {
        // Создаем список студентов
        List<Student> students = new ArrayList<>();

        students.add(new Student("Иванов Иван", "Группа А", 1,
                Arrays.asList(4, 5, 3, 4)));
        students.add(new Student("Петров Петр", "Группа Б", 2,
                Arrays.asList(2, 3, 2, 2))); // плохая успеваемость
        students.add(new Student("Сидорова Анна", "Группа А", 1,
                Arrays.asList(5, 5, 5, 4)));
        students.add(new Student("Козлов Дмитрий", "Группа В", 3,
                Arrays.asList(3, 3, 4, 3)));
        students.add(new Student("Смирнова Елена", "Группа Б", 2,
                Arrays.asList(2, 2, 2, 3))); // плохая успеваемость

        System.out.println("=== Исходный список студентов ===");
        students.forEach(System.out::println);

        // Удаляем студентов с плохой успеваемостью
        removePoorStudents(students);
        System.out.println("\n=== После удаления студентов со средним баллом < 3 ===");
        students.forEach(System.out::println);

        // Переводим студентов на следующий курс
        promoteStudents(students);
        System.out.println("\n=== После перевода на следующий курс ===");
        students.forEach(System.out::println);

        // Печатаем студентов на конкретном курсе
        Set<Student> studentSet = new HashSet<>(students);
        printStudents(studentSet, 2);
        printStudents(studentSet, 3);
    }
}