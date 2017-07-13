package com.highfi.tennis.utils;

/**
 * Class containing constant variables used for displaying the results
 * 
 */
public class GameMessage {
	
	public final static String PLAYER_1 = "PLAYER1";
	public final static String PLAYER_2 = "PLAYER2";	
    public final static StringBuilder currentScrors    = new StringBuilder("(0-0)");
    public final static StringBuilder oldScors         = new StringBuilder();
    public final static StringBuilder gameStatus       = new StringBuilder("0-0");
    public final static StringBuilder matchStatus      = new StringBuilder("In progress");
    public final static String printPlayer1Name = "Player  1 : ";
    public final static String printPlayer2Name = "Player  2 : ";
    public final static String printScores      = "Score : ";
    public final static String printGames       = "Current game status : ";
    public final static String printStatus      = "Match Status : ";
    public final static String printRequest     = "Press key 'a' if Player 1 scrors or any other key if Player 2 scrors : ";
    
}
