package com.projeto.mini_crm.data;

public class PatientData extends PersonData{

    private int protocolNumber;

    public PatientData(int protocolNumber) {
        this.protocolNumber = protocolNumber;
    }

    public PatientData(String name, String nickName, String email, int age, boolean married, String cpf, AddressData address, int protocolNumber) {
        super(name, nickName, email, age, married, cpf, address);
        this.protocolNumber = protocolNumber;
    }

    public int getProtocolNumber() {
        return protocolNumber;
    }

    public void setProtocolNumber(int protocolNumber) {
        this.protocolNumber = protocolNumber;
    }

    @Override
    public void validate(){
        super.validate();
        if((protocolNumber % 2) == 0){
            throw new RuntimeException("Erro");
        }
    }

}

