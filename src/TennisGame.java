public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore=0;
        if (player1Score==player2Score)
        {
            score = haveEqualScore(player1Score);
        }
        else if (player1Score>=4 || player2Score>=4)
        {
            score = scoreIs4AndOver(player1Score, player2Score);
        }
        else
        {
            score = otherCase(player1Score, player2Score, score);
        }
        return score;
    }

    private static String otherCase(int player1Score, int player2Score, String score) {
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = player1Score;
            else { score+="-"; tempScore = player2Score;}
            switch(tempScore)
            {
                case 0:
                    score+="Love";
                    break;
                case 1:
                    score+="Fifteen";
                    break;
                case 2:
                    score+="Thirty";
                    break;
                case 3:
                    score+="Forty";
                    break;
            }
        }
        return score;
    }

    private static String scoreIs4AndOver(int player1Score, int player2Score) {
        String score;
        int minusResult = player1Score-player2Score;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static String haveEqualScore(int player1Score) {
        String score;
        switch (player1Score)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}