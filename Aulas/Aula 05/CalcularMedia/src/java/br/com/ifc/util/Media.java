package br.com.ifc.util;

import java.text.DecimalFormat;

public class Media {

    private double[] notas;

    public Media(double[] notasDoServlet) {
        this.notas = notasDoServlet;
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
