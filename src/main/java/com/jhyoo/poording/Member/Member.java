package com.jhyoo.poording.Member;

public class Member {

    private Long memberId;
    private String id;
    private String pw;
    private String email;
    private String phonenum;
    private int regdate;


    public Member(Long memberId, String id, String pw, String email, String phonenum, int regdate) {
        this.memberId = memberId;
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.phonenum = phonenum;
        this.regdate = regdate;
    }

    public Long getMemberId() {
        return this.memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

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

