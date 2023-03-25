public class CustomerManager{
    //ICustomerDal customerDal;
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }
    public void Add(){
        customerDal.Add();
    }

}