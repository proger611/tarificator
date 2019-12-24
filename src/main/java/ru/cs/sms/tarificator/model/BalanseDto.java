package ru.cs.sms.tarificator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BalanseDto {
    private String userId;
    private Integer sendBalanse;
    private Integer payBalanse;
    private Integer infoBalanse;
    private Integer callBalanse;
    private Integer phoneBalanse;
    private Integer viberBalanse;
    private Integer whatsapBalanse;
    private LocalDateTime createBalanse;
    private LocalDateTime updateBalanse;
}
