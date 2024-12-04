package com.journalApp.service;


import com.journalApp.dao.JournalRepoInterface;
import com.journalApp.entity.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalService implements JournalInterface {

    @Autowired
    private JournalRepoInterface journalRepoInterface;
    @Override
    public JournalEntry add(JournalEntry journalEntries) {
        return journalRepoInterface.save(journalEntries);
    }

    @Override
    public List<JournalEntry> getAllJournals() {
        return journalRepoInterface.findAll();
    }

    @Override
    public Optional<JournalEntry> findById(String myid) {
        return journalRepoInterface.findById(myid);
    }

    @Override
    public String removeById(String myId) {
         journalRepoInterface.deleteById(myId);
         return "given id is removed successfully";

    }

    @Override
    public JournalEntry updateById(String myId, JournalEntry journalEntries) {
        JournalEntry old=journalRepoInterface.findById(myId).orElse(null);
        if (old!=null){
            old.setTitle(journalEntries.getTitle()!=""? journalEntries.getTitle():old.getTitle());
            old.setContent(journalEntries.getContent()!=""?journalEntries.getContent():journalEntries.getContent());
        }
      return   journalRepoInterface.save(old);


    }

}













//   @Autowired()
//    StudentRepoInterface studentRepoInterface;
//
//    List<Student> studentList=new ArrayList<>();
//
//
//    @Override
//    public List<Student> getAll() {
//       return studentRepoInterface.findAll();
//
//    }
//
//    @Override
//    public Student addStudent(Student student) {
//        studentRepoInterface.save(student);
//        return student;
//    }
//
//    @Override
//    public Optional<Student> getbyId(int rollNo) {
//        return studentRepoInterface.findById(rollNo);
//    }
//
//    @Override
//    public List<Student> addStudents(List<Student> students) {
//        studentList.addAll(students);
//        return studentList;
//    }
//
//    @Override
//    public List<Student> getbyname(String name) {
//        return studentRepoInterface.getByName(name);
//    }