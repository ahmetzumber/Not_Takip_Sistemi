
package Main;

public class EgitimNotu extends Not{
    
    public String kategori;

    public EgitimNotu(String baslik, String konusu, String tarih, String kategori) {
        super(baslik, konusu, tarih);
        this.kategori = kategori;
    }
    
}
