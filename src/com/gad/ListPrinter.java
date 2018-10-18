package com.gad;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ListPrinter<T> {

    private List<T> list = null;

    public ListPrinter() {
        this.list = new ArrayList<>();
    }

    public boolean add(T e){
        return this.list.add(e);
    }

    public T get(int index){
        return  this.list.get(index);
    }

    public T remove(int index){
        return  this.list.remove(index);
    }

    public void clear(){
        this.list.clear();
    }

    public int size(){
        return this.list.size();
    }

    public void print(Predicate<T> predicate){
        System.out.println("----------------------------------");
        list.stream()
                .filter(predicate)
                .sorted()
                .map(Objects::toString)
                .forEach(System.out::println);
        System.out.println("----------------------------------");
    }

}
