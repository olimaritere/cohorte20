/*const foo = () => console.log("First");
const bar = () => setTimeout(() => console.log("Second"), 500);
const baz = () => console.log("Third");

bar();
foo();
baz();*/

//servidor
/*const nombre = () => {
    const nombres = ["Pepe", "Pancho", "Maria"];

    /*setTimeout(() => {
        return nombres;
    }, 0);
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if(true){
                resolve(nombre);
            }else{
                reject("No hay nombres");
            }
        }, 3000)
    });

}

//servidor
/* Nuestra pc
*/
/*nombre().then(nombres => console.log(nombres)).catch(error => console.warn(error));
*/


//.forEach(element => {});

//console.log(nombre());

//console.log(nombre()[0]);

// Azucar sintactica
//Codigo creado para facilitar el trabajo de programadores

//async -- await

//asyn function obtenerNombre (){}

/*const obtenerNombre = async () => {
    let nombres = await nombre();
    console.log(nombres);

}
obtenerNombre();
*/

/*const url = "https://pokeapi.co/api/v2/pokemon/25";

const pokedex = () => {
    fetch(url)
        .then(datos=> datos.json())
        .then(pokemon => console.log(pokemon))
        .catch(error => console.log(error))
};

pokedex()
*/

const cartaPokemon = document.getElementById("pokemon");
const nombrePokemon = document.getElementById("nombre");
const imagen = document.getElementById("img");
const form = document.getElementById("buscar");



const pokedex = async () => {
    const url = "https://pokeapi.co/api/v2/pokemon/30";
    try{
        const respuesta = await fetch(url);
        const pokemon = await respuesta.json();

        console.log(pokemon.name);
        const datos = {
            nombre: pokemon.name,
            imagen: pokemon.sprites.other,
        }

        console.log(pokemon.sprites.front_default)
        

        nombrePokemon.textContent = datos.name;
        imagen.innerHTML = `
            <img src="${datos.imagen}" alt="imagen de ${datos.nombre}" width="250"/>
        `;


    } catch (error){


    }
}



form.addEventListener("submit", (evento) => {
    //codigo
    evento.preventDefault();

    const valor = document.getElementById("idP");

    console.log(valor.value);
    
    pokedex();
    
    //console.log(evento.target);

})



