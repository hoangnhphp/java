package com.codegym;

public class TennisGame {

    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;
    private static final int ADVANTAGE_THRESHOLD = 4;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (isDeuce(player1Score, player2Score)) {
            return getEvenScore(player1Score);
        }
        else if (isAdvantageOrWin(player1Score, player2Score)) {
            return getAdvantageOrWin(player1Score, player2Score);
        }
        else {
            return getScoreDescription(player1Score, player2Score);
        }
    }

    /**
     * if two player's score is deuce
     * @param player1Score
     * @param player2Score
     * @return boolean
     */

    private static boolean isDeuce(int player1Score, int player2Score) {
        return player1Score == player2Score;
    }

    /**
     * if one player is advantage or win
     * @param player1Score
     * @param player2Score
     * @return boolean
     */

    private static boolean isAdvantageOrWin(int player1Score, int player2Score) {
        return player1Score >= ADVANTAGE_THRESHOLD || player2Score >= ADVANTAGE_THRESHOLD;
    }

    /**
     * Get event score
     * @param int player1Score
     * @param StringBuilder score
     *
     * @return score
     */
    private static String getEvenScore(int player1Score) {
        String score = new String();
        switch (player1Score)
        {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FORTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return "Score: " + player1Score + " - " + player1Score + "\n" + score;
    }

    /**
     * Get advantage or win
     * @param int player1Score
     * @param int player2Score
     * @param StringBuilder score
     *
     * @return score
     */
    private static String getAdvantageOrWin(int player1Score, int player2Score) {
        String score = new String();
        int minusResult = player1Score-player2Score;
        if (minusResult==1) score = "Advantage player1";
        else if (minusResult ==-1) score = "Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score = "Win for player2";

        return "Score: " + player1Score + " - " + player2Score + "\n" + score;
    }

    /**
     * Get Score Description
     * @param int player1Score
     * @param int player2Score
     * @param StringBuilder score
     *
     * @return score
     */
    private static String getScoreDescription(int player1Score, int player2Score) {
        String score = new String();
        int tempScore = 0;
        for (int i=1; i<3; i++) {
            if (i==1) tempScore = player1Score;
            else {
                score += "-"; tempScore = player2Score;
            }
            switch(tempScore) {
                case LOVE:
                    score += "Love";
                    break;
                case FIFTEEN:
                    score += "Fifteen";
                    break;
                case THIRTY:
                    score += "Thirty";
                    break;
                case FORTY:
                    score += "Forty";
                    break;
            }
        }

        return "Score: " + player1Score + " - " + player2Score + "\n" + score;
    }
}