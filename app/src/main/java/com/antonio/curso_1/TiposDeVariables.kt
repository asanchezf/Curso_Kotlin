package com.antonio.curso_1

/** * Created by Antonio Sánchez -- 20/10/2019. -- company Ltd -- antoniom.sanchezf@gmail.com */
class TiposDeVariables {

    //Se puede crear la variable sin decir cuál es el tipo
    var miStrig="Hola"
    var miInt=3
    /*==================*/
   //TIPOS DE VARIABLES NUMÉRICAS:
    //Int:
    var miNumeroEntero :Int=300
    //Long:
    var miNumeroLargo:Long = 30000000300300
    //Float:
    var miNumeroFloat: Float= 3.14F
    //Double:
    var miNumeroDouble:Double=3.1495//Más precisión que float

    //TIPOS DE VARIABLES caracteres:
    //Char:
    var miChar:Char='c'
    //String cadema de caracteres
    var miString: String="miString"

    //Boolean:
    var miBoolean:Boolean=false


    /*CONSTANTES*/
    //Se debe poner Val en vez de Var
    val miConstante=33//Su valor no cambiará en ningún momento. Si lo intentáramos daría un error.

    /*VARIABLES QUE PUEDEN ADMITIR TIPOS NULOS*/

    var miEntero:Int=33
    var miEnteroAdmiteNulos:Int?=44//Le decimos con ? que puede admitir nulos: Null Safety


    /*VARIABLES QUE PUEDEN ADMITIR VALORES NULOS*/

    var admiteNulos:Int = 33
    //miEnteroAdmiteNulos=null


}