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
    //Subequipo “B”: Obtener la cantidad de palabras con largo mayor a X caracteres.
    /* public int contadorLargo(String frase, int x){
        int contLargo = 0;
        String[] palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++){
            if (palabras[i].length() > x){
                contLargo++;
            }
        }
        return contLargo;


        Modo con split
    } */
    //Subequipo “B”: Obtener la cantidad de palabras con largo mayor a X caracteres. utilizando contadorPalabras
    public int contadorLargo(String frase, int x){
        int contLargo = 0;
        int contLetras = 0;
        for (int i = 0; i < frase.length(); i++){ //recorremos la frase
            if (Character.isLetter(frase.charAt(i))){ //si es una letra aumentamos el contador de letras
                contLetras++;
            }
            if (Character.isWhitespace(frase.charAt(i)) && contLetras > x){//si es un espacio y la palabra es mayor a x
                contLargo++;
                contLetras = 0;
            }
            if (Character.isWhitespace(frase.charAt(i)) && contLetras <= x){//si es un espacio y la palabra es menor o igual a x
                contLetras = 0;
            }
            if (Character.isLetter(frase.charAt(i)) && i == frase.length()-1 && contLetras > x){ //si es la ultima letra de la frase y la palabra es mayor a x
                contLargo++;
            }
        }
        return contLargo;
    }
}

