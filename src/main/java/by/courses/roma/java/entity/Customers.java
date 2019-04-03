package by.courses.roma.java.entity;

public class Customers {

    private int id;

    private String firstName;

    public Customers() {
    }

    public Customers(int id,String firstName) {
        this.id = id;
        this.firstName=firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
