package com.journalApp.service;


import com.journalApp.entity.JournalEntry;

import java.util.List;
import java.util.Optional;

public interface JournalInterface {

    JournalEntry add(JournalEntry journalEntries);

    List<JournalEntry> getAllJournals();

    Optional<JournalEntry> findById(String myid);

    String removeById(String myId);

    JournalEntry updateById(String myId, JournalEntry journalEntries);
}















////
//List<Student> getAll();
//
//    Student addStudent(Student student);
//
//    Optional<Student> getbyId(int rollNo);
//
//    List<Student> addStudents(List<Student> students);
//
//    List<Student> getbyname(String name);