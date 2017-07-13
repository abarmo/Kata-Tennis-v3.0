package com.highfi.tennis.services;

import com.highfi.tennis.player.Player;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

public class GameServiceTest {
    private GameService gameService;
    private List<Player> playerList = new ArrayList<>();

    @Before
    public void initTest(){
        this.gameService = new GameServiceImpl();
        Player player1 = new Player();
        Player player2 = new Player();
        playerList.add(player1);
        playerList.add(player2);
    }

    @Test
    public  void testInitScores(){

       gameService.initGame(playerList);
        Assert.assertFalse(playerList.stream().findFirst().get().isWins());

    }
}