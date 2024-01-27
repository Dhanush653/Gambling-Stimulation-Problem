package com.bridgelabz.gamblingstimulation;

import java.util.Random;
public class Gambling
{

    private int Stack_Per_Day = 100;
    private int Bet_Every_Game = 1;
    private int Days = 20;


    public void wonorloss()
    {
        Random random = new Random();
        int Random_Win_Loss;
        int Probablity_Amount;
        int Max_profit = 0;
        int Max_loss = 0;
        int Day_max_profit = 0;
        int Day_max_loss = 0;
        for(int i =1;i<=Days;i++){
            Random_Win_Loss = random.nextInt(2);
            Probablity_Amount = random.nextInt(Stack_Per_Day);
            if(Random_Win_Loss == 1){
                if(Max_profit < Probablity_Amount){
                    Max_profit = Probablity_Amount;
                    Day_max_profit = i;
                }
            }
            else{
                if(Max_loss < Probablity_Amount){
                    Max_loss= Probablity_Amount;
                    Day_max_loss = i;
            }
            }
        }
        System.out.println("Maximum Profit of "+Max_profit+" On Day: "+Day_max_profit);
        System.out.println("Maximum Loss of "+Max_loss+" On Day: "+Day_max_loss);
    }

}