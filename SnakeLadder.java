package com.bridgelabzsnakeladdergame;

public class SnakeLadder {
//    Declaring Variables for Players Position
    int playerPosition = 0;

    //Method to Show Player Current Position
    private void showPosition() {
        //Displaying Player Position
        System.out.println("Player Starting Position = " + playerPosition);
    }

    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome to Snake and Ladder Simulation ab Abhilash ");

        //Creating Object for Player
        SnakeLadder player1 = new SnakeLadder();

        //Showing Player Position
        player1.showPosition();
    }
}
