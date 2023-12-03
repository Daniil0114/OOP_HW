package HW1;

import HW1.Animal;
import HW1.DOG;
import HW1.DUCK;

public class Main {
    // В абстрактном классе мы пишем правила для всех животных (общее поведение для всех животных) и любой объект который
    // хочет стать животным, обязан следовать этим правилам.
    public static void main(String[] args) {
        System.out.println("Кошка: ");
        Animal vaska = new DUCK(200,2,2);
        vaska.run(1450);
        vaska.swim(1);
        vaska.jump(2);

        System.out.println("Собака: ");
        Animal elka = new DOG(500,3,2);
        elka.run(400);
        elka.swim(2);
        elka.jump(5);
    }


//    public static void main(String[] args) {
//        Animal vaska = new Cat("Васька");
//        System.out.println(vaska.getAnimalName());
//        vaska.run(600);
//        vaska.jump(1.5f);
//        vaska.swim(1);
//
//        Animal sharik = new Cat("Шарик");
//        System.out.println(sharik.getAnimalName());
//
//
//        // Создать массив животных и попробовать написать Animal[0] = new Cat
//        Animal[] animals = new Animal[5];
//        animals[0] = new Cat("Елка");
//        animals[1] = new Dog("Муха");
//        ...
//    }
}
