public class Carro implements  Veiculo {
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public void ligarmotor() {
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println(marca + "Está acelerando a " + velocidade + " km/h.");
    }

    @Override
    public void frear(int velocidade) {
        System.out.println(marca + "Está freando a " + velocidade + " km/h.");
    }
}