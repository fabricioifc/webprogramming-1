package br.com.ifc.util;

import java.text.DecimalFormat;

public class Media {

    private final double notas[];

    public Media(Double... notas) {
        this.notas = new double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            this.notas[i] = notas[i];
        }
    }

    public Media(double n1, double n2, double n3, double n4) {
        this.notas = new double[]{n1, n2, n3, n4};
    }

    public Media(double[] notas) {
        this.notas = notas;
    }

    public String calcularMedia() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }
        double media = soma / notas.length;
        return df.format(media);
    }

//    public static void main(String args[]){
//        Media m = new Media(teste);
//        System.out.println(m.calcularMedia());
//    }
}
