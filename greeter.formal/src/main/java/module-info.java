module greeter.formal {

    requires greeter.api;

    provides com.yulikexuan.greeter.api.MessageService
            with com.yulikexuan.greeter.formal.service.FormalMessageService;

}
