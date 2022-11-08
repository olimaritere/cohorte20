//crear una aplicación con JS, recibir una palabra y va a regresar la palabra invertida

let nombre = prompt("Ingresa tu nombre")

let arraynombre = nombre.split("");
console.log(arraynombre);
document.write(arraynombre);

let alreves = arraynombre.reverse();
console.log(alreves);
document.write(alreves);

let junto = alreves.join();
console.log(junto);
document.write(junto);

