package br.com.alura.screenmatch.calculator;

public class RecomendationFilter {

    public void filter(Classificable classificable) {
        if(classificable.getClassification() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificable.getClassification() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
