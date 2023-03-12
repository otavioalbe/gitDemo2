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
        // carro SUVFlex
        TanqueCombustivelFlex tanqueFlex = new TanqueCombustivelFlex(65);
        MotorBasico motorSUVFlex = new MotorFlex(8,6,tanqueFlex);
        Carro suvFlex = new Carro("SUVFlex", motorSUVFlex, tanqueFlex);
        // carro econo
        MotorBasico motorEcono = new MotorEcono();
        TanqueCombustivel tanqueEcono = new TanqueCombustivel(TipoCombustivel.GASOLINA, 55);
        Carro econo = new Carro("Econo", motorEcono, tanqueEcono);

        System.out.println("Tipos de veiculos:");
        System.out.println(basico);
        System.out.println(esportivo);
        System.out.println(utilitario);
        System.out.println(suv);
        System.out.println(suvFlex);
        System.out.println(econo);

        System.out.println("\n\n--------------------------------");
        System.out.println("\nAbastencendo todos os carros,,");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        esportivo.abastece(TipoCombustivel.GASOLINA, 40);
        utilitario.abastece(TipoCombustivel.DIESEL, 60);
        suv.abastece(TipoCombustivel.GASOLINA, 50);
        suvFlex.abastece(TipoCombustivel.ALCOOL, 20);
        suvFlex.abastece(TipoCombustivel.GASOLINA, 40);
        econo.abastece(TipoCombustivel.GASOLINA, 30);

        System.out.println(basico);
        System.out.println(esportivo);
        System.out.println(utilitario);
        System.out.println(suv);
        System.out.println(suvFlex);
        System.out.println(econo);
        
        basico.viaja(150);
        esportivo.viaja(100);
        utilitario.viaja(200);
        suv.viaja(120);
        suvFlex.viaja(150);
        econo.viaja(200);

        System.out.println(basico);
        System.out.println(esportivo);
        System.out.println(utilitario);
        System.out.println(suv);
        System.out.println(suvFlex);
        System.out.println(econo);

    }
}
