/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameofthrees;

import java.util.Scanner;

/**
 *
 * @author Twee
 */
public class GameOfThrees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        String zero = " 0";
        String subtractOne = " -1";
        String addOne = " 1";
        
        System.out.print("Input a random large number: ");
        number = scan.nextInt();
        System.out.print("\n");

        while(number != 1) {
            if((number % 3) == 0) {
                System.out.println(number + zero);
                number = number / 3;
            }
            else if((number % 3) == 1) {
                System.out.println(number + subtractOne);
                number = (number - 1) / 3;
            }
            else if((number % 3) == 2){
                System.out.println(number + addOne);
                number = (number + 1) / 3;
            }
        }
        
        System.out.println("1");
    } 


}