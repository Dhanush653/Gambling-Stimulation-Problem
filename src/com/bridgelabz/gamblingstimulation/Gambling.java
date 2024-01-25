package com.bridgelabz.gamblingstimulation;

import java.util.Random;
public class Gambling {

    int Stack_Per_Day = 100;
    int Bet_Every_Game = 1;
    public void limit(){
        int No_Of_Stock = 40;
        int Maximum_Loose_limit = Stack_Per_Day/2;
        int Maximum_Win_limit = Stack_Per_Day + (50/100);
        if (No_Of_Stock>=Maximum_Loose_limit){
            System.out.println("Resign Gambling");
        }
        else if (No_Of_Stock <=Maximum_Win_limit) {
            System.out.println("Resign Gambling");
        }
        else{
            System.out.println("Continue Gambling");
        }

    }

}
