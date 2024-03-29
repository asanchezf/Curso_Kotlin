package com.antonio.curso_1

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.os.Bundle
import android.os.SystemClock
import android.text.Html
import android.util.Log
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.antonio.curso_1.ObjetsCompanionObjects.MiObject
import com.antonio.curso_1.definirClases.SmartPhone4
import com.antonio.curso_1.herencia.Cientifica
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

      lateinit var progressBar:ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
        miEnteroAdmiteNulos=null

        //VALORES EN EL LOG
        Log.d("TAG","Mensaje que se va a mostrar"+miChar)

      var miSmartPhone4=SmartPhone4("Apple","Iphone 8")
        Log.d("TAG","Este es el fabricante: ${miSmartPhone4.fabricante} y este es el modelo: ${miSmartPhone4.modelo} ")

        //HERENCIA
        var miCientifica=Cientifica()
        miCientifica.suma(3,2)
        miCientifica.resta(6,8)
        miCientifica.multiplicacion(4,9)

        //OBJECT--Patrón singleton
        MiObject.miFuncionObjetc()//Se accede a ellos como si fueran static class
        MiObject.miFuncionObjetc()
        var url=MiObject.miUrl//Nos trae el valor de la constante definida en MiObject

//http://jonsegador.com/2017/09/android-textview-convertir-urls-en-enlaces/
        txtformato.setText(
            Html.fromHtml(resources.getString(R.string.formato))
            )


        //ejecutaProgressBar()

    }

    private fun ejecutaProgressBar() {
        progressBar.max

    }

    //recibe un entero y devuelve un entero
    fun alCuadrado(numero:Int):Int{
        return numero*numero
    }

    fun mostrarLog(numeroAMostrar:Int){

        Log.d("TAG","El resultado es: $numeroAMostrar")
    }



     inner class AsynTask_load: AsyncTask<Void, Integer, Void>() {
        var progreso:Int=0

        override fun onPreExecute() {
            super.onPreExecute()
            Toast.makeText(this@MainActivity,"Estamos en el preexecute",Toast.LENGTH_LONG).show()
            //Toast.makeText(this, "Hi there! This is a Toast.", Toast.LENGTH_SHORT).show()
            progreso=0



        }

        @SuppressLint("WrongThread")
        override fun doInBackground(vararg p0: Void?): Void? {
            while (progreso<progressBar.max){
                progreso++
                //publishProgress(progreso)
                SystemClock.sleep(20)

            }
            return null
        }

        override fun onProgressUpdate(vararg values: Integer?) {
            super.onProgressUpdate(*values)
            //progressBar.setProgress(values[0])
        }
    }

}
