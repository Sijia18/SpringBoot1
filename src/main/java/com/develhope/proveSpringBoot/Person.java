package com.develhope.proveSpringBoot;

public class Person {
    private String nome;
    private String provincia;
    private String saluto;

    public Person(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = "Ciao " + nome + "che tempo fa in " + provincia + " ?";
    }

    public String getNome() {
        return nome;
    }

    public String getProvincia() {
        return provincia;
    }


}
