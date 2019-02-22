package com.iesemilidarder.mmarchel.core;

import com.iesemilidarder.mmarchel.core.data.Flights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataHelper {

    public static List<Flights> flight = new ArrayList<Flights>(Arrays.asList(

            new Flights ("1","Madrid","Palma",50.00,"AirEuropa"),
            new Flights ("2","Barcelona","Palma",35.00,"AirEuropa"),
            new Flights ("3","Varsovia","Palma",90.00,"Vueling"),
            new Flights ("4","NewZeland","Londres",450.00,"Emirates")));

    public static List<Flights> getAll(){

        return flight;
    }

    public static List<Flights> getId(String id){

        if (getId(id).equals(id)){
            return flight;
        }

        return null;
    }

}
