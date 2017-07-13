package com.highfi.tennis.utils;

public enum AdvantageEnum {
	/**Default Value = no equality scores 40/40 between the 2 players*/
    ADV_NULL("NULL"),
    /**Player1 get  an Advantage and the other Player2 lose his advantage or not (=in case of when player2 just comes into scores equality for the first time 40/40 )*/
	ADV_KO("KO"),
    /**Player1 lose an Advantage when the other Player2 get an advantage, even if the player1 never get an advantage before*/
    ADV_OK("OK");

    private final String advantage;

    /**
     * @param advantage
     */
    private AdvantageEnum(final String advantage) {
        this.advantage = advantage;
    }

    @Override
    public String toString() {
        return advantage;
    }
    
    public static AdvantageEnum fromValue(final AdvantageEnum advantageEnum) {
        for (AdvantageEnum my: AdvantageEnum.values()) {
            if (my.advantage.equals(advantageEnum)) {
                return my;
            }
        }
        return null;
    }
}