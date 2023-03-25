    public class Product{
        public Product(){
            System.out.println("Yapıcı blok çalıştı.");
            

        }

        //atribute / field
        // this yerine  değişkenin yanına _ işareti koyulabilir
            private int id;
            private String name;
            private String description;
            private double price;
            private int stockAmount;
            private String renk;
            private String kod;

            public int getid(){
                return id;
            }
            public void setid(int id){
                this.id=id;
            }

            public String getname(){
                return name;
            }
            public void setname(String name){
                this.name=name;
            }

            public String getdescription(){
                return description;
            }
            public void setdescription(String description){
                this.description=description;
            }

            public int getprice(){
                return price;
            }
            public void setprice(double price){
                this.price=price;
            }

            public int getstockAmount(){
                return stockAmount;
            }
            public void setstockAmount(int stockAmount){
                this.stockAmount=stockAmount;
            }

            public String getrenk(){
                return renk;
            }
            public void setrenk(String renk){
                this.renk=renk;
            }
            


            public String getkod(){
                return this.name.substring(0,1) + id;
            }
            public void setkod(String kod){
                this.kod=kod;
            }

}
