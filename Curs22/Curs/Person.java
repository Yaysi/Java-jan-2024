package Curs22.Curs;

import java.util.Objects;

public class Person {
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null) {
            return false;
        }
        if (obj ==this){
            return true;
        }
        if (!(obj instanceof  Person )){
            return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
        int result = 17 ;
        result = 31+ result + name.hashCode();
        result = 31+ age;
        return result;
    }

    @Override
    public String toString() {
        return "Person name = " + name+", age= "+ age +  "]";
    }
}
