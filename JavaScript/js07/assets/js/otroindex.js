//forma 1 para crear un elemento

//1 

const imagen = document.getElementsByClassName("contenedor")[0];


//2 - crear el elemento

const nuevaImg = document.createElement("img");

// 3 - Modificar atributos

nuevaImg.src = "https://placeimg.com/200/200/nature";

nuevaImg.alt = "Imagen de naturaleza";

// 4 - Insertar el elemento
imagen.appendChild(nuevaImg);


/*
Otra forma de crear elementos
*/

// 1 - Llamar al elemento padre
const imagen2 = document.getElementById("img");

// 2

imagen2.innerHTML = `
    <img src="https://placeimg.com/200/200/animals" alt = "Imagen de animales"/>
`;

// Crear una lista a partir de los elementos guardados en un arreglo
//Insertarla en el documento para que se pueda mostrar

const nombres = ["Pedro", "Juan", "Sonia", "Miguel"];
/**/

const lista1 = document.getElementById("lista1");
nombres.forEach((el)=>{
    const li = document.createElement('li');
    li.textContent = el;
    lista1.appendChild(li);

});

//forma2
const frutas = ["manzana", "limon", "pera", "uva"];

const lista2 = document.getElementById("lista2");

frutas.forEach((el) => {
    lista2.innerHTML += `
        <li>${el}</li>
    `;
})




