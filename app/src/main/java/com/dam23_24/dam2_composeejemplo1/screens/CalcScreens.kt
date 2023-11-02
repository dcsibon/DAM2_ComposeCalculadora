package com.dam23_24.dam2_composeejemplo1.screens

import android.content.Context
import android.icu.text.DecimalFormat
import android.service.autofill.OnClickAction
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
import androidx.constraintlayout.compose.ConstraintLayout
import com.dam23_24.dam2_composeejemplo1.Calculo
import com.dam23_24.dam2_composeejemplo1.R


private val calc = Calculo()
private val df = DecimalFormat("#.##")

@Preview(showBackground = true)
@Composable
fun CalcScreen() {

    val context = LocalContext.current
    var msjPpal by remember { mutableStateOf("") }
    var msjDetalle by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {

        ScreenDetailText(msjPpal, msjDetalle)

        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {

            ScreenBtn0_3(
                msjPpal,
                msjDetalle,
                onClick = { })

            ScreenBtn4_7()

            ScreenBtn8_C()

            ScreenBtnOper_Res()

            ScreenBtnOper_Del()

        }
    }
}

@Composable
fun ScreenDetailText(msjPpal: String, msjDetalle: String) {

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

@Composable
fun ScreenBtn0_3(
    msjPpal: String,
    msjDetalle: String,
    onClick: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 40.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { msjPpal = "0" },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn0), fontSize = 32.sp)
        }
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn1), fontSize = 32.sp)
        }
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn2), fontSize = 32.sp)
        }
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn3), fontSize = 32.sp)
        }
    }
}

@Composable
fun ScreenBtn4_7() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn4), fontSize = 32.sp)
        }
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn5), fontSize = 32.sp)
        }
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn6), fontSize = 32.sp)
        }
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn7), fontSize = 32.sp)
        }
    }
}

@Composable
fun ScreenBtn8_C() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn8), fontSize = 32.sp)
        }
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn9), fontSize = 32.sp)
        }
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnDec), fontSize = 32.sp)
        }
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnCE), fontSize = 32.sp)
        }
    }
}

@Composable
fun ScreenBtnOper_Res() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnSuma), fontSize = 32.sp)
        }
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnResta), fontSize = 32.sp)
        }
        Button(
            onClick = { },
            modifier = Modifier
                .width(160.dp)
                .height(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnResult), fontSize = 32.sp)
        }
    }
}

@Composable
fun ScreenBtnOper_Del() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnMul), fontSize = 32.sp)
        }
        Button(
            onClick = { },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnDiv), fontSize = 32.sp)
        }
        Button(
            onClick = { },
            modifier = Modifier
                .width(160.dp)
                .height(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnBorrar), fontSize = 32.sp)
        }
    }
}


/**
 * Agrega el dígito pulsado en el número correspondiente del objeto calc.
 *
 * @param num dígito pulsado del 0 al 9 o punto decimal (10)
 */
private fun btnClicked(calc: Calculo, num: Int) {
    calc.tecleaDigito(num)

    //Mostramos info actualizada en los TextView de la app
    muestraValor(calc)
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
 * Muestra la información en los componentes Text que contienen la información de la pantalla principal y la pantalla de detalle de la calculadora dependiendo del paso donde nos encontremos.
 */
private fun muestraValor() {
    //Mostramos info actualizada en los TextView de la app
    if (calc.primerNum) {
        muestraValor(calc.numTemp1, calc.numTemp1)
    } else {
        if (calc.numTemp2.isEmpty()) {
            muestraValor(calc.operadorTxt(), calc.numTemp1 + calc.operadorTxt() + calc.numTemp2)
        } else {
            muestraValor(calc.numTemp2, calc.numTemp1 + calc.operadorTxt() + calc.numTemp2)
        }
    }
}

/**
 * Muestra un mensaje de error en pantalla durante un tiempo corto.
 *
 * @msj mensaje de error
 */
private fun mensajeError(context: Context, msj: String) {
    Toast.makeText(context, msj, Toast.LENGTH_SHORT).show()
}

/*@Preview(showBackground = true)*/
@Composable
fun CalcScreen1() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {

        val (colPantallas, filaBotones1, filaBotones2, filaBotones3, filaBotones4, filaBotones5) = createRefs()

        val topGuide = createGuidelineFromTop(0.05f)

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
                .constrainAs(colPantallas) {
                    top.linkTo(topGuide)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }) {

            Text(
                text = "",
                textAlign = TextAlign.End,
                fontSize = 50.sp,
                modifier = Modifier
                    .border(3.dp, Color.Black)
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "",
                textAlign = TextAlign.End,
                fontSize = 24.sp,
                modifier = Modifier
                    .border(3.dp, Color.Black)
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
            )
        }

        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 40.dp, end = 20.dp, bottom = 40.dp)
                .constrainAs(filaBotones1) {
                    top.linkTo(colPantallas.bottom)
                    start.linkTo(parent.start)
                }
        ) {
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btn0), fontSize = 32.sp)
            }
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btn1), fontSize = 32.sp)
            }
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btn2), fontSize = 32.sp)
            }
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btn3), fontSize = 32.sp)
            }
        }

        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
                .constrainAs(filaBotones2) {
                    top.linkTo(filaBotones1.bottom)
                    start.linkTo(parent.start)
                }
        ) {
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btn4), fontSize = 32.sp)
            }
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btn5), fontSize = 32.sp)
            }
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btn6), fontSize = 32.sp)
            }
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btn7), fontSize = 32.sp)
            }
        }

        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
                .constrainAs(filaBotones3) {
                    top.linkTo(filaBotones2.bottom)
                    start.linkTo(parent.start)
                }
        ) {
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btn8), fontSize = 32.sp)
            }
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btn9), fontSize = 32.sp)
            }
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btnDec), fontSize = 32.sp)
            }
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btnCE), fontSize = 32.sp)
            }
        }

        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
                .constrainAs(filaBotones4) {
                    top.linkTo(filaBotones3.bottom)
                    start.linkTo(parent.start)
                }
        ) {
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btnSuma), fontSize = 32.sp)
            }
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btnResta), fontSize = 32.sp)
            }
            Button(
                onClick = { },
                modifier = Modifier
                    .width(160.dp)
                    .height(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btnResult), fontSize = 32.sp)
            }
        }

        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
                .constrainAs(filaBotones5) {
                    top.linkTo(filaBotones4.bottom)
                    start.linkTo(parent.start)
                }
        ) {
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btnMul), fontSize = 32.sp)
            }
            Button(
                onClick = { },
                modifier = Modifier.size(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btnDiv), fontSize = 32.sp)
            }
            Button(
                onClick = { },
                modifier = Modifier
                    .width(160.dp)
                    .height(80.dp)
            ) {
                Text(text = stringResource(R.string.txt_btnBorrar), fontSize = 32.sp)
            }
        }
    }
}

