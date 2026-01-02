package com.acme;

public record PersonaRegistro(String nombre, String apellidos) {

    @Override
    public String toString() {
        //RR se ha comentado la línea de impresión
        //System.out.println("Esta instruccion es inservible");
        return "%s %s".formatted(nombre, apellidos);
    }
}
