package ru.cs.sms.tarificator.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.cs.sms.tarificator.model.SmsDto;

import java.util.List;

@FeignClient(value = "db-adapter")
public interface DbAdapter {

    @GetMapping(value ="///")
    public SmsDto getSmsForTarificate();

    @GetMapping(value ="///")
    public SmsDto getBalanses();

    @PostMapping
    public void updateStatusSms(List<SmsDto> list);
}
