package com.journalApp.controller;


import com.journalApp.entity.JournalEntries;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class JournalController {

    Map<Long, JournalEntries> journalEntriesMap=new HashMap<>();

    @PostMapping("/add")
    public Map<Long, JournalEntries> addJournal(@RequestBody JournalEntries journalEntries){
        journalEntriesMap.put(journalEntries.getId(), journalEntries);
        return journalEntriesMap;
    }

    @GetMapping("/getAll")
    public Map<Long, JournalEntries>  getAll(){

        return journalEntriesMap;
    }

    @GetMapping("/{myid}")
    public JournalEntries getById(@PathVariable long myid){
         return journalEntriesMap.get(myid);
    }

    @DeleteMapping("/{myId}")
    public JournalEntries deleteById(@PathVariable long myId){
        return journalEntriesMap.remove(myId);
    }

    @PutMapping("/{myId}")
    public JournalEntries modify(@PathVariable long myId, @RequestBody JournalEntries journalEntries){
        return journalEntriesMap.put(myId,journalEntries);
    }




  }







//    @GetMapping("/Students")
//    public List<Student> getAll(){
//        return studentInterface.getAll();
//    }
//
//    @PostMapping("/Student")
//    public Student addStudent(@RequestBody Student student){
//        return studentInterface.addStudent(student);
//    }
//    @PostMapping("/Students")
//    public List<Student> addStudent(@RequestBody List<Student> students){
//        return studentInterface.addStudents(students);
//    }
//    @GetMapping("/Student/{RollNo}")
//    public Optional<Student> getbyId(@PathVariable int RollNo){
//        return studentInterface.getbyId(RollNo);
//    }
//    @GetMapping("/Student/{Name}")
//    public List<Student> getByName(@PathVariable String name){
//        return studentInterface.getbyname(name);
//    }