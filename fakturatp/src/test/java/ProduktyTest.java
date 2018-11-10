import static org.junit.Assert.*;
import org.junit.Test;



public class ProduktyTest {
    @Test
    public void CzySumaPoprawan() {
        Produkty produkt=new Produkty("mydło",2.34, 15);
        double suma= produkt.suma();
        assertEquals("Nie są równe z zakresem błędu +/-0.1",suma, 35.1, 0.1);
    }
}