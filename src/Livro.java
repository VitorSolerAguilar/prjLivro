/**
 *
 * @author vitor
 */
public class Livro {
    private int identificacao;
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria;
    
    public Livro(int Identificacao, String Titulo){
        this.identificacao = Identificacao;
        this.titulo = Titulo;
    }    
    public void setValMultaDiaria(double multaDiaria){
        this.valMultaDiaria = multaDiaria;
    }
    public int getIdentificacao(){
        return this.identificacao;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public boolean getSituacao(){
        return this.situacao;
    }
    
    public void emprestar(){
        this.situacao = true;
    }
    public double devolver(int diasAtraso){
     this.situacao = false;
     return this.valMultaDiaria * diasAtraso;   
    }
}
