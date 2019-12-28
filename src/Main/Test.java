package Main;

public class Test {

    public static void main(String[] args) {

        NotDefteri defter = new NotDefteri();
        defter.kisiEkle("Ahmet Ak ");

        defter.egitimNotuEkle(0, "Fizik Ders Notu ", "Ders ", "24.12.2018 ", "Egitim Notu ");
        defter.egitimNotlarıGöster(0);

        defter.yasamNotuEkle(0, "Faturalar ", "Fatura ödeme ", "24.12.2018 ", "Yasam Notu ");
        defter.yasamNotuEkle(0, "Yemek tarifleri ", "Bosnak boregi ", "24.12.2018 ", "Yasam Notu ");
        defter.yasamNotlarıGöster(0);
        

        defter.isNotuEkle(0, "Toplanti ", "Ele alınan önemli noktalar ", "24.12.2018 ", "İs Notu");
        defter.isNotlarıGöster(0);

        defter.notArama("Fat");
        defter.yasamNotuSil(0, "Yemek tarifleri ");
        defter.yasamNotlarıGöster(0);
        
        defter.kisiSil(0);
        
        
        
        
        

    }
}
