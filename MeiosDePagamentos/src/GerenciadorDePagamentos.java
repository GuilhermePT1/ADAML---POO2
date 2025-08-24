import java.util.List;

public class GerenciadorDePagamentos {
    private List<MetodoPagamento> listaDosPagamentos;

    public GerenciadorDePagamentos(List<MetodoPagamento> listaDosPagamentos) {
        this.listaDosPagamentos = listaDosPagamentos;
    }

    public void processarTodos(double valor) {
        for (MetodoPagamento metodo : listaDosPagamentos) {
            System.out.println("\n--- Processando próximo pagamento ---");
            metodo.autorizarPagamento(valor);
            metodo.capturarPagamento(valor);
            metodo.gerarComprovante();
        }
        System.out.println("\nTodos os pagamentos foram processados!");
    }

    public double gerarRelatorio() {
        double valorTotal = 0;

        for (MetodoPagamento mp : listaDosPagamentos) {
            valorTotal += mp.consultarValorPago(); // Presume que existe este método na interface
        }
        return valorTotal;
    }
}