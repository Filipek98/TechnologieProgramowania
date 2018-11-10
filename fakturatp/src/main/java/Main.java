import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String nazwa_firmy, decyzja, nazwa_produktu, jaki_plik;
        double cena, sumaccen;
        int ilosc, wybor;
        decyzja = "";
        sumaccen = 0;
        wybor=0;
        while (wybor != 3) {
            List<Produkty> lista = new ArrayList<Produkty>();
            System.out.println("1.Dodaj fakturę");
            System.out.println("2.Wczytaj fakturę ");
            System.out.println("3.Wyjdź");
            Scanner odczyt = new Scanner(System.in);
            wybor = Integer.parseInt(odczyt.nextLine());
            if (wybor == 1) {
                System.out.print("Podaj nazwę firmy: ");
                Scanner odczyt1 = new Scanner(System.in);
                nazwa_firmy = odczyt1.nextLine();
                PrintWriter zapis = new PrintWriter("C:\\Users\\fkula\\IdeaProjects\\fakturatp\\Faktury\\" + nazwa_firmy + ".txt");
                while (!decyzja.equals("nie")) {
                    System.out.print("Czy chcesz dodać produkt? tak/nie: ");
                    Scanner odczyt2 = new Scanner(System.in);
                    decyzja = odczyt2.nextLine();
                    if (decyzja.equals("tak")) {
                        System.out.print("Nazwa produktu: ");
                        Scanner odczyt3 = new Scanner(System.in);
                        nazwa_produktu = odczyt3.nextLine();
                        System.out.print("Ilość: ");
                        Scanner odczyt4 = new Scanner(System.in);
                        ilosc = Integer.parseInt(odczyt4.nextLine());
                        System.out.print("Cena: ");
                        Scanner odczyt5 = new Scanner(System.in);
                        cena = Double.parseDouble(odczyt5.nextLine());
                        Produkty nowe = new Produkty(nazwa_produktu, cena, ilosc);
                        lista.add(nowe);
                    }
                }
                zapis.println("Nazwa firmy: " + nazwa_firmy);
                zapis.println("-----------------------------------------------");
                for (int i = 0; i < lista.size(); i++) {
                    sumaccen += lista.get(i).suma();
                    zapis.println("Nazwa produktu: " + lista.get(i).nazwa_produktu + " | Cena: " + lista.get(i).cena + " | Ilość: " + lista.get(i).ilosc);
                }
                zapis.println("Suma cen z VAT 15%: " + 1.15 * sumaccen);
                zapis.println("Suma cen: " + sumaccen);
                zapis.close();
            } else if (wybor == 2) {
                System.out.println("Tu wyświetlimy listę plików");
                ShowFileListUtil.listFile(new File("C:\\Users\\fkula\\IdeaProjects\\fakturatp\\Faktury"));
                System.out.print("Którą fakturę chcesz odzczytać(wpisz nazwę pliku bez .txt): ");
                Scanner odczyt6 = new Scanner(System.in);
                jaki_plik = odczyt6.nextLine();
                File plik = new File("C:\\Users\\fkula\\IdeaProjects\\fakturatp\\Faktury\\" + jaki_plik + ".txt");
                String wypisz = "";
                try {
                    Scanner skaner = new Scanner(plik);
                    while (skaner.hasNextLine()) {
                        wypisz = wypisz + skaner.nextLine() + "\n";
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Brak Pliku do odczytania!");
                }
                System.out.println(wypisz);
            }
            decyzja="";
            lista=null;
        }
    }
}
