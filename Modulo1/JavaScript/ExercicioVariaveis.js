//EXERCICIO DE VARIAVEIS - apresentação pessoal.


nomeCompleto = "Geise Paveck"
apelido = "Gall"
idade = 29
dataNascimento = "12/08/1992"
localNascimento = "Porto Alegre - RS"
altura = "1.60"
trabalhando = false

apresentacao = "Meu nome é " + nomeCompleto + " (sou conhecida como " + apelido + ") e tenho " + idade + " anos. Nasci no dia " + dataNascimento + ", na cidade de " + localNascimento + ". Tenho " + altura + "m de altura e atualmente estou " + (trabalhando ? "empregado" : "desempregada") + ".";

console.log(apresentacao);