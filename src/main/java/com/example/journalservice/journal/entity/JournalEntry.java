package com.example.journalservice.journal.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class JournalEntry {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String eventType;
    @Column(name = "timestamp", columnDefinition = "TIMESTAMP")
    private Timestamp timestamp;


    // Getters and setters
}

