
import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.logica.Controladora;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Javi
 */
public class AutomovilTest {

    static Controladora controladora;

    @BeforeAll
    public static void setUp() {
        controladora = new Controladora();
    }

    @Test
    public void createAutomovilTest() {
        List<Automovil> autosAntes = controladora.findAllAutomovil();

        Automovil auto = new Automovil("KIA", "STONIC", "BLANCO", "5432POV");

        controladora.createAutomovil(auto);

        List<Automovil> autosDespues = controladora.findAllAutomovil();
        assertEquals(autosAntes.size() + 1, autosDespues.size());
    }

    // Con función intermedia
//    public void createAutomovilTest() {
//        List<Automovil> autosAntes = controladora.findAllAutomovil();
//
//        Automovil auto = new Automovil("KIA", "STONIC", "BLANCO", "5432POV");
//
//        boolean res = controladora.createAutomovil(auto);
//
//        if (res) {
//        List<Automovil> autosDespues = controladora.findAllAutomovil();
//        assertEquals(autosAntes.size() + 1, autosDespues.size());
//            assertTrue(res);
//        } else {
//            List<Automovil> autosDespues = controladora.findAllAutomovil();
//            assertEquals(autosAntes.size(), autosDespues.size());
//            assertFalse(res);
//        }
//    }
//    @Test
//    public void destroyAutomovilTest() {
//        List<Automovil> autosAntes = controladora.findAllAutomovil();
//
//        controladora.destroyAutomovil(autosAntes.get(0).getId());
//
//        List<Automovil> autosDespues = controladora.findAllAutomovil();
//
//        assertEquals(autosAntes.size() - 1, autosDespues.size());
//    }
    @Test
    public void editAutomovilTest() {
        List<Automovil> autosAntes = controladora.findAllAutomovil();

        Automovil autoModificado = autosAntes.get(0);
        autoModificado.setModel("ARONA");

        controladora.editAutomovil(autoModificado);

        List<Automovil> autosDespues = controladora.findAllAutomovil();
        System.out.println(autosDespues.toString());

        assertEquals("ARONA", autosDespues.get(0).getModel());
    }

    @Test
    public void findByPlateTest() {
        List<Automovil> autos = controladora.findAllAutomovil();

        for (Automovil a : autos) {
            assertNotNull(controladora.findAutoByPlate(a.getPlate()));
        }
    }
}
