import javax.swing.*;

public class GameFrame extends JFrame {

// Constructor
    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); //fits frame snugly around componenets.
        this.setVisible(true);
        this.setLocationRelativeTo(null);




    }
}
