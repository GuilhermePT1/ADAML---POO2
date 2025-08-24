public class PagamentoCartao implements MetodoPagamento {
    private String numeroCartao;
    private String nomeTitular;
    private boolean autorizado = false;
    private double valorPago;

    public PagamentoCartao(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void autorizarPagamento(double valor) {
        System.out.println("Pagamento com cartão autorizado no valor de: R$" + valor);
        this.valorPago = valor;
    }

    @Override
    public void capturarPagamento(double valor) {
        System.out.println("Pagamento com cartão capturado no valor de: R$" + valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pagamento com cartão cancelado.");
        this.valorPago = 0;
    }

    @Override
    public double consultarValorPago() {
        return this.valorPago;
    }

    @Override
    public void gerarComprovante() {
        System.out.println("--- Comprovante de Pagamento com Cartão ---");
        System.out.println("Valor pago: R$" + this.valorPago);
        System.out.println("Transação processada com sucesso.");
    }
}