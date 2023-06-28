package com.jhyoo.poording.Domain;

public class Diary {

    private Long diaryId;
    private String writer;
    private String title;
    private String content;
    private int regdate;
    private int updatedate;
    private int deletedate;


    public Long getDiaryId() {
        return this.diaryId;
    }

    public void setDiary_id(Long diaryId) {
        this.diaryId = diaryId;
    }

    public String getWriter() {
        return this.writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRegdate() {
        return this.regdate;
    }

    public void setRegdate(int regdate) {
        this.regdate = regdate;
    }

    public int getUpdatedate() {
        return this.updatedate;
    }

    public void setUpdatedate(int updatedate) {
        this.updatedate = updatedate;
    }

    public int getDeletedate() {
        return this.deletedate;
    }

    public void setDeletedate(int deletedate) {
        this.deletedate = deletedate;
    }

}
