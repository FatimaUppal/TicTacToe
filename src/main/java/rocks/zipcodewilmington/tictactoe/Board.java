package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private static Character [][] matrix;
    public Board(Character[][] matrix) {
        this.matrix=matrix;
    }

    public Boolean isInFavorOfX() {
        return (checkHorizontal('X') || checkVertical('X') || checkDiagonal('X'));
    }

    public Boolean isInFavorOfO() {
        return (checkHorizontal('O') || checkVertical('O') || checkDiagonal('O'));
    }

    public Boolean isTie() {
        return ((!isInFavorOfX()) && (!isInFavorOfO()));
    }

    public String getWinner() {
        if (isInFavorOfO()) {
            return "O";
        }else if(isInFavorOfX()){
            return"X";
        }else{
            return "";
        }
    }

    public boolean checkDiagonal(char playing){
            return ((playing== matrix[0][0] && playing== matrix [1][1] && playing == matrix [2][2])
                    || (playing== matrix [0][2] && playing== matrix [1][1] && playing== matrix [2][0]));
        }
    public boolean checkHorizontal(char playing){
        return ((playing== matrix[0][0] && playing== matrix [0][1] && playing == matrix [0][2])
                || (playing== matrix [1][0] && playing== matrix [1][1] && playing== matrix [1][2])
                || (playing== matrix [2][0] && playing== matrix [2][1] && playing== matrix [2][2]));
    }
    public boolean checkVertical(char playing){
        return ((playing== matrix[0][0] && playing== matrix [1][0] && playing == matrix [2][0])
                || (playing== matrix [0][1] && playing== matrix [1][1] && playing== matrix [2][1])
                || (playing== matrix [0][2] && playing== matrix [1][2] && playing== matrix [2][2]));
    }
}


