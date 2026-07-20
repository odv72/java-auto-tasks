package com.homework;

import java.util.*;

public class PhoneDirectory {
    // Храним фамилию и список телефонных номеров
    private Map<String, List<String>> directory;

    public PhoneDirectory() {
        this.directory = new HashMap<>();
    }

    /**
     * Добавляет запись в справочник
     * @param surname фамилия
     * @param phoneNumber номер телефона
     */
    public void add(String surname, String phoneNumber) {
        // Если фамилии нет в справочнике, создаем новый список
        if (!directory.containsKey(surname)) {
            directory.put(surname, new ArrayList<>());
        }
        // Добавляем номер в список для этой фамилии
        directory.get(surname).add(phoneNumber);
    }

    /**
     * Получает все номера телефонов по фамилии
     * @param surname фамилия
     * @return список номеров или пустой список, если фамилия не найдена
     */
    public List<String> get(String surname) {
        return directory.getOrDefault(surname, Collections.emptyList());
    }

    /**
     * Получает все записи справочника
     */
    public Map<String, List<String>> getAll() {
        return new HashMap<>(directory); // возвращаем копию
    }

    /**
     * Удаляет номер телефона у конкретной фамилии
     */
    public boolean removePhoneNumber(String surname, String phoneNumber) {
        if (directory.containsKey(surname)) {
            List<String> phones = directory.get(surname);
            boolean removed = phones.remove(phoneNumber);
            if (phones.isEmpty()) {
                directory.remove(surname); // если список стал пустым, удаляем фамилию
            }
            return removed;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Телефонный справочник:\n");
        for (Map.Entry<String, List<String>> entry : directory.entrySet()) {
            sb.append("  ").append(entry.getKey()).append(": ");
            sb.append(String.join(", ", entry.getValue()));
            sb.append("\n");
        }
        return sb.toString();
    }

    // Метод для демонстрации работы
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        // Добавляем записи
        phoneDirectory.add("Иванов", "+7-999-123-45-67");
        phoneDirectory.add("Петров", "+7-999-234-56-78");
        phoneDirectory.add("Иванов", "+7-999-345-67-89"); // второй телефон Иванова
        phoneDirectory.add("Сидоров", "+7-999-456-78-90");
        phoneDirectory.add("Иванов", "+7-999-567-89-01"); // третий телефон Иванова

        System.out.println(phoneDirectory);

        // Поиск по фамилии
        System.out.println("=== Поиск номеров ===");
        System.out.println("Телефоны Иванова: " + phoneDirectory.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneDirectory.get("Петров"));
        System.out.println("Телефоны Смирнова (нет в справочнике): " + phoneDirectory.get("Смирнов"));

        // Удаление номера
        System.out.println("\n=== Удаление номера ===");
        boolean removed = phoneDirectory.removePhoneNumber("Иванов", "+7-999-123-45-67");
        System.out.println("Номер удален: " + removed);
        System.out.println("Телефоны Иванова после удаления: " + phoneDirectory.get("Иванов"));

        // Удаление последнего номера
        phoneDirectory.removePhoneNumber("Иванов", "+7-999-345-67-89");
        phoneDirectory.removePhoneNumber("Иванов", "+7-999-567-89-01");
        System.out.println("\nПосле удаления всех номеров Иванова:");
        System.out.println("Телефоны Иванова: " + phoneDirectory.get("Иванов"));
        System.out.println(phoneDirectory);
    }
}