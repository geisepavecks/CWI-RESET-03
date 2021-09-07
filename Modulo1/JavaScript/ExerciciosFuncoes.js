/* EXERCICIOS DE FUNÇÕES
1. Crie uma função chamada `imprimir` que recebe um argumento e simplesmente imprime ele na tela;

R = function imprimir (i){
    console.log(i);
}
imprimir(8);

2. Lembra dos exercícios que propusemos na [Aula 05 - Variáveis]? Com base neles, faça o seguinte:
    - Crie uma função para cada algoritmo proposto lá, exceto o número `6`;
    - Todas as funções devem *retornar* o valor final;
    - Procure dar nomes que façam sentido às funções. *Ex.: a função para o item `4` poderia se chamar `mediaAritmetica` ou `calcularMediaAritmetica`*;
    - Procure utilizar comentários para documentar cada método;
    - Na função da média aritmética, evite colocar todos os itens como argumentos do método, pois isso limitaria sua utilização a um número fixo de elementos. Tente implementar uma lógica para receber um array e calcular a média em cima dele, tornando a função mais reaproveitável em diferentes situações.*/

/* Verifica se os dois nomes informados são iguais.
 */
function mesmoNome(primeiroNome, segundoNome) {
    return primeiroNome == segundoNome
}

/* Verificação de maioridade.
 */
function maiorDeIdade(idade) {
    return idade >= 18
}

/* Realiza o cálculo do valor do boleto com juros.
 Atualmente, a taxa de juros é de 10%. */
function valorComJuros(valorBoleto) {
    return valorBoleto * 1.1
}

/* Cálculo da média aritmética de todos os itens presentes
 no array passado como argumento. */
function mediaAritmetica(itens) {
    soma = 0

    // somar todos os itens do array
    for (index = 0; index < itens.length; index++) {
        soma += itens[index]
    }

    // dividir o somatório pela quantidade de elementos
    return soma / itens.length
}

/* Cálculo da margem bruta da empresa com base na 
 receita líquida de vendas e no custo dos produtos vendidos.
 O resultado final é multiplicado por 100 para considerar o valor percentual. */
function margemBruta(receitaLiquidaVendas, custoProdutosVendidos) {
    lucroBruto = receitaLiquidaVendas - custoProdutosVendidos
    return (lucroBruto / receitaLiquidaVendas) * 100
}



