package com.yulikexuan.greeter.formal.service;


import com.yulikexuan.greeter.api.MessageService;
import com.yulikexuan.greeter.formal.util.CapitalizeUtil;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class FormalMessageService implements MessageService {

    @Override
    public String getMessage() {
        return CapitalizeUtil.capitalize("Formal greetings!");
    }

}///:~
