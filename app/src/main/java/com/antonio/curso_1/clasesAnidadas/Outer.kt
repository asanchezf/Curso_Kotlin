package com.antonio.curso_1.clasesAnidadas

/** * Created by Antonio Sánchez -- 03/11/2019. -- company Ltd -- antoniom.sanchezf@gmail.com */
class Outer {

    private var varAnidada:Int=10

    class Anidada{

        fun funcionDeClaseAnidada(){
            var prueba:Int
            //prueba=varAnidada ...Para poder a los miembros de Outer debe ser declara como inner
        }
    }

    inner class Interior{

        fun funcionDeClaseInner(){
            var prueba:Int
            prueba=varAnidada //...Para poder a los miembros de Outer debe ser declara como inner
        }
    }
}