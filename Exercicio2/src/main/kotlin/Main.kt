fun main() {

    var aviaoUm = Aviao()

    print("Digite a comapnhia aérea: ")
    aviaoUm.companhia = readLine()!!

    print("Digite o tipo de vôo: ")
    aviaoUm.tipoDeVoo = readLine()!!

    print("Digite o tamanho do avião (em metro): ")
    aviaoUm.tamanho = readLine()!!.toDouble()

    print("Digite a hora do vôo (mode de 24 horas): ")
    var hora = readLine()!!.toInt()
    aviaoUm.hour(hora)

    print("Digite os minutos : ")
    var minuto = readLine()!!.toInt()
    aviaoUm.minute(minuto)

    print(aviaoUm)



}