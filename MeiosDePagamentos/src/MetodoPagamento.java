public interface MetodoPagamento {
    void autorizarPagamento(double valor);
    void capturarPagamento(double valor);
    void cancelarPagamento();

    double consultarValorPago();

    default void gerarComprovante() {
        System.out.println("--- Comprovante Bancário ---");
        System.out.println("Transação processada com sucesso.");
    }
}