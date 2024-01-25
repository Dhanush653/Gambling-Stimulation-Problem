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
        int Total_Amound_Win = 0;
        int Total_Amount_Loss = 0;
        for(int i =1;i<=Days;i++){
            Random_Win_Loss = random.nextInt(2);
            Probablity_Amount = random.nextInt(Stack_Per_Day);
            if(Random_Win_Loss == 1){
                Total_Amound_Win += Probablity_Amount;
            }
            else{
                Total_Amount_Loss += Probablity_Amount;
            }

        }
        int Total_amount = (Total_Amound_Win-Total_Amount_Loss);
        if(Total_amount > 0){
            System.out.println("The Total Profit is " + Total_amount);
        }
        else{
            System.out.println("The Total Loss is " + Total_amount);
        }
    }

}