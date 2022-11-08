//const y let - Locales
//var - Global

/*const nombre = "Oli"
var nombre = "Oli";

if(true){
    console.log(nombre)
}*/

const numeros = [2, 4, 6, 57, 200];
let suma = 0;
/*forEach
recorre todo el arreglo y ejecuta el código que le indiques sobre los valores guardados*/

// numeros.forEach(function sumar(elemento){
//     console.log(elemento * elemento);
// });

/*numeros.forEach(function sumar(elemento){
    suma = suma + elemento;
    //suma += elemento;
    return suma;
});

console.log(suma);*/

/*Posicion de los elementos
numeros.forEach((el, indice, arreglo) =>{
    console.log(el, indice, arreglo)
});*/

numeros.forEach((el, indice, arreglo) =>{
    console.log(el * el)
});

console.log(numeros);

/*map*/
/*Genera una copia del arreglo original*/

let nuevoArr = numeros.map((el, idx, arr) => {
    return el * el;
})

console.log(nuevoArr);

//filter
//crea una copia del arreglo original y nos permite filtrar

const frutas = ["papaya", "manzana", "manzana", "uva"];

//let frutaFiltrada = frutas.filter((fruta) => fruta !== "manzana");

//console.log(frutaFiltrada);

let frutaFiltrada = frutas.filter((fruta) => fruta.length >= 4);
console.log(frutaFiltrada);