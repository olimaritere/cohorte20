//crea un archivo llamado ejercicio1.js
//cada comando debe mostrarse en consola

const personas = ["Maria", "Dani", "Luis", "Juan", "Camila"];
console.log(personas)

//Escribe un comando para remover a "Dani" del arreglo
personas.splice(1, 1);
console.log(personas);

//Escribe un comando para remover a "Juan del arreglo"
personas.splice(2, 1);
console.log(personas);

//Escribe un comando para agregar a "Luis" al inicio del arreglo
personas.splice(0, 0, "Luis");
//personas.unshift("Luis");
console.log(personas);

//Escribe el comando para agregar tu nombre al final del arreglo
personas.push("Olivia");
console.log(personas);

//Escribe el comando para mostrar la posición de "Maria"
console.log(personas.indexOf("Maria"));

//Escribe el comando para mostrar la posición de tu nombre
console.log(personas.indexOf("Olivia"));
console.log(personas.indexOf("Luis"));
