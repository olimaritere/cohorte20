class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    set nombre (nombre){
        this._nombre = nombre;
    }
    set apellido ( apellido){
        this._apellido = apellido;
    }
    nombreCompleto(){
        return this._nombre + " " + this._apellido
    }
    toString () {
        return this.nombreCompleto();
    }
    
}
//
class Empleado extends Persona{
    constructor(nombre, apellido, empresa){
        super(nombre, apellido);
        this._empresa = empresa;    
    }
    set empresa(empresa){
        this._empresa = empresa;
    }
    get empresa(){
        return this._empresa;
    }
    //soreescritura del metodo
    nombreCompleto(){
        return super.nombreCompleto() + " " + this._empresa;
    }
}

let p1 = new Persona("Hugo", "Sanchez");
console.log(p1.nombreCompleto());
console.log(p1.toString());
let E1 = new Empleado("Juan", "Perez", "Coppel");

//console.log(E1.nombreCompleto() + " " + E1.empresa);
console.log(E1.nombreCompleto());
console.log(p1.toString());
