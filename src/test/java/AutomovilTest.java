
import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.logica.Controladora;
import java.util.List;
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
        
        System.out.println("VECES QUE ME IMPRIMO");
    }

    @Test
    public void createAutomovilTest() {
        List<Automovil> autosAntes = controladora.findAllAutomovil();

        Automovil auto = new Automovil(0, "SEAT", "CORDOBA", "AZUL", "9876POI");

        controladora.createAutomovil(auto);

        List<Automovil> autosDespues = controladora.findAllAutomovil();

        assertEquals(autosAntes.size() + 1, autosDespues.size());
    }

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
}
