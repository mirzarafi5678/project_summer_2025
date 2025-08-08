package com.example.finalproject_oop213.MirzaMdSufianHridoy;

public class PassengerData {

    public String fullname;
        public  String bkashNumber;
        public String phoneNo;
        public String gender, typeOfSeat;
        public int needBaseCargoSpace, NumberOfTicket;
        public LaunchTrip obj= null;
        public alluserdata userobj= null;
        public boolean boughtticket= false;
        public boolean cancelticket = false;
        public boolean givefeedback= false;
        public int totalprice=0;


    public PassengerData(String fullname, LaunchTrip obj, int numberOfTicket, int needBaseCargoSpace,
                         String typeOfSeat, String gender, String phoneNo, String bkashNumber ) {


        this.fullname = fullname;
        this.obj = obj;
        NumberOfTicket = numberOfTicket;
        this.needBaseCargoSpace = needBaseCargoSpace;
        this.typeOfSeat = typeOfSeat;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.bkashNumber = bkashNumber;
    }

    public boolean isGivefeedback() {
        return givefeedback;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public void setGivefeedback(boolean givefeedback) {
        this.givefeedback = givefeedback;
    }

    public alluserdata getUserobj() {
        return userobj;
    }

    public void setUserobj(alluserdata userobj) {
        this.userobj = userobj;
    }

    public LaunchTrip getObj() {
        return obj;
    }

    public void setObj(LaunchTrip obj) {
        this.obj = obj;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getNumberOfTicket() {
        return NumberOfTicket;
    }

    public void setNumberOfTicket(int numberOfTicket) {
        NumberOfTicket = numberOfTicket;
    }

    public int getNeedBaseCargoSpace() {
        return needBaseCargoSpace;
    }

    public void setNeedBaseCargoSpace(int needBaseCargoSpace) {
        this.needBaseCargoSpace = needBaseCargoSpace;
    }

    public String getTypeOfSeat() {
        return typeOfSeat;
    }

    public void setTypeOfSeat(String typeOfSeat) {
        this.typeOfSeat = typeOfSeat;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getBkashNumber() {
        return bkashNumber;
    }

    public void setBkashNumber(String bkashNumber) {
        this.bkashNumber = bkashNumber;
    }

    public boolean isBoughtticket() {
        return boughtticket;
    }

    public void setBoughtticket(boolean boughtticket) {
        this.boughtticket = boughtticket;
    }

    public boolean isCancelticket() {
        return cancelticket;
    }

    public void setCancelticket(boolean cancelticket) {
        this.cancelticket = cancelticket;
    }

    @Override
    public String toString() {
        return "\n"+"PassengerData{" +
                "fullname='" + fullname + '\'' +
                ", bkashNumber='" + bkashNumber + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", gender='" + gender + '\'' +
                ", typeOfSeat='" + typeOfSeat + '\'' +
                ", needBaseCargoSpace=" + needBaseCargoSpace +
                ", NumberOfTicket=" + NumberOfTicket +
                ", obj=" + obj +
                ", userobj=" + userobj +
                ", boughtticket=" + boughtticket +
                ", cancelticket=" + cancelticket +
                ", givefeedback=" + givefeedback +
                ", totalprice=" + totalprice +
                '}';
    }
}
