package heirs;

import abstractions.Mammal;
import interfaces.Woolen;

public class Bear extends Mammal implements Woolen {
    public Bear(String name, int age) {
        super(name, age);
    }

    @Override
    public String vertebra(String has_vertebra) {
        return has_vertebra;
    }

    @Override
    public boolean protect(boolean number) {
        return false;
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
