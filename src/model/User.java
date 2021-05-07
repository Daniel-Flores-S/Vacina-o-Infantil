package model;

import java.util.List;

public class User {
    private String name;
    private String cpf;
    private int yearOfBirth;
    private String address;
    private String state;
    private String city;
    private List<String> vac;

    public User() {
    }

    public User(String name, String cpf, int yearOfBirth, String address, String state, String city) {
        this.name = name;
        this.cpf = cpf;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.state = state;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getVac() {
        return vac;
    }

    public void setVac(List<String> vac) {
        this.vac = vac;
    }
}

