package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("employees.csv"));

        // String read = reader.readLine();

        reader.readLine();
        int i = 0;
        String[] x = reader.readLine().split("\\|");
        String [] operator = new String[4];
        //while (reader.readLine() !=null){

            for (String words : x){
                operator[i]=words;
                i++;
            }
            System.out.println(Arrays.toString(operator));

            int id = Integer.parseInt(operator[0]);
            String name = operator[1];
            double hoursWorked = Double.parseDouble(operator[2]);
            double payRate = Double.parseDouble(operator[3]);

            Employee employee = new Employee( id,name,hoursWorked, payRate);

      //  }





    }
}
