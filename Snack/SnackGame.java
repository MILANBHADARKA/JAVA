import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;


public class SnackGame extends Canvas implements ActionListener, KeyListener {

    private class Tile {
        int x;
        int y;

        Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int boardwidth;
    int boardheight;
    int tilesize = 25; // size of each tile in the game board
    int velocityX;
    int velocityY;
    boolean gameOver = false;

    // snack
    Tile snackHead;
    ArrayList<Tile> snackBody;

    // food
    Tile food;
    Random random;

    // game Logic
    Timer gameLoop;

    SnackGame(int boardwidth, int boardheight) {
        this.boardwidth = boardwidth;
        this.boardheight = boardheight;

        setSize(boardwidth, boardheight);
        setBackground(Color.BLACK);
        addKeyListener(this);
        setFocusable(true);

        snackHead = new Tile(5, 5);
        snackBody = new ArrayList<Tile>();

        food = new Tile(10, 10);
        random = new Random();
        placefood();

        velocityX = 0;
        velocityY = 0;

        gameLoop = new Timer(100, this);
        gameLoop.start();
    }

    @Override
    public void paint(Graphics g) {
        draw(g);
    }

    public void draw(Graphics g) {
        // grid

        // for(int i= 0 ; i< boardwidth/tilesize; i++){
        // g.drawLine(i*tilesize, 0, i*tilesize, boardheight); //drawLine(int x1, int y1, int x2, int y2) is a method of the Graphics class. It is used to draw a line between the points (x1, y1) and (x2, y2). The line is drawn using the current color of the graphics context.
        // g.drawLine(0,i*tilesize, boardwidth, i*tilesize);
        // }

        // Food
        g.setColor(Color.RED);
        // g.fillRect(food.x * tilesize, food.y * tilesize, tilesize, tilesize);
        g.fill3DRect(food.x * tilesize, food.y * tilesize, tilesize, tilesize, true);

        // draw the snack head
        g.setColor(Color.GREEN);
        // g.fillRect(snackHead.x * tilesize, snackHead.y * tilesize, tilesize, tilesize);
        g.fill3DRect(snackHead.x * tilesize, snackHead.y * tilesize, tilesize, tilesize, true);

        // snack body
        for (int i = 0; i < snackBody.size(); i++) {
            Tile snackPart = snackBody.get(i);
            // g.fillRect(snackPart.x * tilesize, snackPart.y * tilesize, tilesize, tilesize);
            g.fill3DRect(snackPart.x * tilesize, snackPart.y * tilesize, tilesize, tilesize, true);
        }

        // score
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        if (gameOver) {
            g.setColor(Color.RED);
            g.drawString("Game Over: " + String.valueOf(snackBody.size()), tilesize - 16, tilesize);
        } else {
            g.setColor(Color.WHITE);
            g.drawString("Score: " + String.valueOf(snackBody.size()), tilesize - 16, tilesize);
        }
    }

    public void placefood() {
        food.x = random.nextInt(boardwidth / tilesize); // nextInt(int bound) is a method of the Random class. It is used to generate a random integer between 0 (inclusive) and the specified bound (exclusive). In this case, 600/25 = 24. So, the food will be placed at a random x-coordinate between 0 and 24.
        food.y = random.nextInt(boardheight / tilesize);
    }

    public boolean collision(Tile tile1, Tile tile2) {
        return tile1.x == tile2.x && tile1.y == tile2.y;
    }

