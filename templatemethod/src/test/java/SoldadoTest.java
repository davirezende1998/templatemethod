import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SoldadoTest {
    @Test
    void deveRetonarPromovido() {
        Soldado soldado = new Soldado();
        soldado.setAnosNoCargo(9);
        assertEquals("Promovido para Tenente", soldado.verificarPromocao());
    }

    @Test
    void deveRetonarPermaneceNoCargo() {
        Soldado soldado = new Soldado();
        soldado.setAnosNoCargo(7);
        assertEquals("Permanece como Soldado", soldado.verificarPromocao());
    }

    @Test
    void deveRetornarInformacoes() {
        Soldado soldado = new Soldado();
        soldado.setNome("Pedro");
        soldado.setCodigo(2);
        soldado.setAnosNoCargo(10);
        assertEquals("Soldado{codigo=2, nome='Pedro', resultado=Promovido para Tenente}", soldado.getInfo());
    }
}