package br.com.exercicios.sbootify.modelos;


public class Podcast extends Audio {

    String tema;
    String host;
    String convidado;
    String descricao;

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void ExibeFicha() {
        super.ExibeFicha();
        System.out.println(this.getTema());
        System.out.println(this.getHost());
        System.out.println(this.getConvidado());
        System.out.println(this.getDescricao());
    }
}
