//EXERCICIO DE ESTRUTURAS DE REPETICAO
/*1- Crie um array de 5 posições com quaisquer valores. Utilize qualquer estrutura de repetição apresentada no vídeo para exibir todos os valores do array;

2- Crie um algoritmo capaz de calcular a média aritmética de um array com qualquer quantidade de elementos numéricos. Para fins de exemplo, o resultado do algoritmo com um array de valores 1, 2, 3, 5, 8, 13, 21, 23, 34, 55 deve ser 16.5. Procure usar uma estrutura de repetição diferente da que você usou para fazer o exercício anterior;

3- Considerando a lista dos 60 nomes mais comuns no Brasil nos últimos 10 anos, crie um algoritmo para verificar se seu nome está lá. Se sim, exiba a mensagem: É, nome comum :P. Se não, exiba a mensagem: Diferentão, hein? XD.
*/

 //Exercício 1:

//let alunosBoxe = ["Ippo", "Miyata", "Mashiba", "Kuma-chan", "Kobasi", "Takamura"]
//for(let posicao = 0; posicao < alunosBoxe.length; posicao++) {
 //   console.log (alunosBoxe[posicao]);
//}


// Exercício 2:

/*let alunosBoxe = ["Ippo", "Miyata", "Mashiba", "Kuma-chan", "Kobasi", "Takamura"]
let peso = [57, 56, 68, 53, 55, 70];
let n = 0;
let somaPesos = 0;
while (n < peso.length) {
    somaPesos = somaPesos + peso [n];
    n++
}
//let media = somaPesos/n
//console.log("A média de peso nesse box é de - ", media.toFixed(2))*/

// Exercicio 3

let nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória"];
let meuNome = "Geise";
let achouNome = false;
for(let posicao = 0; posicao < nomesComuns.length; posicao++){
   if (nomesComuns [posicao] === meuNome){
       console.log ("É, nome comum :P")
       achouNome = true;
       break
   }
}
if (achouNome === false) {
    console.log("Diferentão, hein? XD");
}







