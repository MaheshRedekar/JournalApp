package com.journalApp.controller;


import com.journalApp.entity.JournalEntry;
import com.journalApp.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Journal")
public class JournalController {

    @Autowired
    private JournalService journalService;

    @PostMapping
    public ResponseEntity<JournalEntry> addJournal(@RequestBody JournalEntry journalEntries) {
        try {
            if (journalEntries != null) {
                journalService.add(journalEntries);
            }
            return new ResponseEntity<>(journalEntries, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(journalEntries, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<JournalEntry>> getAll() {
        journalService.getAllJournals();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{myid}")
    public ResponseEntity<JournalEntry> getById(@PathVariable String myid) {
        Optional<JournalEntry> journalEntry = journalService.findById(myid);
        if (journalEntry.isPresent()) {
            return new ResponseEntity<>(HttpStatus.FOUND
            );
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{myId}")
    public ResponseEntity<String> deleteById(@PathVariable String myId) {
        journalService.removeById(myId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{myId}")
    public ResponseEntity<JournalEntry> modify(@PathVariable String myId, @RequestBody JournalEntry journalEntries) {

        if (journalEntries != null) {
            journalService.updateById(myId, journalEntries);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
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