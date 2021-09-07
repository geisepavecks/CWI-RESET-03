//EXERCICIO DE OPERADORES


// fulano, no dia do pagamento de seu salário compra uma calça no shopping, no trajeto encontra um morador de rua e dá uma esmola. Quanto sobrou de saldo na conta?

let salario = 2500
let saldoConta = 1000
let calca = 99.90
let esmola = 0.10

// também, pagou uma dívida que cobria metade de seu salário + pagou na conta da luz o equivalente a 25% a mais por causa do ar condicionado //

//ar condicionado 25%//
//pgto divida metade saldo//
//qual valor do saldo?//

saldoConta -= calca;
saldoConta += salario;
saldoConta -= esmola;
saldoConta -= saldoConta * 0.25;
saldoConta /= 2;

console.log (saldoConta);
