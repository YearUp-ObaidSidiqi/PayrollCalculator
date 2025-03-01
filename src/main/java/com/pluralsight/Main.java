package com.pluralsight;

import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {


        // create a FileReader object connected to the File
        FileReader fileReader = new FileReader("employees.csv");
        // create a BufferedReader to manage input stream
        BufferedReader bufReader = new BufferedReader(fileReader);
        bufReader.readLine();
        String input;

        BufferedWriter bw = new BufferedWriter( new FileWriter("payroll-oct-2024.txt"));

        bw.write("id|name|gross pay\n");

        // read until there is no more data

        while((input = bufReader.readLine()) != null) {
            String[] tokens = input.split(Pattern.quote("|"));

            int employeeId = Integer.parseInt(tokens[0]);
            String name = tokens[1];
            float hoursWorked = Float.parseFloat(tokens[2]);
            double payRate = Double.parseDouble(tokens[3]);

            Employee theEmp = new Employee(employeeId, name, hoursWorked, payRate);
            displayEmployee(theEmp);

            String outputData = theEmp.getEmployeeId() + "|" + theEmp.getName() + "|" + theEmp.getGrossPay() + "\n";
            bw.write(outputData);

        }
        // close the stream and release the resources
        bufReader.close();
        bw.close();

    }


    private static void displayEmployee(Employee e){
        System.out.printf("%d:%s Pay this period: %.2f\n", e.getEmployeeId(), e.getName(), e.getGrossPay());
    }
}