const titulo = document.getElementById("titulo");
const parrafos = document.getElementsByClassName("parrafo");

//console.log(titulo);
//console.log(parrafos[1]);

titulo.textContent = "Hola"
parrafos[0].innerHTML = "Soy un parrafo"

console.log(titulo.textContent);
console.log(parrafos[1].textContent);


//parrafos[1].style.color = "red";
//parrafos[1].style.backgroundColor = "purple"

//console.log(parrafos[1].classList.contains("coloresFeos"));
parrafos[0].classList.add("coloresFeos")

//Crear elementos HTML

const padre = document.getElementById("padre");

const enlace = document.createElement("a");
enlace.href = "https://www.google.com";
enlace.textContent = "Ir a google";


//document.body.appendChild(enlace);

//document.body.insertAdjacentElement("afterbegin", enlace);

padre.appendChild(enlace);

console.log(document.body);



