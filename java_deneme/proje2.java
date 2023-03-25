    public class proje2{
        public static void main(String[] args){
            int[] sayilar=new int[]{1,2,5,7,9,0};
            int aranacak=6;
            boolean varmı =false;

            for(int sayi :  sayilar){
                if(sayi==aranacak){
                    varmı=true;
                    break;
                }
            }
            if(varmı){
                System.out.println("sayı mevcuttur.");
            }
            else{
                System.out.println("sayı mevcut değildir.");
            }

        }
    }