package ru.cs.sms.tarificator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.cs.sms.tarificator.client.DbAdapter;

@Component
@RequiredArgsConstructor
public class TarificatorServiceImpl implements TarificatorService {

    private final DbAdapter dbAdapter;

    @Scheduled(fixedDelayString = "${timeout:60000}")
    @Override
    public void tarificate() {

    }
}
