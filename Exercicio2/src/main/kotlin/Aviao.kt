class Aviao {

    var companhia = ""
    var tipoDeVoo = ""
    var tamanho = 0.0
    var hora = 0
    var minuto = 0

    fun hour (a: Int){

        if (a<0 || a>23){
            println("\nHora inválida")
        }else{
            hora+=a
        }

    }

    fun minute (b: Int){

        if (b<0 || b>59){
            println("\nMinuto inválido")
        }else{
            minuto+=b
        }

    }

    override fun toString(): String{

        return "Companhia: $companhia" +
                "\nTipo de Vôo: $tipoDeVoo" + "\nTamanho: $tamanho m" +
                "\nHora do Vôo: ${hora}:${minuto}h"


    }



}