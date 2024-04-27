package Curs23.Tema23;

import java.util.Objects;

public class Employees {

    int id;
    String name;
    String department;

    public Employees(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees employees)) return false;
        return id == employees.id && Objects.equals(name, employees.name) && Objects.equals(department, employees.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department);
    }
}
