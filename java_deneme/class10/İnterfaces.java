public class İnterfaces{
    public static void main(String[] args){
        /*CustomerManager customerManager=new CustomerManager();
        customerManager.customerDal=new OracleCustomerDal();
        customerManager.Add();*/
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.Add();
        
    }
}