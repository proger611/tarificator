package ru.cs.sms.tarificator.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import ru.cs.sms.tarificator.cnst.Const.*;
import ru.cs.sms.tarificator.model.BalanseDto;
import ru.cs.sms.tarificator.model.SmsDto;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@FeignClient(value = "db-adapter")
public interface DbAdapter {

    @GetMapping(value = "/sms/user/list")
    public List<SmsDto> getSmsForTarificate(@RequestParam("status") final STATUS status,
                                            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) final LocalDateTime date,
                                            @RequestParam(required = false) final Integer cnt);

    @PostMapping(value = "/sms/update")
    public void updateStatusSms(@Valid @RequestBody List<SmsDto> list);

    @GetMapping(value = "///")
    public List<BalanseDto> getBalanses();
}
