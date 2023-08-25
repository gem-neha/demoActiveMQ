package com.example.demoActiveMQ.repository;

import com.example.demoActiveMQ.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message,Integer> {
}
