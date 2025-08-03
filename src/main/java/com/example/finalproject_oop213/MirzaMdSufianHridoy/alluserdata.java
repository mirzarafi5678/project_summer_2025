package com.example.finalproject_oop213.MirzaMdSufianHridoy;

public class alluserdata {
    private String setUsername;
    private String setpassword;
    private String setusertype;
    private int setid;


    public alluserdata(String setpassword, int setid, String setusertype, String setUsername) {
        this.setpassword = setpassword;
        this.setid = setid;
        this.setusertype = setusertype;
        this.setUsername = setUsername;
    }

    public String getSetUsername() {
        return setUsername;
    }

    public void setSetUsername(String setUsername) {
        this.setUsername = setUsername;
    }

    public int getSetid() {
        return setid;
    }

    public void setSetid(int setid) {
        this.setid = setid;
    }

    public String getSetusertype() {
        return setusertype;
    }

    public void setSetusertype(String setusertype) {
        this.setusertype = setusertype;
    }

    public String getSetpassword() {
        return setpassword;
    }

    public void setSetpassword(String setpassword) {
        this.setpassword = setpassword;
    }
}
