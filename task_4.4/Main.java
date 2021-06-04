/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", "Mammy Two Shoes", 32.5);
        Dog tykeDog = new Dog("Tyke", "Spike", false);
    }
}
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}
class Cat {
    String name;
    String ownerName;
    double height;

    public Cat(String name, String ownerName, double height) {
        this.name = name;
        this.ownerName = ownerName;
        this.height = height;
    }
}
class Dog {
    String name;
    String fatherName;
    boolean isEnemyOfJerry;

    public Dog(String name, String fatherName, boolean isEnemyOfJerry) {
        this.name = name;
        this.fatherName = fatherName;
        this.isEnemyOfJerry = isEnemyOfJerry;
    }
}
