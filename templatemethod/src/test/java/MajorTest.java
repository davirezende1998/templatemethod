import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MajorTest {
    @Test
    void deveRetonarPromovido() {
        Major major = new Major();
        major.setAnosNoCargo(13);
        assertEquals("Promovido para Coronel", major.verificarPromocao());
    }

    @Test
    void deveRetonarPermaneceNoCargo() {
        Major major = new Major();
        major.setAnosNoCargo(11);
        assertEquals("Permanece como Major", major.verificarPromocao());
    }

    @Test
    void deveRetornarInformacoes() {
        Major major = new Major();
        major.setNome("Lucas");
        major.setCodigo(3);
        major.setAnosNoCargo(10);
        assertEquals("Major{codigo=3, nome='Lucas', resultado=Permanece como Major}", major.getInfo());
    }
}