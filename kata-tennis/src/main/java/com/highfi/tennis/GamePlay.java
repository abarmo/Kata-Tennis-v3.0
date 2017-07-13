package com.highfi.tennis;

import com.highfi.tennis.player.Player;
import com.highfi.tennis.services.GameService;
import com.highfi.tennis.services.GameServiceImpl;
import com.highfi.tennis.utils.GameMessage;
import com.highfi.tennis.utils.GamePlayerPosition;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * The main class containing the main method  of KATA TENNIS
 * 
 * Last  @Version : V3.0
 * Other @Version : V1.1, V1.2, V2.0
 * 
 * @since Saturday 08 July 2017 AT 03h00 PM.
 * @author Mohamed ABARCHID
 * @param args
 * @throws Exception
 */
public class GamePlay {
	
	/**
	 * Main method to run the program
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		Boolean isNotGameOver = Boolean.TRUE;
		/** From here. We decided to fix Player 1 is in the first  Position. */
		Player player1 = new Player(GamePlayerPosition.FIRST_POSITION);
		/** From here. We decided to fix Player 2 is in the second Position. */
		Player player2 = new Player(GamePlayerPosition.SECONDE_POSITION);
		/** Player1 is the name of the first  Player.*/
		player1.setName(GameMessage.PLAYER_1);
		/** Player2 is the name of the second Player. */
		player2.setName(GameMessage.PLAYER_2);
		
		/** Object LIST used to fix the order of the tow players already created above */
		final List<Player> listPlayers = new ArrayList<>();
		listPlayers.add(player1);
		listPlayers.add(player2);
		

		/**
		 * FROM HERE A TENNIS MATCHE IS LAUNCHED/RUNNING
		 */
		GameService gameService = new GameServiceImpl();

		try {
			BufferedReader userKey = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("------------START----------");
			while (isNotGameOver) {

				System.out.println(new StringBuilder(GameMessage.printPlayer1Name).append(player1.getName()));
				System.out.println(new StringBuilder(GameMessage.printPlayer2Name).append(player2.getName()));
				System.out.println(new StringBuilder(GameMessage.printScores).append(gameService.displayOldScores()).append(gameService.displayCurrentScores()));
				System.out.println(new StringBuilder(GameMessage.printGames).append(GameMessage.gameStatus));
				System.out.println(new StringBuilder(GameMessage.printStatus).append(GameMessage.matchStatus));
				
	        	if(gameService.isGameOver(listPlayers)) {
	    			System.out.println("-------------END----------");
	        		return;
	        	}
	        	
	        	System.out.println(new StringBuilder(GameMessage.printRequest));
                /** Response of the user launching the program */
                String inputedResult = userKey.readLine();
                gameService.determineScoreWinnerAndScoreLooser(listPlayers, inputedResult);
	        	GamePlayerPosition winnerPosition = gameService.getWinnerPosition(listPlayers);
	        	GamePlayerPosition looserPosition = gameService.getLooserPosition(listPlayers);

	        	gameService.updateMatchState(listPlayers, winnerPosition.getFixedPosition(), looserPosition.getFixedPosition());
				System.out.println("\n\n\n\n\n");
			}
		} catch (Exception e) {
			throw new Exception(e);// TASK TODO : Implement TechnicalExceptions Later.
		}	 
	}
}