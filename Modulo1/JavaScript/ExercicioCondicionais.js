// EXERCICIO DE CONDICIONAIS

/*ALGORITMO DE CALCULO DE IMC 
Faça um algoritmo que efetue o cálculo do IMC, com base nas variáveis peso e altura.
Exiba o valor do IMC e a classificação obtida. Se houver algum grau de obesidade, exiba também a mensagem: Cuidado! Você está acima do peso recomendado pela OMS.
Se o grau de obesidade for 3, adicione também a seguinte mensagem: É importante procurar um médico para avaliar sua saúde.*/

let peso = 57
let altura = 1.60
let IMC = (peso / (altura)**2).toFixed(2)

if (IMC < 18.5){
    console.log("IMC = " + IMC + "  - Magreza!")
} 
else if (IMC >= 18.5 && IMC <= 24.99){
    console.log("IMC = " + IMC + "  - Normal!")
}
else if (IMC >= 25 && IMC <= 29.99){
    console.log("IMC = " + IMC + "  - Você está sobrepeso, cuidado! Você está acima do peso recomendado pela OMS")
}
else if (IMC >= 30 && IMC <=39.99){
    console.log("IMC = " + IMC + "  - Você está com obesidade tipo 1, cuidado! Você está acima do peso recomendado pela OMS")
}
else if (IMC >= 40){
    console.log("IMC = " + IMC + "  - Você está com obesidade tipo 2, cuidado! Você está acima do peso recomendado pela OMS")
}
