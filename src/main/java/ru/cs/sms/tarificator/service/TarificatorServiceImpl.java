package ru.cs.sms.tarificator.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.cs.sms.tarificator.client.DbAdapter;
import ru.cs.sms.tarificator.cnst.Const;
import ru.cs.sms.tarificator.model.SmsDto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@RequiredArgsConstructor
public class TarificatorServiceImpl implements TarificatorService {

    private final Tarificator tarificator;
    private final DbAdapter dbAdapter;

    @PostConstruct
    public void init() {
        log.info("START init...");
        tarificator.setCache(dbAdapter.getBalanses().stream().collect(Collectors.toMap(x -> x.getUserId(), x -> x)));
        log.info("DONE init, get balanses size {}", tarificator.getCache().size());
    }

    @Scheduled(fixedDelayString = "${timeout:60000}")
    @Override
    public void tarificate() {
        log.info("START tarificate...");

        List<SmsDto> list = dbAdapter.getSmsForTarificate(Const.STATUS.N, LocalDateTime.now(), 1000);

        //list.stream().forEach(x -> x);

        log.info("DONE tarificate");
    }

    @PreDestroy
    public void destroy() {
        log.info("START destroy...");

        log.info("DONE destroy, balanses to save {}", tarificator.getCache().size());
    }
}
