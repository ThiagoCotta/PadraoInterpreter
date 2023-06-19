import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveCalcularExpressaoComFormula() {
        Cliente cliente = new Cliente();
        cliente.setPrecoGasolina(5.3f);
        cliente.setLitros(21.0f);

        assertEquals(111.30000400543213, cliente.calcularGastos());
    }

}