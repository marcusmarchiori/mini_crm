package com.projeto.mini_crm.data;

public class PersonData {

    private String name;

    private String nickName;

    private String email;

    private int age;

    private boolean married;

    private String cpf;

    public PersonData() {
    }

    public PersonData(String name, String nickName, String email, int age, boolean married, String cpf) {
        this.name = name;
        this.nickName = nickName;
        this.email = email;
        this.age = age;
        this.married = married;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
