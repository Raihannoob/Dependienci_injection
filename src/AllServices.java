public class AllServices {
    public AllServices(){

    }
    private SmsService smsService; //Dependency
    //dependency Injection
    AllServices(SmsService smsService ){
        this.smsService = smsService;

    }
    public void sendSms(){
        smsService.sendSms();
    }
}
