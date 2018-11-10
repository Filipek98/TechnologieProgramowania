public class Produkty{
    String nazwa_produktu;
    double cena;
    int ilosc;
    Produkty(String produkt, double cena, int ilosc){
        this.nazwa_produktu=produkt;
        this.cena=cena;
        this.ilosc=ilosc;
    }
    public double cena(){
        return cena;
    }
    public int ilosc(){
        return ilosc;
    }
    public double suma(){
        return cena*ilosc;
    }

}
