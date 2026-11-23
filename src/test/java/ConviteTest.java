import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConviteTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Convite convite = new Convite(1, "Ana", new Mesa("Pista", 10), "Formatura 2026");

        Convite conviteClone = convite.clone();
        conviteClone.setCodigo(2);
        conviteClone.setConvidado("Bruno");
        conviteClone.getMesa().setNumero(11);

        assertEquals("Convite{codigo=1, convidado='Ana', mesa=Mesa{setor='Pista', numero=10}, evento='Formatura 2026'}", convite.toString());
        assertEquals("Convite{codigo=2, convidado='Bruno', mesa=Mesa{setor='Pista', numero=11}, evento='Formatura 2026'}", conviteClone.toString());
    }

    @Test
    void deveCriarObjetosDiferentes() throws CloneNotSupportedException {
        Convite convite = new Convite(1, "Ana", new Mesa("Pista", 10), "Formatura 2026");

        Convite conviteClone = convite.clone();

        assertNotSame(convite, conviteClone);
        assertNotSame(convite.getMesa(), conviteClone.getMesa());
    }

    @Test
    void deveCriarVariosConvitesAPartirDeUmModelo() throws CloneNotSupportedException {
        Convite modelo = new Convite(0, "", new Mesa("Camarote", 1), "Formatura 2026");

        Convite convite1 = modelo.clone();
        convite1.setCodigo(1);
        convite1.setConvidado("Ana");

        Convite convite2 = modelo.clone();
        convite2.setCodigo(2);
        convite2.setConvidado("Bruno");
        convite2.getMesa().setNumero(2);

        assertEquals("Convite{codigo=1, convidado='Ana', mesa=Mesa{setor='Camarote', numero=1}, evento='Formatura 2026'}", convite1.toString());
        assertEquals("Convite{codigo=2, convidado='Bruno', mesa=Mesa{setor='Camarote', numero=2}, evento='Formatura 2026'}", convite2.toString());
    }

}
