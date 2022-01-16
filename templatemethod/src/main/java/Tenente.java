public class Tenente extends Policial{
    public String verificarPromocao() {
        if (this.getAnosNoCargo() >= 10) {
            return "Promovido para Major";
        }
        else {
            return "Permanece como Tenente";
        }
    }

    @Override
    public String getTipo() {
        return "Tenente";
    }
}