package com.example;

public class PruebaAtributos {
    int number = 8;
    String gato = "gato";
    //String abstract = "abstract"; Va a dar error porque "abstract" es una palabra reservada
    //System.out.println(vaca); Va a dar error porque la variable no esta inicializado
    public static void main(String[] args) {
        int Numero = 5;
        String abstracto = "abstract";
        System.out.println("Variable local: " + Numero);
        System.out.println("Variable local: " + abstracto);

        PruebaAtributos instancia = new PruebaAtributos(); // Crear una instancia de la clase Main
        System.out.println("Variable de instancia: " + instancia.gato); // 
    }
    
}