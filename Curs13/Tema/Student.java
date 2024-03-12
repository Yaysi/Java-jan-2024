package Curs13.Tema;

public class Student {

    String name;
    int age;

    void setName(String m) {
        name = m;
    }

    void setAge(int n) {
        this.age = n;
    }

    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }

    void text(){
        System.out.println("Jai cree une methode");
    }
}



