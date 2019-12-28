
package Main;

public class IsNotu extends Not{
    public String kategori;
    
    public IsNotu(String baslik, String konusu, String tarih, String kategori) {
        super(baslik, konusu, tarih);
        this.kategori = kategori;
    }
    
}
