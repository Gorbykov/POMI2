package com.gad;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AbiturientList extends ListPrinter<Abiturient> {


    public AbiturientList() {
    }

    public void printAdmissionTable(int n) {
        list.sort(Comparator.naturalOrder());
        List<Abiturient> passed = new ArrayList<>();
        int passingScore = -1;
        int halfPass = -1;
        if (n >= list.size()) {
            passingScore = list.get(list.size() - 1).getPoints();
            passed = list;
        } else {
            passingScore = list.get(n-1).getPoints();
            if (passingScore == list.get(n).getPoints()) {
                halfPass = passingScore;
                int buf = halfPass;
                passed = list.stream()
                        .takeWhile(f -> f.getPoints() > buf)
                        .collect(Collectors.toList());
                passingScore = passed.get(passed.size() - 1).getPoints();
            } else {
                int buf = passingScore;
                passed = list.stream()
                        .takeWhile(f -> f.getPoints() >= buf)
                        .collect(Collectors.toList());
            }
        }
        System.out.println("Проходной бал: " + (passingScore) + " -----------------");
        passed.forEach(System.out::println);
        if (halfPass != -1) {
            System.out.println("Полупроходной бал: " + (halfPass) + " -------------");
            int buf = halfPass;
            list.stream()
                    .dropWhile(f -> f.getPoints() > buf)
                    .takeWhile(f -> f.getPoints() == buf)
                    .forEach(System.out::println);
        }
        System.out.println("----------------------------------");
    }
}
