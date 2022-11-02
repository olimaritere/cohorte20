let mioNom="Olivia Suárez";
console.log(mioNom);

function miNombre(){
    let nombre = "Olivia";
    console.log(nombre);
}
miNombre();

function funcion1(){
    let valor = 2;
    valor = valor + 3;
    return valor;

}
let resultado = funcion1();
console.log("El resultado es: " + resultado)

function funcion2(){
    let numero1 = 2;
    numero1 = numero1 + 4;
    console.log("EL resultado es: " + numero1)

}
funcion2();

let variableGlobal = 5;

function funcion3(){
    let variableLocal= "El valor es. ";
    console.log(variableLocal + variableGlobal);
}
funcion3();

function funcion4(valor){
    let numero = 6;
    numero = numero * valor;
    return numero;
}
let salida = funcion4(3);
console.log("El producto es " + salida);

//funciones anonimas se declaran sin nombre o sin identificador//
//Se pueden asignar a variables//

let miFuncion0 = function (parametro){
    parametro = parametro * 2;
    return parametro;
};
console.log("Llamando a la función anónima " + miFuncion0(4));

let funcion01= function (caracteres){
    return "Hola " + caracteres;
}("lunes ");
console.log("El resultado es " + funcion01)

//Funciones de tipo flecha//
let suma = (x, y) => {return x+y};
let ressultado =  suma (5, 3);
console.log("La suma es: " + ressultado);

let miObjeto ={
    nombre: "Juan",
    edad: 30,
    datos: function(){
        let mensaje = "Tú eres " + this.nombre;
        mensaje += " y tienes " + this["edad"] + " años";
        console.log(mensaje);
    }
};
miObjeto.datos();
//Constructor es una función que construye un objeto y el objeto tiene atributos y metodos; es como una función que tiene otra función//
let constructor = function (){
    let objPersona = {
        nombre: "Juan",
        nss: 2357,
        datosPersona: function(){//metodo//
            let msj= "Eres " + this.nombre + ", el número nss es " + this.nss;
            console.log(msj);
        },
        otroMetodo: function (parametro){
            let numero = 8;
            console.log("La suma es: " + (numero+parametro));
        }
    };
    return objPersona;
}
let varObjReg =constructor();//crear la variable llamada objeto dentro de POO//
varObjReg.datosPersona();
varObjReg.otroMetodo(5);

//Hacer un metodo dentro de un objeto

