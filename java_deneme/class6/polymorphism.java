public class polymorphism{
    public static void main(String[] args){
        //mailLogger logger =new mailLogger();
        //logger.Log("Log mesajı.");
        //baseLogger[] loggers =new baseLogger[]{new fileLogger(), new databaseLogger(), new mailLogger(), new consolLogger()};
        //for(baseLogger logger:loggers){
        //  logger.Log("log mesajı.");
        //}

        customerManager customermanager =new customerManager(new databaseLogger()); //fileLogger  da yazzabiliriz artık.
        customermanager.add();


    }
}