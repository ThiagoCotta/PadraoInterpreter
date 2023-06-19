import java.math.BigDecimal;
import java.math.RoundingMode;
public class Cliente {
    private float precoGasolina;
    private float litros;
    public void setLitros(float litros) {
        this.litros = litros;
    }
    public float getLitros() {
        return litros;
    }
    public void setPrecoGasolina(float precoGasolina) {
        this.precoGasolina = precoGasolina;
    }
    public float getPrecoGasolina() {
        return precoGasolina;
    }

    public double calcularGastos() {
        return Posto.calcularPrecoGasolina(this.precoGasolina, this.litros);
    }
}
