public class Convite implements Cloneable {
    private int codigo;
    private String convidado;
    private Mesa mesa;
    private String evento;

    public Convite(int codigo, String convidado, Mesa mesa, String evento) {
        this.codigo = codigo;
        this.convidado = convidado;
        this.mesa = mesa;
        this.evento = evento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    @Override
    public Convite clone() throws CloneNotSupportedException {
        Convite conviteClone = (Convite) super.clone();
        conviteClone.mesa = this.mesa.clone();
        return conviteClone;
    }

    @Override
    public String toString() {
        return "Convite{" +
                "codigo=" + codigo +
                ", convidado='" + convidado + '\'' +
                ", mesa=" + mesa +
                ", evento='" + evento + '\'' +
                '}';
    }
}
