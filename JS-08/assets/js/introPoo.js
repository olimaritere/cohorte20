/*let persona1 = new Object();
persona1.edad = 23;
console.log(persona1.edad);
*/

//Crear directamente el objeto
//Forma literal
let x = 10;
console.log(x);

let persona = {
    nombre: "Juan",
    apellido: "Perez",
    nombreCompleto: function () {
        return "El nombre completo es: " + this.nombre + this.apellido;
    }
}
//forIn
for (nombrePropiedad in persona) {
    console.log(nombrePropiedad);
    console.log("valor" + persona[nombrePropiedad]);
}

console.log(persona);
console.log(persona.nombre);
console.log(persona.nombreCompleto());
console.log(persona["apellido"]);
persona.tel = "872348734";
console.log(persona.tel);
delete persona.tel;
console.log(persona);
let personaArreglo = Object.values(persona);
console.log(personaArreglo);
let personaString = JSON.stringify(persona);
console.log(personaString);






