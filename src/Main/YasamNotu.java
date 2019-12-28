
package Main;

public class YasamNotu extends Not{
    
    public String kategori;
    
    public YasamNotu(String baslik, String konusu, String tarih,String kategori) {
        super(baslik,konusu,tarih);
        this.kategori=kategori;
    }
    
}
