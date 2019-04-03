package by.courses.roma.java.entity;

public class Companys {

    private String name;

    private int members;

    public Companys() {
    }

    public Companys(String name, int members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Companys{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}
