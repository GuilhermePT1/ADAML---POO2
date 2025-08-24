public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("BMW M4 ");
        carro.ligarMotor();
        carro.acelerar(80);
        carro.frear(50);

        System.out.println("---------------------");

        Veiculo moto = new Moto("Honda Titan ");
        moto.ligarMotor();
        moto.acelerar(50);
        moto.frear(30);

        System.out.println("---------------------");

        Veiculo bicicleta = new Bicicleta();
        bicicleta.ligarMotor();
        bicicleta.acelerar(20);
        bicicleta.frear(10);
    }
}