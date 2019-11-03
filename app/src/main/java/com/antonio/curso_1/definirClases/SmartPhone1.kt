package com.antonio.curso_1.definirClases

/** * Created by Antonio Sánchez -- 03/11/2019. -- company Ltd -- antoniom.sanchezf@gmail.com */
class SmartPhone1 {
    //CREACIÓN DE LA CLASE DE MANERA PARECIDA A jAVA
    /*Los campos se denominan property y por defecto son puvblic*/
    //lateinit: variable que no va a admitir nulos y que será inicializada más tarde...
    //constructor: es la palabra reservada para el constructor. En este caso es el constructor secundario. Si fuera el primario se pondría en la entrada de parámetros de la clase.
    //Los getters y los setters vienen por defecto. No es necesario implementarlos. Se podrá acceder desde fuera de la clase asignándoles valor con un nombreClase.propiedad=valor

    var fabricante:String
    var model:String

    constructor(fabricante: String, model: String) {
        this.fabricante = fabricante
        this.model = model
    }
}