public class hello9{
    public static void main (String[] args){
        String[][] sehirler =new String[3][3];
        sehirler[0][0] = "şanlıurfa";
        sehirler[0][1] = "hakkari";
        sehirler[0][2] = "muş";
        sehirler[1][0] = "malatya";
        sehirler[1][1] = "trabzon";
        sehirler[1][2] = "konya";
        sehirler[2][0] = "sivas";
        sehirler[2][1] = "muğla";
        sehirler[2][2] = "istanbul";

        for(int i=0; i<=2; i++){
            System.out.println("---------------------------------");
            for(int k=0; k<=2; k++){
                System.out.println(sehirler[i][k]);
            }
        }

    }
}