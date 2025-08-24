import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new Email());
        notificacoes.add(new SMS());


        for (Notificacao notificacao : notificacoes) {
            notificacao.enviarMensagem("Olá! Estou enviando pdf da a aula.");
        }
    }
}