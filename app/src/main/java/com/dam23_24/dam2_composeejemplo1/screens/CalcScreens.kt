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

@Preview(showBackground = true)
@Composable
fun CalcScreen() {

    val context = LocalContext.current
    var msjPpal by remember { mutableStateOf("") }
    var msjDetalle by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {

        ScreenDetailText(
            msjPpal = msjPpal,
            msjDetalle = msjDetalle)

        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {

            ScreenBtn0_3(
                onClickBtn0 = {
                    calc.tecleaDigito(0)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtn1 = {
                    calc.tecleaDigito(1)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtn2 = {
                    calc.tecleaDigito(2)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtn3 = {
                    calc.tecleaDigito(3)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                })

            ScreenBtn4_7(
                onClickBtn4 = {
                    calc.tecleaDigito(4)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtn5 = {
                    calc.tecleaDigito(5)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtn6 = {
                    calc.tecleaDigito(6)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtn7 = {
                    calc.tecleaDigito(7)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                })

            ScreenBtn8_C(
                onClickBtn8 = {
                    calc.tecleaDigito(8)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtn9 = {
                    calc.tecleaDigito(9)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtnDec = {
                    calc.tecleaDigito(10)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtnC = {
                    calc.iniValores()
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                })

            ScreenBtnOper_Res(
                onClickBtnSum = {
                    calc.tecleaOperador(0)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtnRes = {
                    calc.tecleaOperador(1)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtnResult = {
                    if (!calc.pulsaResult()) Toast.makeText(context, "Debe introducir 2 números y una operación para mostrar un resultado", Toast.LENGTH_SHORT).show()
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                })

            ScreenBtnOper_Del(
                onClickBtnMul = {
                    calc.tecleaOperador(2)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtnDiv = {
                    calc.tecleaOperador(3)
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                },
                onClickBtnDel = {
                    if (!calc.borraDigito()) Toast.makeText(context, "No existe nada para borrar", Toast.LENGTH_SHORT).show()
                    msjPpal = calc.msjPpal
                    msjDetalle = calc.msjDetalle
                })
        }
    }
}


@Composable
fun ScreenDetailText(
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

@Composable
fun ScreenBtn0_3(
    onClickBtn0: () -> Unit,
    onClickBtn1: () -> Unit,
    onClickBtn2: () -> Unit,
    onClickBtn3: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 40.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { onClickBtn0() },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn0), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtn1() },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn1), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtn2() },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn2), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtn3() },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn3), fontSize = 32.sp)
        }
    }
}

@Composable
fun ScreenBtn4_7(
    onClickBtn4: () -> Unit,
    onClickBtn5: () -> Unit,
    onClickBtn6: () -> Unit,
    onClickBtn7: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { onClickBtn4() },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn4), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtn5() },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn5), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtn6() },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn6), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtn7() },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn7), fontSize = 32.sp)
        }
    }
}

@Composable
fun ScreenBtn8_C(
    onClickBtn8: () -> Unit,
    onClickBtn9: () -> Unit,
    onClickBtnDec: () -> Unit,
    onClickBtnC: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { onClickBtn8() },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn8), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtn9() },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btn9), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtnDec() },
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

@Composable
fun ScreenBtnOper_Res(
    onClickBtnSum: () -> Unit,
    onClickBtnRes: () -> Unit,
    onClickBtnResult: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { onClickBtnSum() },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnSuma), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtnRes() },
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

@Composable
fun ScreenBtnOper_Del(
    onClickBtnMul: () -> Unit,
    onClickBtnDiv: () -> Unit,
    onClickBtnDel: () -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 0.dp, end = 20.dp, bottom = 40.dp)
    ) {
        Button(
            onClick = { onClickBtnMul() },
            modifier = Modifier.size(80.dp)
        ) {
            Text(text = stringResource(R.string.txt_btnMul), fontSize = 32.sp)
        }
        Button(
            onClick = { onClickBtnDiv() },
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


