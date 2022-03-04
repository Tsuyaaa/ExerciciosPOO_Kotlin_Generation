class Cliente {

    var nome = ""
    var idade = 0
    var servico = ""
    var gasto = 0.0

    fun pagamento(a: Double){

        if (a<=0){
            println("\nValor inválido")
        }else{
            gasto+=a
        }

    }

}