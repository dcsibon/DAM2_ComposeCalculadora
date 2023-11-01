package com.dam23_24.dam2_composeejemplo1

import android.icu.text.DecimalFormat
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.dam23_24.dam2_composeejemplo1.screens.Pantalla
import com.dam23_24.dam2_composeejemplo1.ui.theme.DAM2_ComposeEjemplo1Theme

class MainActivity : ComponentActivity() {

    private lateinit var calc: Calculo
    private val df = DecimalFormat("#.##")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DAM2_ComposeEjemplo1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Pantalla()
                }
            }
        }

        // Creo mi objeto de tipo Calculo.
        calc = Calculo()
    }

    /**
     * Agrega el dígito pulsado en el número correspondiente del objeto calc.
     *
     * @param num dígito pulsado del 0 al 9 o punto decimal (10)
     */
    private fun btnNumClicked(num: Int) {
        calc.tecleaDigito(num)

        //Mostramos info actualizada en los TextView de la app
        muestraValor()
    }

    /**
     * Muestra la información en los componentest TextView txtPantalla y txtDetalle.
     *
     * @param pantalla info a mostrar en txtPantalla
     * @param detalle info a mostrar en txtDetalle
     */
    private fun muestraValor(pantalla: String, detalle: String) {
        /*txtPantalla.text = getString(R.string.txt_txtPantalla, pantalla)
        txtDetalle.text = getString(R.string.txt_txtDetalle, detalle)*/
    }

    /**
     * Muestra la información en los componentest TextView txtPantalla y txtDetalle dependiendo del paso donde nos encontremos.
     */
    private fun muestraValor() {
        //Mostramos info actualizada en los TextView de la app
        if (calc.primerNum) {
            muestraValor(calc.numTemp1, calc.numTemp1)
        } else {
            if (calc.numTemp2.isEmpty()) {
                muestraValor(calc.operadorTxt(), calc.numTemp1 + calc.operadorTxt() + calc.numTemp2)
            }
            else {
                muestraValor(calc.numTemp2, calc.numTemp1 + calc.operadorTxt() + calc.numTemp2)
            }
        }
    }

    /**
     * Muestra un mensaje de error en pantalla durante un tiempo corto.
     *
     * @msj mensaje de error
     */
    private fun mensajeError(msj: String) {
        Toast.makeText(this, msj, Toast.LENGTH_SHORT).show()
    }
}

