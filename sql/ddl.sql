-- board Table Create SQL
CREATE TABLE diary
(
    `diary_id`    INT              NOT NULL    AUTO_INCREMENT COMMENT '다이어리ID', 
    `writer`      VARCHAR(50)      NOT NULL    COMMENT '작성자', 
    `title`       VARCHAR(50)      NOT NULL    COMMENT '제목', 
    `content`     VARCHAR(1000)    NOT NULL    COMMENT '내용', 
    `regdate`     DATETIME         NOT NULL    COMMENT '등록일자', 
    `updatedate`  DATETIME         NULL        COMMENT '수정일자', 
    `deletedate`  DATETIME         NULL        COMMENT '삭제일자', 
     PRIMARY KEY (diary_id)
);

ALTER TABLE diary COMMENT '다이어리에 관한 테이블';


-- board Table Create SQL
CREATE TABLE member
(
    `id`         VARCHAR(50)     NOT NULL    COMMENT '아이디', 
    `pw`         VARCHAR(100)    NOT NULL    COMMENT '비밀번호', 
    `email`      VARCHAR(100)    NOT NULL    COMMENT '이메일', 
    `phone_num`  VARCHAR(45)     NOT NULL    COMMENT '휴대전화', 
    `regdate`    DATETIME        NOT NULL    COMMENT '가입일자', 
     PRIMARY KEY (id)
);

ALTER TABLE member COMMENT '회원에 관한 테이블';

ALTER TABLE member
    ADD CONSTRAINT FK_member_id_diary_writer FOREIGN KEY (id)
        REFERENCES diary (writer) ON DELETE RESTRICT ON UPDATE RESTRICT;
