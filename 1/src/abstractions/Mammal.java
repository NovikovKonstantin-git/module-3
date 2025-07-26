package abstractions;

import interfaces.Vertebrates;

public abstract class Mammal extends Animal implements Vertebrates {

    private int age;
    public String has_vert;

    public Mammal(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String vertebra(){
        return "у вида 'Млекопитающие' есть позвоночник: ";
    }
}

