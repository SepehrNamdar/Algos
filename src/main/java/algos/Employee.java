package algos;

import java.util.Objects;

public class Employee /* implements Comparable<Employee> */ {
    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

//    @Override
//    public int compareTo(Employee employee) {
//        return this.id - employee.getId();    // To sort by id
//        return getName().compareTo(employee.getName()); // To sort by name
//    }
}
