package com.kotlinlearning3.son_calculator;



import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String ilksayi= "";
    String ikincisayi;

   Double x,y,z;


    String symbol=null;

    TextView calculate;

    @Override


     //https://www.youtube.com/watch?v=EzI2YI37Em4&t=51s&ab_channel=EmreDi%C5%9Fci
    //https://www.youtube.com/watch?v=4UsPmyh8aS4&ab_channel=SerhatTemel

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        calculate = (TextView) findViewById(R.id.counter);
        Button zero = (Button) findViewById(R.id.btnZero);
        Button one = (Button) findViewById(R.id.btnOne);
        Button two = (Button) findViewById(R.id.btnTwo);
        Button three = (Button) findViewById(R.id.btnTree);
        Button four = (Button) findViewById(R.id.btnFour);
        Button five = (Button) findViewById(R.id.btnFive);
        Button six = (Button) findViewById(R.id.btnSix);
        Button seven = (Button) findViewById(R.id.btnSeven);
        Button eight = (Button) findViewById(R.id.btnEight);
        Button nine = (Button) findViewById(R.id.btnNine);
        Button equal = (Button) findViewById(R.id.btnEquals);
        Button dot = (Button) findViewById(R.id.btnDot);
        Button plus = (Button) findViewById(R.id.btnAddition);
        Button minus = (Button) findViewById(R.id.btnSub);
        Button multiply = (Button) findViewById(R.id.btnMultiply);
        Button divide = (Button) findViewById(R.id.btnDivide);
        Button sin = (Button) findViewById(R.id.btnSin);
        Button sqrt = (Button) findViewById(R.id.btnSqrt);
        Button factorial = (Button) findViewById(R.id.btnFactorial);
        Button yuzde = (Button) findViewById(R.id.btnPercentage);
        Button sil = (Button) findViewById(R.id.btnAc);
        Button parantez = (Button) findViewById(R.id.btnParanthesis);
        Button power = (Button) findViewById(R.id.btnPower);
        Button delete = (Button) findViewById(R.id.btnDel);

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Results();
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(symbol==null){
                    symbol="+";
                    x=Double.parseDouble(ilksayi);
                    ilksayi=ilksayi+symbol;
                    ikincisayi=ilksayi;
                    ilksayi="";
                }

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(symbol==null){
                    symbol="-";
                    x=Double.parseDouble(ilksayi);
                    ilksayi=ilksayi+symbol;
                    ikincisayi=ilksayi;
                    ilksayi="";
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(symbol==null){
                    symbol="*";
                    x=Double.parseDouble(ilksayi);
                    ilksayi=ilksayi+symbol;
                    ikincisayi=ilksayi;
                    ilksayi="";
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(symbol==null){
                    symbol="/";
                    x=Double.parseDouble(ilksayi);
                    ilksayi=ilksayi+symbol;
                    ikincisayi=ilksayi;
                    ilksayi="";
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate("0");

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate("1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate("9");
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(symbol==null){
                    symbol="sin";

                }
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(symbol==null){
                    symbol="√";

                }
            }
        });
        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(symbol==null){
                    symbol="!";

                }
            }
        });
        yuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        parantez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(symbol==null){
                    symbol="^";

                }
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate(".");
            }
        });
        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate.setText("0");
                ilksayi="";
                symbol=null;
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void Results(){
        y=Double.parseDouble(ilksayi);

        if(symbol=="+"){
            z=x+y;
        }
        if(symbol=="-"){
            z=x-y;
        }
        if(symbol=="*"){
            z=x*y;
        }
        if(symbol=="/"){
            z=x/y;
        }
        if(symbol=="sin"){

            z=Math.sin(y);
        }
        if(symbol=="√"){

            z=Math.sqrt(y);
        }
        if(symbol=="^"){

            z=Math.pow(x,y);
        }
        if(z-Math.floor(z)==0){
            double v=Math.round(z);
            calculate.setText(""+z);
        }
            calculate.setText(""+z);
    }
    public void Calculate(String value){
        switch(value) {
            case "0":
                if(ilksayi=="")
                    return;
                ilksayi=ilksayi+value;
                break;
            case "1":
                ilksayi=ilksayi+value;
                break;
            case "2":
                ilksayi=ilksayi+value;
                break;
            case "3":
                ilksayi=ilksayi+value;
                break;
            case "4":
                ilksayi=ilksayi+value;
                break;
            case "5":
                ilksayi=ilksayi+value;
                break;
            case "6":
                ilksayi=ilksayi+value;
                break;
            case "7":
                ilksayi=ilksayi+value;
                break;
            case "8":
                ilksayi=ilksayi+value;
                break;
            case "9":
                ilksayi=ilksayi+value;
                break;
            case "sin":
                ilksayi=ilksayi+value;
                break;
            case "√":
                ilksayi=ilksayi+value;
                break;
            case "!":
                ilksayi=ilksayi+value;
                break;
            case "%":
                ilksayi=ilksayi+value;
                break;
            case "()":
                ilksayi=ilksayi+value;
                break;
            case "^":
                ilksayi=ilksayi+value;
                break;
            case ".":
                ilksayi=ilksayi+value;
                break;
        }
       calculate.setText(""+ilksayi);
    }
}
