package com.fizzbuzz;

import java.util.Scanner;

/*
 * Para saber se um número X é múltiplo de um
 * outro número Y, basta dividir X por Y e ver
 * se o RESTO da divisão é 0. Se for 0, X é 
 * múltiplo de Y. Se não for, X não é múltplo de Y.
 */

public class Main {
    public static void main(String[] args) {

        //VARIÁVEIS
        int num, mThree, mFive;

        //OBJETO
        Scanner reader = new Scanner (System.in);

        System.out.println("Digite um numero");

        //INPUT 
        num = reader.nextInt();

        for(int i=0; i<=num; i++){
            mThree = i%3;
            mFive = i%5;
            if(mThree == 0 && mFive == 0 ){
                //OUTPUT
                System.out.println("FizzBuzz");
            }

            if(mThree == 0 && mFive != 0){
                //OUTPUT
                System.out.println("Fizz");

            }

            if(mFive == 0 && mThree != 0){
                //OUTPUT
                System.out.println("Buzz");

            }

            if(mThree != 0 && mFive != 0){
                //OUTPUT
                System.out.println(i);

            }
        }
    }
}