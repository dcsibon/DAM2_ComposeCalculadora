package com.dam23_24.dam2_composeejemplo1.screens


import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam23_24.dam2_composeejemplo1.Calculo


/**
 * Función Composable principal que se llama desde el setContent del MainActivity y contiene
 * los estados y realiza las llamadas a las funciones Composable que componen todos los elementos
 * del layout.
 */
@Preview(showBackground = true)
@Composable
fun CalcScreen() {

    //Contexto y estados
    val context = LocalContext.current
    var msjPpal by rememberSaveable { mutableStateOf("") }
    var msjDetalle by rememberSaveable { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {

        //Text que muestran la información de la pantalla ppal y el detalle.
        ScreenDetailText(
            msjPpal = msjPpal,
            msjDetalle = msjDetalle
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {

            //Primera fila de botones del 0 al 3.
            ScreenRowButtons(
                numbtn = listOf(0, 1, 2, 3),
                txtBtn = listOf("0", "1", "2", "3"),
                width = listOf(80, 80, 80, 80),
                onClickBtn = {
                    Calculo.pulsaBoton(it)
                    msjPpal = Calculo.getMsjPpal()
                    msjDetalle = Calculo.getMsjDetalle()
                }
            )

            //Segunda fila de botones del 4 al 7.
            ScreenRowButtons(
                numbtn = listOf(4, 5, 6, 7),
                txtBtn = listOf("4", "5", "6", "7"),
                width = listOf(80, 80, 80, 80),
                onClickBtn = {
                    Calculo.pulsaBoton(it)
                    msjPpal = Calculo.getMsjPpal()
                    msjDetalle = Calculo.getMsjDetalle()
                }
            )

            //Tercera fila de botones: 8, 9, punto decimal (.) y Reset (C).
            ScreenRowButtons(
                numbtn = listOf(8, 9, 10, 11),
                txtBtn = listOf("8", "9", ".", "C"),
                width = listOf(80, 80, 80, 80),
                onClickBtn = {
                    Calculo.pulsaBoton(it)
                    msjPpal = Calculo.getMsjPpal()
                    msjDetalle = Calculo.getMsjDetalle()
                }
            )

            //Cuarta fila de botones: operaciones sumar (+), restar(-) y ejecutar cálculo (=).
            ScreenRowButtons(
                numbtn = listOf(12, 13, 14),
                txtBtn = listOf("+", "-", "="),
                width = listOf(80, 80, 160),
                onClickBtn = {
                    if (!Calculo.pulsaBoton(it)){
                        mensajeError(context, "Debe introducir 2 números y una operación para mostrar un resultado")
                    }
                    msjPpal = Calculo.getMsjPpal()
                    msjDetalle = Calculo.getMsjDetalle()
                }
            )

            //Quinta fila de botones: operaciones sumar (*), restar(/) y borrar dígito (<).
            ScreenRowButtons(
                numbtn = listOf(15, 16, 17),
                txtBtn = listOf("*", "/", "<"),
                width = listOf(80, 80, 160),
                onClickBtn = {
                    if (!Calculo.pulsaBoton(it)){
                        mensajeError(context, "No existe nada para borrar")
                    }
                    msjPpal = Calculo.getMsjPpal()
                    msjDetalle = Calculo.getMsjDetalle()
                }
            )
        }
    }
}


/**
 * Función Composable que genera el layout de los textos principal y detalle de la calculadora.
 */
@Composable
private fun ScreenDetailText(
    msjPpal: String,
    msjDetalle: String
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 50.dp, start = 50.dp, end = 50.dp, bottom = 40.dp)
    ) {

        Text(
            text = msjPpal,
            textAlign = TextAlign.End,
            fontSize = 50.sp,
            modifier = Modifier
                .border(3.dp, Color.Black)
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = msjDetalle,
            textAlign = TextAlign.End,
            fontSize = 24.sp,
            modifier = Modifier
                .border(3.dp, Color.Black)
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
        )
    }
}


/**
 * Función Composable que genera el layout de una fila de botones.
 */
@Composable
private fun ScreenRowButtons(
    numbtn: List<Int>,
    txtBtn: List<String>,
    width: List<Int>,
    onClickBtn: (Int) -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
    ) {
        for (i in numbtn.indices) {
            ScreenButton(
                numbtn = numbtn[i],
                txtBtn = txtBtn[i],
                width = width[i],
                onClickBtn = { onClickBtn(numbtn[i]) }
            )
        }
    }
}


/**
 * Función Composable que genera el layout de un botón.
 */
@Composable
private fun ScreenButton(
    numbtn: Int,
    txtBtn: String,
    width: Int,
    onClickBtn: (Int) -> Unit
) {
    Button(
        onClick = { onClickBtn(numbtn) },
        modifier = Modifier
            .width(width.dp)
            .height(80.dp)
    ) {
        Text(
            text = txtBtn,
            fontSize = 32.sp
        )
    }
}


/**
 * Muestra un mensaje de error con Toast en el contexto origen
 *
 * @param context Contexto local actual
 * @param msj Mensaje de texto a mostrar
 */
fun mensajeError(
    context: Context,
    msj: String
){
    Toast.makeText(
        context,
        msj,
        Toast.LENGTH_SHORT
    ).show()
}