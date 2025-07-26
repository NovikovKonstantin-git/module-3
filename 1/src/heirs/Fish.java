package heirs;

import abstractions.Mammal;
import interfaces.Aquatic;

public class Fish extends Mammal implements Aquatic {
    public Fish(String name, int age){
        super(name, age);
    }

    @Override
    public String vertebra(String has_vertebra) {
        return has_vertebra;
    }

    @Override
    public boolean protect(boolean number) {
        return number;
    }

    @Override
    public int dive(int deep) {
        return deep;
    }

    @Override
    public double swim(double speed) {
        return speed;
    }

}
