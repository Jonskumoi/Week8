package com.example.myapplication;

import android.widget.TextView;

import java.util.ArrayList;

public class BottleDispenser {
    private  int bottles;
    private double moneys;

    private ArrayList<Bottle> bottle_list;
    private static BottleDispenser BD = null;

    public static BottleDispenser getInstance(){
        if(BD ==null){
            BD = new BottleDispenser();
        }
        return BD;
    }
    public BottleDispenser(){
        bottles = 6;
        moneys = 0;
        bottle_list = new ArrayList<Bottle>();

        for(int i = 0;i<bottles;i++){
            Bottle pullo = new Bottle();
            bottle_list.add(pullo);
        }
    }

    public void addMoney(TextView field){
        moneys += 1;
        field.setText("1 euro added!");
    }

    public void buyBottle(TextView field){
        if(bottles == 0){
            field.setText("Pullot loppu!");

        }
        else if(moneys < 1.8) {
            field.setText("Syötä lisää rahaa!");

        }
        else if(moneys >= 1.8 && bottles > 0) {
            field.setText("KLINKS KLUNKS *pullo tipahtaa*");
            bottles = bottles - 1;
            moneys = moneys -1.8;

        }


    }

    public void returnMoney(TextView field){
        if(moneys == 0) {
            field.setText("Ei ole rahaa!");
        }
        else {
            String raha = String.format("%.2f", moneys);
            field.setText(raha + "euroa palautettu!");
            moneys = 0;
        }



    }
}
