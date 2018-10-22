package com.gad;

import org.jetbrains.annotations.NotNull;

import java.nio.CharBuffer;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharSet {

    TreeSet<Character> set;

    public CharSet() {
        this.set = new TreeSet<>();
    }

    public CharSet(@NotNull Collection<Character> set) {
        this.set = new TreeSet<>(set);
    }

    public CharSet(@NotNull Character[] set) {
        this(Arrays.asList(set));
    }

    public CharSet(@NotNull char[] array) {
        this(CharBuffer.wrap(array));
    }

    public CharSet(@NotNull CharBuffer charBuffer) {
        this(charBuffer.toString());
    }

    public CharSet(@NotNull String string) {
        this(string.chars().mapToObj(f->(char)f).toArray(Character[]::new));
    }

    public boolean contains(char ch){
        return set.contains(ch);
    }

    public boolean containsAll(Collection<Character> c){
        return set.containsAll(c);
    }

    public boolean add(char ch){
        return set.add(ch);
    }

    public boolean addAll(Collection<Character> c){
        return set.addAll(c);
    }

    public boolean intersection(CharSet charSet){
        return this.set.retainAll(charSet.set);
    }

    public boolean diff(CharSet charSet){
        return this.set.removeAll(charSet.set);
    }

    public Iterator<Character>getIt(){
        return set.iterator();
    }
}
