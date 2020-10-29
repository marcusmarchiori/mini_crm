package com.projeto.mini_crm.data;

public class ContactData {

    private String email;
    private String celNumber;

    public ContactData(String email, String celNumber) {
        this.email = email;
        this.celNumber = celNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelNumber() {
        return celNumber;
    }

    public void setCelNumber(String celNumber) {
        this.celNumber = celNumber;
    }

}
