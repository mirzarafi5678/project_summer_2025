package com.example.finalproject_oop213.MirzaMdSufianHridoy;

import java.io.Serializable;

public class CreatePassengerTicket implements Serializable {
    public String  nametf,tripnumber,gender,seattype;
    public  int setid,cargosapce,numberofseat,contactnumber;
    public LaunchTrip obj=null;

    public CreatePassengerTicket(String nametf, LaunchTrip obj, int contactnumber, int numberofseat, int cargosapce,
                                 int setid, String seattype, String gender, String tripnumber) {
        this.nametf = nametf;
        this.obj = obj;
        this.contactnumber = contactnumber;
        this.numberofseat = numberofseat;
        this.cargosapce = cargosapce;
        this.setid = setid;
        this.seattype = seattype;
        this.gender = gender;
        this.tripnumber = tripnumber;
    }

    public String getNametf() {
        return nametf;
    }

    public void setNametf(String nametf) {
        this.nametf = nametf;
    }

    public LaunchTrip getObj() {
        return obj;
    }

    public void setObj(LaunchTrip obj) {
        this.obj = obj;
    }

    public int getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(int contactnumber) {
        this.contactnumber = contactnumber;
    }

    public int getNumberofseat() {
        return numberofseat;
    }

    public void setNumberofseat(int numberofseat) {
        this.numberofseat = numberofseat;
    }

    public int getCargosapce() {
        return cargosapce;
    }

    public void setCargosapce(int cargosapce) {
        this.cargosapce = cargosapce;
    }

    public int getSetid() {
        return setid;
    }

    public void setSetid(int setid) {
        this.setid = setid;
    }

    public String getSeattype() {
        return seattype;
    }

    public void setSeattype(String seattype) {
        this.seattype = seattype;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTripnumber() {
        return tripnumber;
    }

    public void setTripnumber(String tripnumber) {
        this.tripnumber = tripnumber;
    }
//   "\n"
    @Override
    public String toString() {
        return "CreatePassengerTicket{" +
                "nametf='" + nametf + "\n" +
                ", tripnumber='" + tripnumber + "\n" +
                ", gender='" + gender + "\n"+
                ", seattype='" + seattype + "\n" +
                ", setid=" + setid +"\n"+
                ", cargosapce=" + cargosapce +"\n"+
                ", numberofseat=" + numberofseat +"\n"+
                ", contactnumber=" + contactnumber +"\n"+
                ", obj=" + obj +
                '}';
    }
}
