package model;

public class Person {
    private int id;
    private String name;
    private String cccd;

    public Person() {
    }

    public Person(int id, String name, String cccd) {
        this.id = id;
        this.name = name;
        this.cccd = cccd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cccd='" + cccd + '\'' +
                '}';
    }
}
