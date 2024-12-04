package com.journalApp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JournalTable")
public class JournalEntry {
    @Id
    private String id;
    private String title;
    private String content;

    public JournalEntry() {
    }

    public JournalEntry(String id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "JournalEntry{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}



















//    private  String name;
//    @Id
//    private int rollNo;
//    private int marks;
//
//
//
//    public Student(String name, int rollNo, int marks) {
//        this.name = name;
//        this.rollNo = rollNo;
//        this.marks = marks;
//    }
//
//    public Student() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getRollNo() {
//        return rollNo;
//    }
//
//    public void setRollNo(int rollNo) {
//        this.rollNo = rollNo;
//    }
//
//    public int getMarks() {
//        return marks;
//    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", rollNo=" + rollNo +
//                ", marks=" + marks +
//                '}';
//    }