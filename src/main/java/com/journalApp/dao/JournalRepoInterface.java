package com.journalApp.dao;

import com.journalApp.entity.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepoInterface extends JpaRepository<JournalEntry, String> {



}











//    @Query("select s from Student s where s.name=?1")
//    List<Student> getByName(String name);
