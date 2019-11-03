package com.antonio.curso_1.herencia

/** * Created by Antonio Sánchez -- 03/11/2019. -- company Ltd -- antoniom.sanchezf@gmail.com */
class Cientifica():Calculadora() {
    fun multiplicacion (numero1:Int=3,numero2:Int=5):Int {
        return numero1*numero2
    }
}