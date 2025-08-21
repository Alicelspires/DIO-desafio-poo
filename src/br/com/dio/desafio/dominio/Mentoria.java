package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria(){
    }

    public LocalDate getData(){
        return this.data;
    }
    public void setData(LocalDate data){
        this.data = data;
    }

    public double calcularXP(){
        return XP_PADRAO + 10;
    };

    @Override
    public String toString(){
        return "\nMentoria ==================== \n" + 
                "titulo = '" + getTitulo() + "\'\n"+
                "descricao = '" + getDescricao() + "\'\n" +
                "data = '" + data + "\'\n";
    }
}
