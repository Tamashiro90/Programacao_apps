public class Encapsulamento {
    private String modelo;
    private double capacidadeCarga;

    //Contrutor
    public CaminhaoEncapsulamento (String modelo, double capacidadeCarga) {
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
    }

    //Métodos públicos para acessar os dados
    public String getModelo() {
        return modelo;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga < 0) {
            throw new IllegalArgumentException("A capacidade de carga não pode ser negativo");
        }
        this.capacidadeCarga = capacidadeCarga;
    }

    //Método principal
    public static void main(String[] args ) {
        //Criando um objeto Caminhão
        CaminhaoEncapsulamento caminhao = new CaminhaoEncapsulamento(modelo: "Volvo FH", capacidadeCarga:25.5);

        //Exibindo os dados do caminhão
        System.out.println("Modelo: " + caminhao.getModelo());
    }
}
