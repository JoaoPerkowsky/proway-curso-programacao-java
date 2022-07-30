package br.com.proway.exemplos.orientacao.objetos.instancia;

/**
 * @author moc
 */
public class Ingresso {

    // Atributos
    // encapsulamento + tipoAtributo + nomeAtributo;
    private int codigo;
    private String dono;
    private double valor;
    private int quantidade;

    public void definirCodigo(int codigoParaSalvar)
            throws Exception {
        // Guardar no atributo(codigo) o valor do parâmetro 
        // codigoParaSalvar

        if (codigoParaSalvar <= 0) {
            throw new Exception(
                    "Código do ingresso deve ser positivo");
        }

        codigo = codigoParaSalvar;
    }

    public void definirValor(double valorParaSalvar)
            throws Exception {

        if (valorParaSalvar < 100) {
            throw new Exception(
                    "Valor mínimo do ingresso é 100 reais");
        }

        valor = valorParaSalvar;
    }

    public void definirQuantidade(int quantidade)
            throws Exception {
        if (quantidade > 100) {
            throw new Exception(
                    "Não vendemos mais de 100 ingressos por pessoa");
        }

        if (quantidade < 0) {
            throw new Exception(
                    "Quantidade de ingressos deve ser no mínimo 1 ingresso");
        }

        this.quantidade = quantidade;
    }

    public void definirDono(String dono) throws Exception {
        if (dono.length() < 3) {
            throw new Exception(
                "Nome deve conter no mínimo 3 caracteres");
        }
        
        if(dono.length() > 100){
            throw new Exception(
                "Nome deve conter no máximo 100 caracteres");
        }

        this.dono = dono; 
    }
    
    public String obterDono(){
        return dono;
    }
    
    public int obterQuantidade(){
        return quantidade;
    }
    
    public double obterValor(){
        return valor;
    }
    
    public double calcularValorIngresso() {
        var valorIngresso = quantidade * valor;

        return valorIngresso;
    }
}
