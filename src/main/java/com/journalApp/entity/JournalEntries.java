package com.journalApp.entity;


public class JournalEntries {

    private long id;
    private String name;
    private String title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public JournalEntries(long id, String name, String title) {
        this.id = id;
        this.name = name;
        this.title = title;
    }

    @Override
    public String toString() {
        return "JournalEntries{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
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