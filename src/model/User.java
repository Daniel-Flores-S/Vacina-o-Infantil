package model;

import java.util.List;

public class User {
    /*private String nameMother;
    private String nameFather;
    */
    private String name;
    private String cpf;
    private int yearOfBirth;
    private List<String> vac;


    public User(String name, String cpf, int yearOfBirth, List<String> vac) {
        super();
        this.name = name;
        this.cpf = cpf;
        this.yearOfBirth = yearOfBirth;
        this.vac = vac;
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
    public List<String> getVac() {
        return vac;
    }
    public void setVac(List<String> vac) {
        this.vac = vac;
    }


}

