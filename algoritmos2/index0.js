

function saludoPer() {
    alert(miVariable);
}

function suma() {
    //let num1 = parseInt( prompt("Valor del numero 1:"));
    //let num2 = parseInt(prompt("Valor del numero 2"));
    let num1 = 5;
    let num2 = 6;
    let resultado = num1 + num2;
    return resultado;
}

//saludoPer(miVariable);
//let r = suma();
//alert (r);
console.log(suma());

function suma(){
    let valor1 = 3;
    let valor2 = 4;
    return valor1 + valor2;

}
console.log("El resultado de la suma: " + suma());

function resta(){
    let valor1 = 5;
    let valor2 = 4;
    return valor1 - valor2;

}
console.log("El resultado de la resta es: " + resta()); 

function multiplicacion(){
    let value1 = 5;
    let value2 = 3;
    return value1 * value2;

}
console.log("El resultado de la multiplicación es: " + multiplicacion());

function division(){
    let valor1 = 30;
    let valor2 = 3;
    if(valor2 != 0){
        
    return valor1/valor2;

    }
    console.log("El denominador es 0");
}

console.log("El resultado de la división es: " + division());

function residuo(){
    let valor1 = 40;
    let valor2 = 12;
    let resultado = valor1 % valor2;
    return resultado;

}
console.log("El residuo de la operación es: " + residuo());

function adicionales(){
    let valor1 = 20;
        valor1+=1;
        return valor1;

}
console.log("El adicional del valor es: " + adicionales());

function logico(){
    let valido = 3;
    let valido2 = 3;
    if(valido < valido2){
        console.log("El mayor es: " + valido2);

    }
   // console.log("El valor booleano es: " + valido);
}
logico();

function edad(){
    let miEdad = 8;
    if(miEdad >= 18){
        console.log("Eres mayor de edad");
    }else{
    console.log("No eres mayor de edad")
    }
}
edad()


function conjuncion(){
    let valor1 = true;
    let valor2 = false;
    if(valor1 && valor2){
        console.log("El valor 1 y valor 2 son verdadero")
    }else{
        console.log("Un valor es falso")
    }
}
conjuncion()

function disyuncion(){
    let valor1 = true;
    let valor2 = false;
    if(valor1 || valor2){
        console.log("El operador or es verdadero")
    }else{
        console.log("El operador or es falso")
    }
}
disyuncion()

function negacion(){
    let valor1 = false;
    if(!valor1){
        console.log("El valor es " + valor1)
    }else{
        console.log("El valor negado es: " + valor1)
    }
}
negacion()

    