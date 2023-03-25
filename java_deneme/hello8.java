    public class hello8{
        public static void main(String[] args ){
            double[] mylist = {1.2 , 2.5 , 4.3 , 5.9};
            double total=0;
            double max =mylist[0];
            for(double number : mylist){
                if( max<number ){
                    max = number;

                }
                total =  total +  number;
                System.out.println(number);
                
            }
            System.out.println("Toplam = "+ total);
            System.out.println("En Büyük = "+ max);
        }
    }