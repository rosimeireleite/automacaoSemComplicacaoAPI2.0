package transferencia;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Cliente xuxa;
    Cliente silvioSantos;
    Conta contaXuxa;
    Conta contaSilvio;

    @BeforeEach
    void setUp() {
        xuxa = new Cliente("xuxa","30811008520","2563633");
        silvioSantos = new Cliente("Silvio Santos","11011014520","8963363");

        contaXuxa = new Conta("1004", "5002162", 2500.00, xuxa);
        contaSilvio = new Conta("2563","5896669", 3500.00, silvioSantos);
    }

    @Test

    public void validarTranferenciaInvalida(){
       boolean resultado = contaXuxa.realizarTransferencia( 3500.00, contaSilvio);
        assertFalse(resultado);

    }
    @Test
    public void realizarTransacao(){
         contaXuxa.realizarTransferencia( 1000.00, contaSilvio);

        assertEquals(  1500.00, contaXuxa.getSaldo());
        assertEquals(  4500.00, contaSilvio.getSaldo());

    }

}