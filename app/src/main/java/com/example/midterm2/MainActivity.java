package com.example.midterm2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String ran(){
        String Char;
        final int random = new Random().nextInt(3);

        if(random == 0)
            Char = "W";
        else if(random == 1)
            Char = "L";
        else
            Char = "N";

        return  Char;
    }
    int Coins = 100;
    public void  onClick(View v){


        TextView Coin = (TextView)findViewById(R.id.CoinCount);

        TextView one = (TextView)findViewById(R.id.erti);
        String first = ran();
        one.setText(first);


        TextView two = (TextView)findViewById(R.id.ori);
        String second = ran();
        two.setText(second);

        TextView three = (TextView)findViewById(R.id.sami);
        String third = ran();
        three.setText(third);

        TextView four = (TextView)findViewById(R.id.otxi);
        String fourth = ran();
        four.setText(fourth);

        TextView five = (TextView)findViewById(R.id.xuti);
        String fiveth = ran();
        five.setText(fiveth);

        TextView six = (TextView)findViewById(R.id.eqvsi);
        String sixth = ran();
        six.setText(sixth);

        TextView seven = (TextView)findViewById(R.id.shvidi);
        String seventh = ran();
        seven.setText(seventh);

        TextView eight = (TextView)findViewById(R.id.rva);
        String eightth = ran();
        eight.setText(eightth);

        TextView nine = (TextView)findViewById(R.id.cxra);
        String nineth = ran();
        nine.setText(nineth);



        EditText number = findViewById(R.id.editText);
        String num =  number.getText().toString();
        int finalValue=Integer.parseInt(num);

        if(finalValue == 1){
            if(first == "W") {
                Coins = Coins + 5;
                if(second == "W")
                    Coins = Coins + 5;
                if(fourth == "W")
                    Coins = Coins + 5;
            }
            else if(first == "L") {
                Coins = Coins - 5;
                if(second == "L")
                    Coins = Coins - 5;
                if(fourth == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else if(finalValue == 2){
            if(second == "W"){
                Coins = Coins + 5;
                if(first == "W")
                    Coins = Coins + 5;
                if(third == "W")
                    Coins = Coins + 5;
                if(fiveth == "W")
                    Coins = Coins + 5;
            }

            else if(second == "L"){
                Coins = Coins - 5;
                if(first == "L")
                    Coins = Coins - 5;
                if(third == "L")
                    Coins = Coins - 5;
                if(fiveth == "L")
                    Coins = Coins - 5;
            }

            else
                Coins = Coins - 1;

        }else if(finalValue == 3){
            if(third == "W"){
                Coins = Coins + 5;
                if(second == "W")
                    Coins = Coins + 5;
                if(sixth == "W")
                    Coins = Coins + 5;
            }

            else if(third == "L"){
                Coins = Coins - 5;
                if(second == "L")
                    Coins = Coins - 5;
                if(sixth == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else if(finalValue == 4){
            if(fourth == "W") {
                Coins = Coins + 5;
                if(first == "W")
                    Coins = Coins + 5;
                if(fiveth == "W")
                    Coins = Coins + 5;
                if(seventh == "W")
                    Coins = Coins + 5;
            }
            else if(fourth == "L"){
                Coins = Coins - 5;
                if(first == "L")
                    Coins = Coins - 5;
                if(fiveth == "L")
                    Coins = Coins - 5;
                if(seventh == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else if(finalValue == 5){
            if(fiveth == "W"){
                Coins = Coins + 5;
                if(second == "W")
                    Coins = Coins + 5;
                if(fourth == "W")
                    Coins = Coins + 5;
                if(sixth == "W")
                    Coins = Coins + 5;
                if(eightth == "W")
                    Coins = Coins + 5;
            }
            else if(fiveth == "L"){
                Coins = Coins - 5;
                if(second == "L")
                    Coins = Coins - 5;
                if(fourth == "L")
                    Coins = Coins - 5;
                if(sixth == "L")
                    Coins = Coins - 5;
                if(eightth == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else if(finalValue == 6){
            if(sixth == "W"){
                Coins = Coins + 5;
                if(third == "W")
                    Coins = Coins + 5;
                if(fiveth == "W")
                    Coins = Coins + 5;
                if(nineth == "W")
                    Coins = Coins + 5;
            }
            else if(sixth == "L"){
                Coins = Coins - 5;
                if(third == "L")
                    Coins = Coins - 5;
                if(fiveth == "L")
                    Coins = Coins - 5;
                if(nineth == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else if(finalValue == 7){
            if(seventh == "W"){
                Coins = Coins + 5;
                if(fourth == "W")
                    Coins = Coins + 5;
                if(eightth == "W")
                    Coins = Coins + 5;
            }
            else if(seventh == "L"){
                Coins = Coins - 5;
                if(fourth == "L")
                    Coins = Coins - 5;
                if(eightth == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else if(finalValue == 8){
            if(eightth == "W"){
                Coins = Coins + 5;
                if(seventh == "W")
                    Coins = Coins + 5;
                if(fiveth == "W")
                    Coins = Coins + 5;
                if(nineth == "W")
                    Coins = Coins + 5;
            }
            else if(eightth == "L"){
                Coins = Coins - 5;
                if(seventh == "L")
                    Coins = Coins - 5;
                if(fiveth == "L")
                    Coins = Coins - 5;
                if(nineth == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else if(finalValue == 9){
            if(nineth == "W"){
                Coins = Coins + 5;
                if(sixth == "W")
                    Coins = Coins + 5;
                if(eightth == "W")
                    Coins = Coins + 5;
            }
            else if(nineth == "L"){
                Coins = Coins - 5;
                if(eightth == "L")
                    Coins = Coins - 5;
                if(sixth == "L")
                    Coins = Coins - 5;
            }
            else
                Coins = Coins - 1;

        }else
            return;

        Coin.setText(Integer.toString(Coins));






    }
}