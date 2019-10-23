import org.junit.jupiter.api.Test;

import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.*;

class KundTest {

    Kund kund = new Kund("9312203053", "Malcolm", "Rudhag", LocalDate.now());


    @Test
    public void ärKundAktuell() {
        assertTrue(kund.ärKundAktuell() instanceof String);
        assertFalse(kund.ärKundAktuell().equals(null));
        assertFalse(kund.ärKundAktuell().equals(""));
        assertFalse(kund.ärKundAktuell().matches("\\d+"));
    }
}