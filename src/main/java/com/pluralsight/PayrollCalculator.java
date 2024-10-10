package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class PayrollCalculator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("employees.csv"));
        reader.readLine();
        String input;

        while ((input = reader.readLine()) !=null){
            String[] x = input.split("\\|");
            int id = Integer.parseInt(x[0]);
            String name = x[1];
            double hoursWorked = Double.parseDouble(x[2]);
            double payRate = Double.parseDouble(x[3]);
            Employee employee = new Employee( id,name,hoursWorked, payRate);
            displayEmployee(employee);
        }
        reader.close();

    }
    private static void displayEmployee(Employee employee){
        System.out.printf("%d:%s Pay this period: %.2f\n", employee.getEmployeeId(), employee.getName(),+employee.getGrossPay());
    }
}
/*
            String [] operator = new String[5];
            for (String words : x){
                operator[i]=words;
                i++;
            }*/