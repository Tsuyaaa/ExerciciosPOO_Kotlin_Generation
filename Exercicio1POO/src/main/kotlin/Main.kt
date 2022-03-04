fun main() {

    val clienteUm = Cliente()

   print("Digite o nome do Cliente: ")
    clienteUm.nome = readLine()!!

    print("Digite a idade do Cliente: ")
    clienteUm.idade = readLine()!!.toInt()

    print("Digite o tipo de serviço: ")
    clienteUm.servico = readLine()!!

    clienteUm.gasto = 0.0
    print("Digite o valor do serviço: ")
    var preco = readLine()!!.toDouble()
    clienteUm.pagamento(preco)



    println("\nCliente: ${clienteUm.nome}")
    println("Idade: ${clienteUm.idade}")
    println("Serviço: ${clienteUm.servico}")
    print("Valor gasto: R$${clienteUm.gasto}")

}