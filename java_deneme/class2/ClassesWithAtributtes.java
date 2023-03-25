    public class ClassesWithAtributtes{

        public static void main(String[] args){
         
           Product product = new Product();
           product.setname("laptop");
           product.setid(1);
           product.setdescription("lenovo");
           product.setprice(5000);
           product.setstockAmount(3);
           

    
           ProductManager productmanager =new ProductManager();
           productmanager.Add(product);

           System.out.println(product.getkod());

           /*
           productmanager.Add2(1, name "", description"", stockAmount 2, price 200);
           productmanager.Add2(1, name "", description"", stockAmount 2, price 200);
           productmanager.Add2(1, name "", description"", stockAmount 2, price 200);
            */


          /*  System.out.println(product.name);
           System.out.println(product.id);
           System.out.println(product.description);
           System.out.println(product.price);
           System.out.println(product.stockAmount);
           */
        }
    }