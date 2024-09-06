import javax.swing.*;
public class App{
    public static void main(String[] args) throws Exception{
        int boardHeight = 600;
        int boardWidth = boardHeight;
        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Snakegame snakeGame = new Snakegame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();

       
    }
}