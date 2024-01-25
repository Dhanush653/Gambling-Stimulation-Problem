package com.bridgelabz.gamblingstimulation;

import java.util.Random;
public class Gambling {

    int Stack_Per_Day = 100;
    int Bet_Every_Game = 1;
    int Days = 20;


    public void wonorloss(){
        Random random = new Random();
        int Random_Win_Loss;
        int Probablity_Amount;
        for(int i =1;i<21;i++){
            Random_Win_Loss = random.nextInt(2);
            Probablity_Amount = random.nextInt(100);
            if(Random_Win_Loss == 1){

                System.out.println("Day "+i+": "+"Profit of "+Probablity_Amount);
            }
            else{
                System.out.println("Day "+i+": "+"Loss of "+Probablity_Amount);
            }

        }
    }

}
