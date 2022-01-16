public class Major extends Policial{
    public String verificarPromocao() {
        if (this.getAnosNoCargo() >= 12) {
            return "Promovido para Coronel";
        }
        else {
            return "Permanece como Major";
        }
    }

    @Override
    public String getTipo() {
        return "Major";
    }
}