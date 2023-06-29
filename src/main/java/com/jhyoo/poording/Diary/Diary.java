package com.jhyoo.poording.Diary;

public class Diary {

    private Long diaryId;
    private String writer;
    private String title;
    private String content;
    private int regdate;
    private int updatedate;
    private int deletedate;


    public Diary(Long diaryId, String writer, String title, String content, int regdate, int updatedate, int deletedate) {
        this.diaryId = diaryId;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.regdate = regdate;
        this.updatedate = updatedate;
        this.deletedate = deletedate;
    }

    public Long getDiaryId() {
        return this.diaryId;
    }

    public void setDiaryid(Long diaryId) {
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
