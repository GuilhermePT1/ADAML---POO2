public class PagamentoPix implements MetodoPagamento {
    private String chavePix;
    private boolean possuiSaldo = true;
    private double valorPago;// Simulação

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void autorizarPagamento(double valor) {
        System.out.println("Pagamento via Pix autorizado no valor de: R$" + valor);
        this.valorPago = valor;
    }

    @Override
    public void capturarPagamento(double valor) {
        System.out.println("Pagamento via Pix capturado no valor de: R$" + valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Pagamento via Pix cancelado.");
        this.valorPago = 0;
    }

    @Override
    public double consultarValorPago() {
        return this.valorPago;
    }

    @Override
    public void gerarComprovante() {
        System.out.println("--- Comprovante de Pagamento via Pix ---");
        System.out.println("Valor pago: R$" + this.valorPago);
        System.out.println("Transação processada com sucesso.");
    }
}