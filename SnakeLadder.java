package com.bridgelabzsnakeladdergame;

import java.util.Random;

public class SnakeLadder {
    //Constants
    public static final int IS_NO_PLAY = 0;
    public static final int IS_LADDER = 1;
    public static final int IS_SNAKE = 2;

//    Declaring Variables for Players Position
    int playerPosition = 0;
    int newPosition = 0;

    // Random Class Object for Generating Random Numbers
    Random randomNo = new Random();
    //Method to Show Player Current Position
    public void showPosition() {
        //Displaying Player Position

        System.out.println("Player Starting Position = " + playerPosition);
    }

    //Method to Roll the Die and Get No between 1 to 6
    public int rollDie() {
        int dieNo = (int) Math.floor(Math.random() * 10)%6+1;
        return dieNo;
    }

    //Method to Check for Option
    public  void optionPlay(int dieNo) {

        int optionNo = randomNo.nextInt(3)+1;
        System.out.println("Option No : "+ optionNo);
        switch (optionNo) {
            case IS_NO_PLAY:
                System.out.println("Player got NO PLAY");
                newPosition = 0;
                break;
            case IS_LADDER:
                System.out.println("Yahoo!!! Player got LADDER");
                playerPosition = dieNo +  playerPosition ;
                break;
            case IS_SNAKE:
                System.out.println("OOPS!!! Player got SNAKE");
                playerPosition = dieNo -  playerPosition;
                if (playerPosition < 0) {
                    playerPosition = 0;
                }
                break;
        }

        }


    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome to Snake and Ladder Simulation by Abhilash ");

        //Creating Object for Player
        SnakeLadder player1 = new SnakeLadder();

        //Showing Player Position
        player1.showPosition();

        //Show Die Rolling No
        System.out.println("Die Number for Player : "+ player1.rollDie());
        int dieNo = player1.rollDie();
        System.out.println("Die Number for Player : "+ dieNo);

        //Player going for Options
        player1.optionPlay(dieNo);
        player1.showPosition();
    }
}
