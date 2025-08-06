package com.example.finalproject_oop213.MirzaMdSufianHridoy;

public class PassengerData  {

    public String fullname;
        public  String bkashNumber;
        public String phoneNo;
        public String gender, typeOfSeat;
        public int needBaseCargoSpace, NumberOfTicket;
        public LaunchTrip obj;


    public PassengerData(String fullname, LaunchTrip obj, int numberOfTicket, int needBaseCargoSpace,
                         String typeOfSeat, String gender, String phoneNo, String bkashNumber) {
        this.fullname = fullname;
        this.obj = obj;
        NumberOfTicket = numberOfTicket;
        this.needBaseCargoSpace = needBaseCargoSpace;
        this.typeOfSeat = typeOfSeat;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.bkashNumber = bkashNumber;
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

    @Override
    public String toString() {
        return "PassengerData{" +
                "fullname='" + fullname + '\'' +
                ", bkashNumber='" + bkashNumber + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", gender='" + gender + '\'' +
                ", typeOfSeat='" + typeOfSeat + '\'' +
                ", needBaseCargoSpace=" + needBaseCargoSpace +
                ", NumberOfTicket=" + NumberOfTicket +
                '}';

    }


}
