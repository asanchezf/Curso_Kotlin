package com.antonio.curso_1.ObjetsCompanionObjects

import android.util.Log

/** * Created by Antonio Sánchez -- 03/11/2019. -- company Ltd -- antoniom.sanchezf@gmail.com */
object MiObject {

    init {
        Log.d("TAG","Hay la llmes muchas veces, solo aparece una vez")
    }
    //Se comportan como clase que tengan el patrón Singleton
    fun miFuncionObjetc(){

        Log.d("TAG","Soy la función del object")
    }

    val miUrl="http://miWeb.com"

}

