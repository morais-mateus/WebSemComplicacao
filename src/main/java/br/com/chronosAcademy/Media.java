package br.com.chronosAcademy;

public class Media {


    public String calculaMedia(double v, double v1) {

        double media = (v + v1) /2;
        System.out.println(media);
        if(media>=5){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }

    }
}
