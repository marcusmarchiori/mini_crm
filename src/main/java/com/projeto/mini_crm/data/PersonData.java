package com.projeto.mini_crm.data;

import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.jni.Address;

public class PersonData {

    protected String name;

    protected String nickName;

    protected String email;

    protected int age;

    protected boolean married;

    protected String cpf;

    protected AddressData address;


    public PersonData() {
    }

    public PersonData(String name, String nickName, String email, int age, boolean married, String cpf, AddressData address) {
        this.name = name;
        this.nickName = nickName;
        this.email = email;
        this.age = age;
        this.married = married;
        this.cpf = cpf;
        this.address = address;
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

    public AddressData getAddress() {
        return address;
    }

    public void setAddress(AddressData address) {
        this.address = address;
    }

    public void validate(){
        if(StringUtils.isBlank(name)||name.length() > 80){
            throw new RuntimeException("Erro");
        }
    }



}
