package com.gad;

public class Abiturient extends Person {

    private int points;

    public Abiturient() {
    }

    public Abiturient(int id, String firstName, String middleName, String lastName, String phone, String address, int points) {
        super(id, firstName, middleName, lastName, phone, address);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(Object o) {
        int c = ((Abiturient) o).points - this.points ;
        if (c == 0) {
            return super.compareTo(o);
        } else {
            return c;
        }
    }

    @Override
    public String toString() {
        return String.format("%3d", points) + "|" + super.toString();
    }
}
