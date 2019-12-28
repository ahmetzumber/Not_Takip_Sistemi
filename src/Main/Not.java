
package Main;

public class Not {
    
    public String baslik;
    public String konusu;
    public String tarih;

    public Not(String baslik, String konusu, String tarih) {
        this.baslik = baslik;
        this.konusu = konusu;
        this.tarih = tarih;
    }
    public void notGöster(){
        System.out.println("-------Aranan Not--------");
        System.out.println("Baslik : "+baslik+"\n"
        +"Konusu : "+konusu+"\n"
        +"Tarihi : "+tarih+"\n");            
    }
    
    
    
    
}
