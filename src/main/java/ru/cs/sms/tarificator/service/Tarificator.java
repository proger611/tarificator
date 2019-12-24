package ru.cs.sms.tarificator.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import ru.cs.sms.tarificator.model.BalanseDto;
import ru.cs.sms.tarificator.model.SmsDto;

import java.util.HashMap;
import java.util.Map;

@Component
public class Tarificator {

    @Getter
    @Setter
    Map<String, BalanseDto> cache = new HashMap<>();

    public void tarificate(SmsDto sms) {

    }
}
