import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TenenteTest {
    @Test
    void deveRetonarPromovido() {
        Tenente tenente = new Tenente();
        tenente.setAnosNoCargo(11);
        assertEquals("Promovido para Major", tenente.verificarPromocao());
    }

    @Test
    void deveRetonarPermaneceNoCargo() {
        Tenente tenente = new Tenente();
        tenente.setAnosNoCargo(9);
        assertEquals("Permanece como Tenente", tenente.verificarPromocao());
    }

    @Test
    void deveRetornarInformacoes() {
        Tenente tenente = new Tenente();
        tenente.setNome("Davi");
        tenente.setCodigo(1);
        tenente.setAnosNoCargo(11);
        assertEquals("Tenente{codigo=1, nome='Davi', resultado=Promovido para Major}", tenente.getInfo());
    }
}