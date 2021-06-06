package com.yulikexuan.greeter.cli;


import java.util.List;
import java.util.ServiceLoader;

import com.google.common.collect.Lists;
import com.yulikexuan.greeter.api.MessageService;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@NoArgsConstructor
public class Main {

    public static void main(String... args) {

        Iterable<MessageService> messageServices =
                ServiceLoader.load(MessageService.class);

        List<MessageService> msgServiceList = Lists.newArrayList();

        for (MessageService msgService : messageServices) {
            msgServiceList.add(msgService);
            String msg = msgService.getMessage();
            System.out.printf(">>>>>>> %s from a module!%n", msg);
        }

        log.info(">>>>>>> There is/are {} service implementation(s).",
                msgServiceList.size());
    }

}///:~
