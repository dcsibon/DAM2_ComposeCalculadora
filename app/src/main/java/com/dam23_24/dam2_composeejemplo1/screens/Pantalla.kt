package com.dam23_24.dam2_composeejemplo1.screens

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.dam23_24.dam2_composeejemplo1.R

@Preview(showBackground = true)
@Composable
fun Pantalla() {
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
                text = stringResource(R.string.txt_txtPantalla),
                textAlign = TextAlign.End,
                fontSize = 50.sp,
                modifier = Modifier
                    .border(3.dp, Color.Black)
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = stringResource(R.string.txt_txtDetalle),
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
        ){
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
                Text(text = stringResource(R.string.txt_btn0), fontSize = 32.sp)
            }
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
                Text(text = stringResource(R.string.txt_btn1), fontSize = 32.sp)
            }
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
                Text(text = stringResource(R.string.txt_btn2), fontSize = 32.sp)
            }
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
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
        ){
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
                Text(text = stringResource(R.string.txt_btn4), fontSize = 32.sp)
            }
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
                Text(text = stringResource(R.string.txt_btn5), fontSize = 32.sp)
            }
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
                Text(text = stringResource(R.string.txt_btn6), fontSize = 32.sp)
            }
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
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
        ){
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
                Text(text = stringResource(R.string.txt_btn8), fontSize = 32.sp)
            }
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
                Text(text = stringResource(R.string.txt_btn9), fontSize = 32.sp)
            }
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
                Text(text = stringResource(R.string.txt_btnDec), fontSize = 32.sp)
            }
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
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
        ){
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
                Text(text = stringResource(R.string.txt_btnSuma), fontSize = 32.sp)
            }
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
                Text(text = stringResource(R.string.txt_btnResta), fontSize = 32.sp)
            }
            Button(onClick = {  },
                modifier = Modifier.width(160.dp).height(80.dp)) {
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
        ){
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
                Text(text = stringResource(R.string.txt_btnMul), fontSize = 32.sp)
            }
            Button(onClick = {  },
                modifier = Modifier.size(80.dp)) {
                Text(text = stringResource(R.string.txt_btnDiv), fontSize = 32.sp)
            }
            Button(onClick = {  },
                modifier = Modifier.width(160.dp).height(80.dp)) {
                Text(text = stringResource(R.string.txt_btnBorrar), fontSize = 32.sp)
            }
        }
    }
}