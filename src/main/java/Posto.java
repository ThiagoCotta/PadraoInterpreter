public class Posto {

    public static String formulaGasolina = "precoGasolina * litros";

    public static double calcularPrecoGasolina(float precoGasolina, float litros) {
        String expressao;
        expressao = formulaGasolina.replace("precoGasolina", Double.toString(precoGasolina));
        expressao = expressao.replace("litros", Double.toString(litros));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}

