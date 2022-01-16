public class Soldado extends Policial{
    public String verificarPromocao() {
        if (this.getAnosNoCargo() >= 8) {
            return "Promovido para Tenente";
        }
        else {
            return "Permanece como Soldado";
        }
    }

    @Override
    public String getTipo() {
        return "Soldado";
    }
}