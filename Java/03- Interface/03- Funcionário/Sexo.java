
package com.mycompany.mavenproject5;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Femnino");

    private final String texto;
    
    private Sexo(String texto) {
        this.texto = texto;
        
    }

    public String getTexto() {
        return texto;
    }
    
    
}
