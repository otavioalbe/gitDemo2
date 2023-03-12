public class App {
    public static void main(String[] args) throws Exception {

        // carro básico
        MotorBasico motorBasico = new MotorBasico(TipoCombustivel.GASOLINA, 10);
        TanqueCombustivel tanqueCombustivel = new TanqueCombustivel(TipoCombustivel.GASOLINA, 55);
        Carro basico = new Carro("Basico", motorBasico, tanqueCombustivel);
        // carro esportivo
        MotorBasico motorEsportivo = new MotorBasico(TipoCombustivel.GASOLINA, 6);
        TanqueCombustivel tanqueEsportivo = new TanqueCombustivel(TipoCombustivel.GASOLINA, 45);
        Carro esportivo = new Carro("Esportivo", motorEsportivo, tanqueEsportivo);
        // carro utilitario
        MotorBasico motorUtilitario = new MotorBasico(TipoCombustivel.DIESEL, 5);
        TanqueCombustivel tanqueUtilitario = new TanqueCombustivel(TipoCombustivel.DIESEL, 70);
        Carro utilitario = new Carro("Utilitario", motorUtilitario, tanqueUtilitario);
        // carro SUV
        MotorBasico motorSUV = new MotorBasico(TipoCombustivel.GASOLINA, 8);
        TanqueCombustivel tanqueSUV = new TanqueCombustivel(TipoCombustivel.FLEX, 55);
        Carro suv = new Carro("SUV", motorSUV, tanqueSUV);


        System.out.println("Tipos de veiculos:");
        System.out.println(basico);
        System.out.println(esportivo);
        System.out.println(utilitario);
        System.out.println(suv);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        System.out.println("\nViajando com o carro basico");
        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);
    }
}
