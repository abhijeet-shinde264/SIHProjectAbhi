package com.example.sihproject;

public class RegisterOne {

    public String fname,lname,fpno,femail,faadh,fimageuri,faddress,fcrop;

    public RegisterOne() {
    }

    public RegisterOne(String fname, String lname, String fpno, String femail, String faadh, String fimageuri) {
        this.fname = fname;
        this.lname = lname;
        this.fpno = fpno;
        this.femail = femail;
        this.faadh = faadh;
        this.fimageuri = fimageuri;
    }

    public String getFcrop() {
        return fcrop;
    }

    public void setFcrop(String fcrop) {
        this.fcrop = fcrop;
    }

    public String getFaddress() {
        return faddress;
    }

    public void setFaddress(String faddress) {
        this.faddress = faddress;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFpno() {
        return fpno;
    }

    public void setFpno(String fpno) {
        this.fpno = fpno;
    }

    public String getFemail() {
        return femail;
    }

    public void setFemail(String femail) {
        this.femail = femail;
    }

    public String getFaadh() {
        return faadh;
    }

    public void setFaadh(String faadh) {
        this.faadh = faadh;
    }

    public String getFimageuri() {
        return fimageuri;
    }

    public void setFimageuri(String fimageuri) {
        this.fimageuri = fimageuri;
    }
}