    public void move() {
        // Move the snack body
        for (int i = snackBody.size() - 1; i > 0; i--) {
            Tile prevSnackPart = snackBody.get(i - 1);
            Tile snackPart = snackBody.get(i);
            snackPart.x = prevSnackPart.x;
            snackPart.y = prevSnackPart.y;
        }

        // Move the first body part to the head's previous position
        if (!snackBody.isEmpty()) {
            Tile firstBodyPart = snackBody.get(0);
            firstBodyPart.x = snackHead.x;
            firstBodyPart.y = snackHead.y;
        }

        // Update the snack head position
        snackHead.x += velocityX;
        snackHead.y += velocityY;

        // game oVer
        for (int i = 0; i < snackBody.size(); i++) {
            Tile snackPart = snackBody.get(i);
            if (collision(snackHead, snackPart)) {
                gameOver = true;
            }
        }
        if (snackHead.x * tilesize < 0 || snackHead.x * tilesize > boardwidth || snackHead.y * tilesize < 0
                || snackHead.y * tilesize >= boardheight) {
            gameOver = true;
        }

        // Eat food
        if (collision(snackHead, food)) {
            snackBody.add(new Tile(food.x, food.y));
            placefood();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            move();
            repaint();
        } else {
            gameLoop.stop();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP && velocityY != 1) {
            velocityX = 0;
            velocityY = -1;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && velocityY != -1) {
            velocityX = 0;
            velocityY = 1;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && velocityX != 1) {
            velocityX = -1;
            velocityY = 0;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && velocityX != -1) {
            velocityX = 1;
            velocityY = 0;
        }

        if (gameOver) {
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                gameOver = false;
                snackHead = new Tile(5, 5);
                snackBody.clear();
                velocityX = 0;
                velocityY = 0;
                placefood();
                gameLoop.start();
            }
        }

    }

    // not need
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] args) {
        Frame frame = new Frame("Snack Game");
        SnackGame game = new SnackGame(600, 600);
        frame.add(game);
        frame.pack();
        frame.setSize(600, 600);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}







// import java.awt.*;
// import java.awt.event.*;
// import java.util.ArrayList;
// import java.util.Random;
// import java.util.Timer;
// import java.util.TimerTask;

// public class SnackGame extends Canvas implements KeyListener {

//     private class Tile {
//         int x;
//         int y;

//         Tile(int x, int y) {
//             this.x = x;
//             this.y = y;
//         }
//     }

//     int boardwidth;
//     int boardheight;
//     int tilesize = 25; // size of each tile in the game board
//     int velocityX;
//     int velocityY;
//     boolean gameOver = false;

//     // snack
//     Tile snackHead;
//     ArrayList<Tile> snackBody;

//     // food
//     Tile food;
//     Random random;

//     // game Logic
//     Timer gameLoop;

//     SnackGame(int boardwidth, int boardheight) {
//         this.boardwidth = boardwidth;
//         this.boardheight = boardheight;

//         setSize(boardwidth, boardheight);
//         setBackground(Color.BLACK);
//         addKeyListener(this);
//         setFocusable(true);

//         snackHead = new Tile(5, 5);
//         snackBody = new ArrayList<Tile>();

//         food = new Tile(10, 10);
//         random = new Random();
//         placefood();

//         velocityX = 0;
//         velocityY = 0;

//         gameLoop = new Timer();
//         gameLoop.scheduleAtFixedRate(new TimerTask() {
//             @Override
//             public void run() {
//                 if (!gameOver) {
//                     move();
//                     repaint();
//                 } else {
//                     gameLoop.cancel();
//                 }
//             }
//         }, 0, 100);
//     }

//     @Override
//     public void paint(Graphics g) {
//         draw(g);
//     }

//     public void draw(Graphics g) {
//         // grid

//         // for(int i= 0 ; i< boardwidth/tilesize; i++){
//         // g.drawLine(i*tilesize, 0, i*tilesize, boardheight); //drawLine(int x1, int y1, int x2, int y2) is a method of the Graphics class. It is used to draw a line between the points (x1, y1) and (x2, y2). The line is drawn using the current color of the graphics context.
//         // g.drawLine(0,i*tilesize, boardwidth, i*tilesize);
//         // }

//         // Food
//         g.setColor(Color.RED);
//         // g.fillRect(food.x * tilesize, food.y * tilesize, tilesize, tilesize);
//         g.fill3DRect(food.x * tilesize, food.y * tilesize, tilesize, tilesize, true);

//         // draw the snack head
//         g.setColor(Color.GREEN);
//         // g.fillRect(snackHead.x * tilesize, snackHead.y * tilesize, tilesize, tilesize);
//         g.fill3DRect(snackHead.x * tilesize, snackHead.y * tilesize, tilesize, tilesize, true);

//         // snack body
//         for (int i = 0; i < snackBody.size(); i++) {
//             Tile snackPart = snackBody.get(i);
//             // g.fillRect(snackPart.x * tilesize, snackPart.y * tilesize, tilesize, tilesize);
//             g.fill3DRect(snackPart.x * tilesize, snackPart.y * tilesize, tilesize, tilesize, true);
//         }

