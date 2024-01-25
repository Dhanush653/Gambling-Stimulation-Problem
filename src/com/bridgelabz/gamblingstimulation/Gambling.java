package com.bridgelabz.gamblingstimulation;

import java.util.Random;
public class Gambling {

    int Stack_Per_Day = 100;
    int Bet_Every_Game = 1;

    public void probablity(){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1){
            System.out.println("The Gambler Won the Stack");
        }
        else{
            System.out.println("The Gambler Lose The Stack");
        }
    }

}
