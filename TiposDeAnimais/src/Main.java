import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        List<Animal> animals = new ArrayList<>();
        animals.add(gato);
        animals.add(cachorro);

        for (Animal animal : animals) {
            animal.emitirSom();
        }
    }
}