//         // score
//         g.setFont(new Font("Arial", Font.PLAIN, 16));
//         if (gameOver) {
//             g.setColor(Color.RED);
//             g.drawString("Game Over: " + String.valueOf(snackBody.size()), tilesize - 16, tilesize);
//         } else {
//             g.setColor(Color.WHITE);
//             g.drawString("Score: " + String.valueOf(snackBody.size()), tilesize - 16, tilesize);
//         }
//     }

//     public void placefood() {
//         food.x = random.nextInt(boardwidth / tilesize); // nextInt(int bound) is a method of the Random class. It is used to generate a random integer between 0 (inclusive) and the specified bound (exclusive). In this case, 600/25 = 24. So, the food will be placed at a random x-coordinate between 0 and 24.
//         food.y = random.nextInt(boardheight / tilesize);
//     }

//     public boolean collision(Tile tile1, Tile tile2) {
//         return tile1.x == tile2.x && tile1.y == tile2.y;
//     }

//     public void move() {
//         // Move the snack body
//         for (int i = snackBody.size() - 1; i > 0; i--) {
//             Tile prevSnackPart = snackBody.get(i - 1);
//             Tile snackPart = snackBody.get(i);
//             snackPart.x = prevSnackPart.x;
//             snackPart.y = prevSnackPart.y;
//         }

//         // Move the first body part to the head's previous position
//         if (!snackBody.isEmpty()) {
//             Tile firstBodyPart = snackBody.get(0);
//             firstBodyPart.x = snackHead.x;
//             firstBodyPart.y = snackHead.y;
//         }

//         // Update the snack head position
//         snackHead.x += velocityX;
//         snackHead.y += velocityY;

//         // game oVer
//         for (int i = 0; i < snackBody.size(); i++) {
//             Tile snackPart = snackBody.get(i);
//             if (collision(snackHead, snackPart)) {
//                 gameOver = true;
//             }
//         }
//         if (snackHead.x * tilesize < 0 || snackHead.x * tilesize > boardwidth || snackHead.y * tilesize < 0
//                 || snackHead.y * tilesize >= boardheight) {
//             gameOver = true;
//         }

//         // Eat food
//         if (collision(snackHead, food)) {
//             snackBody.add(new Tile(food.x, food.y));
//             placefood();
//         }

//     }

//     @Override
//     public void keyPressed(KeyEvent e) {
//         if (e.getKeyCode() == KeyEvent.VK_UP && velocityY != 1) {
//             velocityX = 0;
//             velocityY = -1;
//         } else if (e.getKeyCode() == KeyEvent.VK_DOWN && velocityY != -1) {
//             velocityX = 0;
//             velocityY = 1;
//         } else if (e.getKeyCode() == KeyEvent.VK_LEFT && velocityX != 1) {
//             velocityX = -1;
//             velocityY = 0;
//         } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && velocityX != -1) {
//             velocityX = 1;
//             velocityY = 0;
//         }

//         if (gameOver) {
//             if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//                 gameOver = false;
//                 snackHead = new Tile(5, 5);
//                 snackBody.clear();
//                 velocityX = 0;
//                 velocityY = 0;
//                 placefood();
//                 gameLoop = new Timer();
//                 gameLoop.scheduleAtFixedRate(new TimerTask() {
//                     @Override
//                     public void run() {
//                         if (!gameOver) {
//                             move();
//                             repaint();
//                         } else {
//                             gameLoop.cancel();
//                         }
//                     }
//                 }, 0, 100);
//             }
//         }

//     }

//     // not need
//     @Override
//     public void keyTyped(KeyEvent e) {

//     }

//     @Override
//     public void keyReleased(KeyEvent e) {

//     }

//     public static void main(String[] args) {
//         Frame frame = new Frame("Snack Game");
//         SnackGame game = new SnackGame(600, 600);
//         frame.add(game);
//         frame.pack();
//         frame.setSize(600, 600);
//         frame.addWindowListener(new WindowAdapter() {
//             public void windowClosing(WindowEvent we) {
//                 System.exit(0);
//             }
//         });
//         frame.setVisible(true);
//     }
// }