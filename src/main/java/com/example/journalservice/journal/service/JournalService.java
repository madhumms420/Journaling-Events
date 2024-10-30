package com.example.journalservice.journal.service;

import com.example.journalservice.journal.entity.JournalEntry;
import com.example.UserEvent;
import com.example.journalservice.journal.repo.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;


@Service
public class JournalService {
    @Autowired
    private JournalRepository journalRepository;

    @KafkaListener(topics = "user-events", groupId = "journal-service")
    public void consumeUserEvent(UserEvent event) {
        JournalEntry entry = new JournalEntry();
        entry.setUserId(event.getUserId());
        entry.setEventType(event.getEventType());
        entry.setTimestamp(Timestamp.valueOf(LocalDateTime.now(ZoneId.of("UTC"))));
        journalRepository.save(entry);
    }
}


