public class customerManager{
    private baseLogger baselogger;
    public customerManager(baseLogger logger){
        this.baselogger=logger;

    }
    public void add(){
        System.out.println("müşteri eklendi.");
        this.baselogger.log("log mesajıdır.");
        
    }

}