package Main;

import java.util.ArrayList;

public class NotDefteri {

    public ArrayList<Kisi> kisiler = new ArrayList();

    void kisiEkle(String isim) {
        kisiler.add(new Kisi(isim));

    }

    void kisiSil(int id) {
        for (int i = kisiler.size() - 1; i >= 0; i--) {
            if (kisiler.get(i).kisiID == id) {
                kisiler.remove(i);
            }
        }
    }
     public void notArama(String arananNotunBasligi){
         ArrayList <Not> notArama = new ArrayList();
         for (int i = kisiler.size() - 1; i >= 0; i--) {
             for (int j = kisiler.get(i).notlar.size() - 1; j >= 0; j--) {
                 if (kisiler.get(i).notlar.get(j).baslik.contains(arananNotunBasligi)) {
                     notArama.add(kisiler.get(i).notlar.get(j));
                 }
             }
         }
         for (Not not : notArama) {
             not.notGöster();
         }
     }
    //****************************************YASAM NOTLARI**************************************************//

    public void yasamNotuEkle(int id, String baslik, String konusu, String tarih, String kategori) {
        for (Kisi kisi : kisiler) {
            if (kisi.kisiID == id) {
                kisi.notlar.add(new YasamNotu(baslik, konusu, tarih, kategori));
            }
        }
    }

    public void yasamNotuSil(int id, String silinecekNotunBaslıgı) {
        for (int i = kisiler.size() - 1; i >= 0; i--) {
            if (kisiler.get(i).kisiID == id) {

                for (int j = kisiler.get(i).notlar.size() - 1; j >= 0; j--) {

                    if (kisiler.get(i).notlar.get(j).baslik.equals(silinecekNotunBaslıgı)) {
                        kisiler.get(i).silinmisNotlar.add(kisiler.get(i).notlar.get(j));
                        kisiler.get(i).notlar.remove(j);
                      
                    }

                }

            }
        }
        System.out.println("Yasam notunuz silinmistir. ");
    }

    public void yasamNotlarıGöster(int id) {
        int kontrol = 0;
        for (int i = kisiler.size() - 1; i >= 0; i--) {
            if (kisiler.get(i).kisiID == id) {
                kontrol++;
                for (Not not : kisiler.get(i).notlar) {
                    if (not instanceof YasamNotu) {
                        System.out.println("---------------Yasam Notları----------------");
                        System.out.println("Kisinin ismi : " + kisiler.get(i).isim);
                        System.out.println("Notun basligi : " + ((YasamNotu) not).baslik);
                        System.out.println("Notun konusu : " + ((YasamNotu) not).konusu);
                        System.out.println("Notun tarihi : " + ((YasamNotu) not).tarih);
                        System.out.println("Notun kategorisi : " + ((YasamNotu) not).kategori);
                    }
                }

            }
        }
        if (kontrol == 0) {
            System.out.println("Gecersiz ID !!");
        }
    }
    //****************************************EGİTİM NOTLARI**************************************************//

    public void egitimNotuEkle(int id, String baslik, String konusu, String tarih, String kategori) {
        for (Kisi kisi : kisiler) {
            if (kisi.kisiID == id) {
                kisi.notlar.add(new EgitimNotu(baslik, konusu, tarih, kategori));
            }
        }
    }

    public void egitimNotuSil(int id, String silinecekNotunBasligi) {
        for (int i = kisiler.size() - 1; i >= 0; i--) {
            if (kisiler.get(i).kisiID == id) {
                for (int j = kisiler.get(i).notlar.size() - 1; j >= 0; j--) {
                    if (kisiler.get(i).notlar.get(j).baslik.equals(silinecekNotunBasligi)) {
                        kisiler.get(i).silinmisNotlar.add(kisiler.get(i).notlar.get(j));
                        kisiler.get(i).notlar.remove(j);
                    }
                }
            }
        }
        System.out.println("Egitim notunuz silinmistir. ");
    }

    public void egitimNotlarıGöster(int id) {
        int kontrol = 0;
        for (int i = kisiler.size() - 1; i >= 0; i--) {
            if (kisiler.get(i).kisiID == id) {
                kontrol++;
                for (Not not : kisiler.get(i).notlar) {
                    if (not instanceof EgitimNotu) {
                        System.out.println("-------------Egitim Notları--------------");
                        System.out.println("Kisinin ismi: " + kisiler.get(i).isim);
                        System.out.println("Notun basligi : " + ((EgitimNotu) not).baslik);
                        System.out.println("Notun konusu : " + ((EgitimNotu) not).konusu);
                        System.out.println("Notun tarihi : " + ((EgitimNotu) not).tarih);
                        System.out.println("Notun kategorisi : " + ((EgitimNotu) not).kategori);
                    }
                }
            }
        }
        if (kontrol == 0) {
            System.out.println("Gecersiz ID !!");
        }

    }

    //****************************************İS NOTLARI**************************************************//
    public void isNotuEkle(int id, String baslik, String konusu, String tarih, String kategori) {
        for (Kisi kisi : kisiler) {
            if (kisi.kisiID == id) {
                kisi.notlar.add(new IsNotu(baslik, konusu, tarih, kategori));
            }
        }
    }

    public void isNotuSil(int id, String silinecekNotunBasligi) {
        for (int i = kisiler.size() - 1; i >= 0; i--) {
            if (kisiler.get(i).kisiID == id) {
                for (int j = kisiler.get(i).notlar.size(); j >= 0; j--) {
                    if (kisiler.get(i).notlar.get(j).baslik.equals(silinecekNotunBasligi)) {
                        kisiler.get(i).silinmisNotlar.add(kisiler.get(i).notlar.get(i));
                        kisiler.get(i).notlar.get(j);
                    }
                }
            }
        }
        System.out.println("Is notunuz silinmistir. ");
    }

    public void isNotlarıGöster(int id) {
        int kontrol = 0;
        for (int i = kisiler.size() - 1; i >= 0; i--) {
            if (kisiler.get(i).kisiID == id) {
                kontrol++;
                for (Not not : kisiler.get(i).notlar) {
                    if (not instanceof IsNotu) {
                        System.out.println("--------------Is Notlari--------------");
                        System.out.println("Kisinin ismi : " + kisiler.get(i).isim);
                        System.out.println("Notun basligi : " + ((IsNotu) not).baslik);
                        System.out.println("Notun konusu : " + ((IsNotu) not).konusu);
                        System.out.println("Notun tarihi : " + ((IsNotu) not).tarih);
                        System.out.println("Notun kategorisi : " + ((IsNotu) not).kategori);
                    }
                }
            }
        }
        if (kontrol == 0) {
            System.out.println("Gecersiz ID !!");
        }
    }
    //*****************************************************************************************************//

    public void silinmisNotlarıSil(int id) {
        for (int i = kisiler.size() - 1; i >= 0; i--) {
            if (kisiler.get(i).kisiID == id) {
                for (int j = kisiler.get(i).silinmisNotlar.size() - 1; j >= 0; j--) {
                    kisiler.get(i).silinmisNotlar.remove(j);
                }
            }
        }
        System.out.println("Çöp kutusu temizlendi. ");
    }

    public void kisileriBastir() {
        for (Kisi kisi : kisiler) {
            System.out.println("Kisinin ismi : " + kisi.isim);
            System.out.println("Kisi ID : " + kisi.kisiID);
        }
        
        
    }

}
