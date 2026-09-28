/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicsreport;
import java.util.*;

/**
 *
 * @author ST10511987 group 6 Neo Mathipa Question 1
 */
public class ElectronicsReport {

    public static void main(String[] args) {
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH","PRETORIA"};
        int[][] numOfSales = {{1000, 2000, 3000},
                              {2000, 3000, 4000},
                              {1500, 1100, 1200}};
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------------------------");
        for(int row = 0; row < numOfSales.length; row++){
            System.out.printf("%-15s %8d %8d %8d %n",
                                  cities[row],
                                  numOfSales[row][0],
                                  numOfSales[row][1],
                                  numOfSales[row][2]);
        }
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("CONSOLE SALES FOR EACH CITY");
        System.out.println("----------------------------------------------------------------");
        
        for(int row = 0; row < numOfSales.length; row++){
        int citySum = 0;
        for(int column = 0; column < numOfSales[row].length; column++){
            citySum += numOfSales[row][column]; 
        }
        System.out.printf("%-15s %8d %n",
                             cities[row],
                             citySum);
        }
        
        int mostSales = -1;
        String topCity = "";
        for(int i = 0; i < cities.length; i++){
        int total = 0;
        for (int j = 0; j < numOfSales[i].length; j++){
        total += numOfSales[i][j];
        }
        if(total > mostSales){
        mostSales = total;
        topCity = cities[i];
        }
        }
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("----------------------------------------------------------------");
    }
}
