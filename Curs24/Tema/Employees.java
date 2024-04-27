package Curs24.Tema;
public class Employees {

    String name;
    Integer id;

    public Employees(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "[Employee name = " + name+" and his is = "+ id +  "]";
    }
}



