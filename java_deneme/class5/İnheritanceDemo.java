public class İnheritanceDemo{
    public static void main(String[] args){
       // OgretmenKrediManager ogretmenkredimanager =new OgretmenKrediManager();
        //ogretmenkredimanager.Hesapla();

        KrediUİ krediui=new KrediUİ();
        krediui.KrediHesapla(new OgretmenKrediManager());
    }
}