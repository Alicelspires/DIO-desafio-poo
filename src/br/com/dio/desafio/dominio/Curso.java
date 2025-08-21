package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(){

    }

    public int getCargaHoraria(){
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularXP(){
        return XP_PADRAO * cargaHoraria;
    };

    @Override
    public String toString(){
        return "\nCurso ======================= \n"+
                "titulo = '" + getTitulo() + "\'\n"+
                "descricao = '" + getDescricao() + "\'\n" +
                "carga horaria = '" + cargaHoraria + "\'\n";
    }
}
