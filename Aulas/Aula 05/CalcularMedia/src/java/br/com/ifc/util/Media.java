package br.com.ifc.util;

import java.text.DecimalFormat;

public class Media {

    private final double notas[];

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

}
