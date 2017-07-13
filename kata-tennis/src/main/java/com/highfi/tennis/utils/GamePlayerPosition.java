package com.highfi.tennis.utils;

/**
 * Enum Representing the fixed position of 2 Players
 * @since Wednesday 12 July 2017 AT 11h00 PM.
 * @author Mohamed ABARCHID
 */
public enum GamePlayerPosition {

    FIRST_POSITION(0),
    SECONDE_POSITION(1);

    private final int position;

    GamePlayerPosition(final int position) {
    	this.position = position;
    }

    public int getFixedPosition() { 
         return position; 
    }
    
    public static GamePlayerPosition fromValue(final int position) {
        for (GamePlayerPosition my: GamePlayerPosition.values()) {
            if (my.position == position) {
                return my;
            }
        }
        return null;
    }
}