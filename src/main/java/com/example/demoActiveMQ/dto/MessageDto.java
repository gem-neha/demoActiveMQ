package com.example.demoActiveMQ.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto {
//    private LocalDateTime dateTime;
    private String content;
    private String sender;
    private String receiver;
}
