/* let arr = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
    
];
console.log(arr[0][0]);

let suba = [1, 2, 3];
let subb = [4, 5, 6];
let subc = [7, 8, 9];
let arreglos = [suba, subb, subc]; */

/*for (let i = 0; i <= 2; i++){
    console.log(arr[i]);

}*/

// for (let fila = 0; fila <= 2; fila++){
//     for (let columna = 0; columna <=2; columna++){

//         console.log(arr[fila][columna]);
        
//     }
//     console.log("____________________");
// }
/* let contador = 0;
while(contador < 10){
    contador = contador + 1;
    console.log(contador);


}
console.log(contador); */

/* let contador = 0;
while (contador < 10){
    console.log(contador);
    contador = contador + 1;

} */
/* let contador = 0
do{
    console.log(contador);
    contador ++;
}while(contador <= 10);
 */
/* let cadena = "Hola";
console.log(cadena.length); */


/* let fila = 0;
while(fila < 3){

    for(let columna = 0; columna <=2; columna++){
        console.log(arr[fila][columna]);

    }
    fila ++;
    console.log("-----------------");

} */
/* let fila = 0;
do {

    for(let columna = 0; columna <=2; columna++){
        console.log(arr[fila][columna]);

    }
    fila ++;
    console.log("-----------------");
}while(fila <=0); */


let a = [[2, 2, 2], [1, 3, 4], [6, 1, 5]];

let b = [[1, 2, 3],[4, 5, 6], [7, 8, 9]];

let c_ = [];

for (let indiceA = 0; indiceA < a.length; indiceA++) {
    let fila = [];
    for (let indiceB = 0; indiceB < a[indiceA].length; indiceB++){
        console.log(a[indiceA][indiceB]*b[indiceB][indiceA]);
        let elementos = a[indiceA][indiceB]*b[indiceB][indiceA];
        fila.push(elementos);
    }
    c_.push(fila);
}
console.log(c_)








