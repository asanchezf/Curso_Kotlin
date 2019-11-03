package com.antonio.curso_1.herencia

/** * Created by Antonio Sánchez -- 03/11/2019. -- company Ltd -- antoniom.sanchezf@gmail.com */
open class Calculadora {
    //Para que pueda ser extendida se debe poner open
    fun suma (numero1:Int=3,numero2:Int=5):Int {
        return numero1+numero2
    }

    fun resta (numero1:Int=3,numero2:Int=5):Int {
        return numero1-numero2
    }
}