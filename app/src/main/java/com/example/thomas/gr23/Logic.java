package com.example.thomas.gr23;

import java.util.ArrayList;

public class Logic {

    ArrayList<Opskrift> opskrifter = new ArrayList<>();



    public void add(Opskrift opskrift){

        opskrifter.add(opskrift);

    }

    int getBillede(int id) {
        if (id == 0){
            return R.drawable.yarn;
        }
        if(id == 1){}


    }

}
