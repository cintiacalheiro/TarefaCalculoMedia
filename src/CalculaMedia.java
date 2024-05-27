/**
 * @author cintia
 */

public class CalculaMedia {
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;

    public CalculaMedia (float nota1, float nota2, float nota3, float nota4){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public void calcularMedia(){
        float soma = nota1 + nota2 + nota3 + nota4;
        float divisao = soma / 4;
        System.out.println("A média é:" + divisao);
    }

}
