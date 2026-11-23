public class Mesa implements Cloneable {
    private String setor;
    private Integer numero;

    public Mesa(String setor, Integer numero) {
        super();
        this.setor = setor;
        this.numero = numero;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public Mesa clone() throws CloneNotSupportedException {
        return (Mesa) super.clone();
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "setor='" + setor + '\'' +
                ", numero=" + numero +
                '}';
    }
}
