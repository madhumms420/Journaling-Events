package com.example.journalservice.journal.repo;

import com.example.journalservice.journal.entity.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepository extends JpaRepository<JournalEntry, Long> {
}

