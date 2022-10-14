//Propiedades de arreglos
//Lenght

const frutas = ["🍍", "Manzana", "Guayaba"];
console.log(frutas);
console.log(frutas.length);

//Metodos --- acciones

//Push agrega al final

frutas.push("Sandia", "Limón");
console.log(frutas);

//unshift()  --- Agrega al inicio
frutas.unshift("Guanabana");
console.log(frutas);

//Metodos para quitar
//pop()

frutas.pop();
console.log(frutas);

let elemento = frutas.pop();
console.log(frutas);
console.log(elemento);

//shift()

frutas.shift();
console.log(frutas);

let element = frutas.shift();
console.log(element);

//indexOf() -- Te dice la posicion de la palabra
console.log(frutas.indexOf("Guayaba"));

//reverse()
frutas.reverse();
console.log(frutas);

//sort----Ordena segun el primer digito


frutas.sort();
console.log(frutas);

const numeros = [4, 3, 7, 8, 1];

numeros.sort();

console.log(numeros);
numeros.sort((a, b)=>a-b);
console.log(numeros);


