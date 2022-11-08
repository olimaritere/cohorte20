/*Escribir un programa que detecte el cupón que tiene el usuario
Bronce se le hará un descuento del 5 %
Plata se le hará un descuento del 10%
Oro se le hará un descuento del 20%
Platino se le hará el descuento del 25%
-El usuario introduce el precio primero y después el cupón
-El programa debe mostrar el precio original y el precio con el descuento aplicado
-También debe mostrar el mensaje "El cupón no es válido" en caso de que sea un 
 cupón equivocado*/

 let precio = Number(prompt("Ingrese el precio: "))
 let cupon = prompt("Ingrese el cupón: ")

switch (cupon){
    case "Bronce":
        let discpriceb = (precio-(precio*.05))
        document.write("Precio original: $" + precio);
        document.write(". Precio con descuento: $" + discpriceb);
        break;
    case "Plata":
        let discpricep = (precio-(precio*.1))
        document.write("Precio original: $" + precio);
        document.write(". Precio con descuento: $" + discpricep);
        break;
    case "Oro":
        let discpriceo = (precio-(precio*.2))
        document.write("Precio original: $" + precio);
        document.write(". Precio con descuento: $" + discpriceo);
        break;
    case "Platino":
        let discpricepl = (precio-(precio*.25))
        document.write("Precio original: $" + precio);
        document.write(". Precio con descuento: $" + discpricepl);
        break; 
    default:
        document.write("Ingresa un cupón válido")       


}
let nombre="Oli";
console.log("Hola");
console.log('Hola');
console.log(`Hola yo soy ${nombre} y mmi edad es ${2022-1992}`);

// Operador ternario//

/*if simplificado*/
/* condición ? en caso de ser verdadero : en caso de ser falso*/

let edad = 18;

let mensaje = edad >= 18
 ? "es mayor de edad"
 : "Tas chiquito";
console.log(mensaje);

console.log(`Yo soy Oli y soy ${edad >=18 ? "Soy mayor de edad" : "Soy menor de edad"}`);


