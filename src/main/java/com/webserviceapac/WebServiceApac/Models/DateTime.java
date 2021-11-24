package com.webserviceapac.WebServiceApac.Models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String [] args){

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

        LocalDate date = LocalDate.parse("11/27/2020 05:35:00", inputFormat);

        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(date.format(outputFormat));




    }





}
