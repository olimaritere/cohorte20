let num1 = parseInt(prompt("Ingresa el 1er número: "))
let num2 = parseInt(prompt("Ingrese el 2do numero: "))
let num3 = parseInt(prompt("Ingresa el 3er número: "))


console.log(num1, num2, num3);

let numeros = []

numeros.push(num1, num2, num3);

numeros.sort((a, b)=>a-b);
console.log(numeros[0], numeros[1], numeros[2]);

numeros.reverse();
console.log(numeros[0], numeros[1], numeros[2]);








