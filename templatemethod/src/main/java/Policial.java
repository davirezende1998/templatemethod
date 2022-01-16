public abstract class Policial {
    private int codigo;
    protected String nome;
    private int anosNoCargo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnosNoCargo() {
        return anosNoCargo;
    }

    public void setAnosNoCargo(int anosNoCargo) {
        this.anosNoCargo = anosNoCargo;
    }

    public abstract String verificarPromocao();

    public abstract String getTipo();

    public String getInfo() {
        return getTipo() + "{" +
                "codigo=" + this.codigo +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarPromocao() +
                '}';
    }
}