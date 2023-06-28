package com.jhyoo.poording.Domain;

public class Member {

    private String id;
    private String pw;
    private String email;
    private String phonenum;
    private int regdate;


    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getPw() {
        return this.pw;
    }
    
    public void setPw(String pw) {
        this.pw = pw;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhonenum() {
        return this.phonenum;
    }
    
    public void setPhonenum(String phone_num) {
        this.phonenum = phone_num;
    }
    
    public int getRegdate() {
        return this.regdate;
    }
    
    public void setRegdate(int regdate) {
        this.regdate = regdate;
    }
}

