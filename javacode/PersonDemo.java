class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 30;
        person1.introduce();

        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 25;
        person2.introduce();
    }
}
