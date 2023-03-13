public class Car {
    private String marca;
    private String modelo;
    private Integer ano;
    private Double valor;
    private Double desvalorizacao;

    private Double porcentagem;


    private Double venda;

    public Car(){};
    public Car(String marca, String modelo, Integer ano, Double valor, Double desvalorizacao, Double porcentagem, Double venda) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        this.desvalorizacao = desvalorizacao;
        this.porcentagem = porcentagem;
        this.venda = venda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getDesvalorizacao() {
        return desvalorizacao;
    }

    public void setDesvalorizacao(Double desvalorizacao) {
        this.desvalorizacao = desvalorizacao;
    }

    public Double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(Double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Double getVenda() {
        return venda;
    }

    public void setVenda(Double venda) {
        this.venda = venda;
    }

    void value(){
        venda =((valor*porcentagem)/100.0)+valor ;
        desvalorizacao= valor-((valor*porcentagem)/100.0);
        System.out.println("------------------Entrada de Veiculo------------------");
        System.out.println("Marca: "+ marca);
        System.out.println("Carro: "+ modelo);
        System.out.println("Ano: "+ano);
        System.out.println("----------------------Negociação----------------------");
        System.out.println("Tabela Fipe: "+valor);
        System.out.println("Porcentagem de negociação: "+porcentagem+"%");
        System.out.println("* Valor de COMPRA: "+ desvalorizacao);
        System.out.println("* Valor de VENDA: "+ venda);
        System.out.println("* Valor do LUCRO: "+ (venda-desvalorizacao));
        System.out.println("------------------------------------------------------");
   }


}
