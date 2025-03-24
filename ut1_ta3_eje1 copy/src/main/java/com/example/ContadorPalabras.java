package com.example;

public class ContadorPalabras {
    int contPalabras = 0;
    boolean esPalabra = false;
    public int contadorPalabras(String frase){
        for (int i = 0; i < frase.length(); i++){
            if (Character.isLetter(frase.charAt(i))) { //marcmaos que es una palabra
                esPalabra = true;
            } 
            if(Character.isLetter(frase.charAt(i)) && i == frase.length()-1){ //si es la ultima letra de la frase
                contPalabras++;
            }
        
            if (Character.isWhitespace(frase.charAt(i)) && esPalabra) { //si es un espacio y es una palabra
                contPalabras++;
                esPalabra = false;
            }
        }
        return contPalabras;
    }
}

