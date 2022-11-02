/*Realizar una funcion (calcularPrecioTotal)
para Calcular el precio total de una compra tomando encuenta 
impuestos = 1.16, gastos de envio = 10, y como parametro el precio
donde 
precioTotal = (precio * impuesto ) + gartosEnvio;

como salida precio Total
precioTotal = calcularPrecioTotal(23.34);*/

function precioTotal(precio){
    
    let impuesto = 1.16
    let gastoEnvio = 10;
    let precioTotal = precio * impuesto + gastoEnvio;
    console.log(precioTotal)

}
precioTotal(23.34);

let precioTotal1 = (x, y, z) => {return x*y+z};
let ressultado1 = precioTotal1 (23.34, 1.16, 10);
console.log("El precio total es: " + ressultado1);

function precioImpuesto(){
    let precioCImpuesto = 1 + porcentaje 
}

/* Para que el ejemplo anterior sea más completo, se puede añadir otro argumento a la función que indique el porcentaje de impuestos que se debe añadir al precio del producto. Evidentemente, el nuevo argumento se debe añadir tanto a la definición de la función como a su llamada:
let precioConImpuestos = (1 + porcentajeImpuestos/100) * precio;
calculaPrecioTotal(precio, porcentajeImpuestos)
*/
