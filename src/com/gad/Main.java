package com.gad;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            String taskN;
            do {
                taskN = scanner.next();
                switch (taskN) {
                    case "1.1": {
                        ListPrinter<Student> list = new ListPrinter<>();
                        list.add(new Student(10, "Андрей", "Андреич", "Ананов",
                                "1111111", "Омск",
                                "ФАК", 1, 666999L,
                                new GregorianCalendar(2000, 1, 1).getTime()));
                        list.add(new Student(9, "Борис", "Борисыч", "Бобриков",
                                "2222222", "Омск",
                                "ФАК", 1, 666999L,
                                new GregorianCalendar(2000, 1, 1).getTime()));
                        list.add(new Student(8, "Владимр", "Владимирович", "Влаимиров",
                                "1111111", "Омск",
                                "ФАК", 2, 666131L,
                                new GregorianCalendar(1999, 1, 1).getTime()));
                        list.add(new Student(7, "Генадий", "Генадьевич", "Генацвале",
                                "1111111", "Омск",
                                "ФАК", 2, 666131L,
                                new GregorianCalendar(1998, 1, 1).getTime()));
                        list.add(new Student(6, "Дмитрий", "Дмитриевич", "Демитров",
                                "1111111", "Омск",
                                "ФФФ", 1, 999666L,
                                new GregorianCalendar(2001, 1, 1).getTime()));
                        list.add(new Student(5, "Егор", "Егорович", "Епифанцев",
                                "1111111", "Омск",
                                "ФФФ", 1, 999666L,
                                new GregorianCalendar(1999, 1, 1).getTime()));
                        list.add(new Student(4, "Ждан", "Жданович", "Жданов",
                                "1111111", "Омск",
                                "ФФФ", 1, 666999L,
                                new GregorianCalendar(1997, 1, 1).getTime()));
                        list.add(new Student(3, "Захар", "Захарович", "Звхвров",
                                "1111111", "Омск",
                                "ФФФ", 2, 666990L,
                                new GregorianCalendar(2000, 1, 1).getTime()));
                        list.add(new Student(2, "Илья", "Илич", "Иличев",
                                "1111111", "Омск",
                                "ФФФ", 2, 666990L,
                                new GregorianCalendar(1997, 1, 1).getTime()));
                        list.add(new Student(1, "Кирилл", "Кириллович", "Кириллов",
                                "1111111", "Омск",
                                "ФФФ", 2, 666990L,
                                new GregorianCalendar(2002, 1, 1).getTime()));

                        String taskCh = scanner.next();
                        switch (taskCh.toLowerCase()) {
                            case "a": {
                                String faculty = scanner.next();
                                list.print(f -> f.getFaculty().equals(faculty.toUpperCase()));
                            }
                        }
                        break;
                    }
                }

            } while (!taskN.equals("e"));
        } catch (Throwable e) {
            e.printStackTrace();
        }

    }
}
