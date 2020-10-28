package com.projeto.mini_crm.data;

public class AddressData {

    private String city;
    private String state;
    private String street;
    private int num;
    private String cep;

    public AddressData(String city, String state, String street, int num, String cep) {
        this.city = city;
        this.state = state;
        this.street = street;
        this.num = num;
        this.cep = cep;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
