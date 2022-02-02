package com.bridgelabzsnakeladdergame;

public class SnakeLadder {
//    Declaring Variables for Players Position
    int playerPosition = 0;

    //Method to Show Player Current Position
    public void showPosition() {
        //Displaying Player Position
        System.out.println("Player Starting Position = " + playerPosition);
    }
    //Method to Roll the Die and Get No between 1 to 6
    public int rollDie() {
        int dieNo = (int) Math.floor(Math.random() * 10)%6+1;
        return dieNo;
    };
    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome to Snake and Ladder Simulation ab Abhilash ");

        //Creating Object for Player
        SnakeLadder player1 = new SnakeLadder();

        //Showing Player Position
        player1.showPosition();

        //Show Die Rolling No
        System.out.println("Die Number for Player : "+ player1.rollDie());
    }
}
