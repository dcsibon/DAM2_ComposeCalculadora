package com.dam23_24.dam2_composeejemplo1.screens


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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dam23_24.dam2_composeejemplo1.Calculo
import com.dam23_24.dam2_composeejemplo1.R


private val calc = Calculo()


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
    var msjPpal by remember { mutableStateOf("") }
    var msjDetalle by remember { mutableStateOf("") }

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
            ScreenBtn0_3(
                onClickBtn = {
                    calc.tecleaDigito(it)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                }
            )

            //Segunda fila de botones del 4 al 7.
            ScreenBtn4_7(
                onClickBtn = {
                    calc.tecleaDigito(it)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                }
            )

            //Tercera fila de botones: 8, 9, punto decimal (.) y Reset (C).
            ScreenBtn8_C(
                onClickBtn = {
                    calc.tecleaDigito(it)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtnC = {
                    calc.iniValores()
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                }
            )

            //Cuarta fila de botones: operaciones sumar (+), restar(-) y ejecutar cálculo (=).
            ScreenBtnOper_Res(
                onClickBtnOp = {
                    calc.tecleaOperador(it)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtnResult = {
                    if (!calc.pulsaResult()) Toast.makeText(
                        context,
                        "Debe introducir 2 números y una operación para mostrar un resultado",
                        Toast.LENGTH_SHORT
                    ).show()
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                }
            )

            //Quinta fila de botones: operaciones sumar (*), restar(/) y borrar dígito (<).
            ScreenBtnOper_Del(
                onClickBtnOp = {
                    calc.tecleaOperador(it)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtnDel = {
                    if (!calc.borraDigito()) Toast.makeText(
                        context,
                        "No existe nada para borrar",
                        Toast.LENGTH_SHORT
                    ).show()
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
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
            .padding(top = 50.dp, start = 50.dp, end = 50.dp)
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
 * Función Composable que genera el layout de los botones del 0 al 3 de la primera fila.
 */
@Composable
private fun ScreenBtn0_3(
    onClickBtn: (Int) -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 40.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { onClickBtn(0) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn0), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtn(1) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn1), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtn(2) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn2), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtn(3) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn3), fontSize = 32.sp)
        }
    }
}


/**
 * Función Composable que genera el layout de los botones del 4 al 7 de la segunda fila.
 */
@Composable
fun ScreenBtn4_7(
    onClickBtn: (Int) -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { onClickBtn(4) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn4), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtn(5) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn5), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtn(6) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn6), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtn(7) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn7), fontSize = 32.sp)
        }
    }
}


/**
 * Función Composable que genera el layout de los botones 8, 9, punto decimal (.) y
 * reset (C) de la tercera fila.
 */
@Composable
fun ScreenBtn8_C(
    onClickBtn: (Int) -> Unit,
    onClickBtnC: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { onClickBtn(8) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn8), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtn(9) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn9), fontSize = 32.sp)
        }
        Button(
            //El punto decimal se trata con el número 10 en el método tecleaDigito del objeto calc.
            onClick = { onClickBtn(10) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnDec), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtnC() },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnCE), fontSize = 32.sp)
        }
    }
}


/**
 * Función Composable que genera el layout de los botones de los operadores sumar (+),
 * restar (-) y resultado (=) de la cuarta fila.
 */
@Composable
fun ScreenBtnOper_Res(
    onClickBtnOp: (Int) -> Unit,
    onClickBtnResult: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { onClickBtnOp(0) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnSuma), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtnOp(1) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnResta), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtnResult() },
            modifier = Modifier
                .width(160.dp)
                .height(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnResult), fontSize = 32.sp)
        }
    }
}


/**
 * Función Composable que genera el layout de los botones de los operadores multiplicar (*), dividir (/) y
 * borrar dígito (<) de la última fila.
 */
@Composable
fun ScreenBtnOper_Del(
    onClickBtnOp: (Int) -> Unit,
    onClickBtnDel: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { onClickBtnOp(2) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnMul), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtnOp(3) },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnDiv), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtnDel() },
            modifier = Modifier
                .width(160.dp)
                .height(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnBorrar), fontSize = 32.sp)
        }
    }
}