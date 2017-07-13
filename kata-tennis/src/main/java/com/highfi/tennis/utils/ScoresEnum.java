package com.highfi.tennis.utils;

/**
 * Enum Representing SCORES OF TENNIS
 * 
 * @since Saturday 08 July 2017 AT 03h00 PM.
 * @author Mohamed ABARCHID
 */
public enum ScoresEnum {

        SCORE_00(0),
        SCORE_15(15),
        SCORE_30(30),
        SCORE_40(40);

        public final int value;

        ScoresEnum(final int newValue) {
            value = newValue;
        }

        public int getValue() { 
             return value; 
        }
        
        public static ScoresEnum fromValue(int value) {
            for (ScoresEnum my: ScoresEnum.values()) {
                if (my.value == value) {
                    return my;
                }
            }
            return null;
        }
}