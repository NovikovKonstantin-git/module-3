package heirs;

import abstractions.Mammal;
import interfaces.Woolen;

public class Cat extends Mammal implements Woolen {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String vertebra(String has_vertabra){
        return has_vertabra;
    }

    @Override
    public boolean protect(boolean number) {
        return number;
    }

    @Override
    public int shed(int percent) {
        return percent;
    }

    @Override
    public int go_grey(int degree) {
        return degree;
    }

    @Override
    public double grow(double rise) {
        return rise;
    }
}
