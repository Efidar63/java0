    public class proje1 {
        public static void main(String[] args){
            int number = 1;
            int remainder = number %2;
            System.out.println(remainder);

            boolean isprime=true;

            if(number==1){
                System.out.println("asal sayı değildir.");
            }

            if(number<1){
                System.out.println("geçersiz sayı.");
            }

            for(int i=2; i<number; i++){
                if(number % 2==0){
                    isprime= true;
                }

            }
            
            if(isprime==true){
                System.out.println("sayı asaldır.");
            }
            else{
                System.out.println("sayı asal değildir.");
            }
        }

} 