package com.antonio.curso_1.definirClases

/** * Created by Antonio Sánchez -- 03/11/2019. -- company Ltd -- antoniom.sanchezf@gmail.com */
class SmartPhone2 constructor(fabricante:String,model:String) {
    /*Creación de la clase utilizando el constructor primario*/
    /*En el nit se inicilizan las properties al crear una instancia de la clase*/
    var fabricante:String
    var model:String

    init {
        this.fabricante=fabricante
        this.model=model
    }
}