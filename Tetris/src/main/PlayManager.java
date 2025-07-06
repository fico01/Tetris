package main;

<<<<<<< HEAD
import mino.*;

import java.awt.*;
import java.util.Random;
=======
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import mino.*;
>>>>>>> 0d2502e (Adicionando proxima peça, e colisão)

public class PlayManager {

    final int WIDTH = 360;
    final int HEIGHT = 600;
    public static int left_x;
    public static int right_x;
    public static int top_y;
    public static int bottom_y;

    Mino currentMino;
    final int MINO_START_X;
    final int MINO_START_Y;

<<<<<<< HEAD
=======
    Mino nextMino;
    final int NEXTMINO_X;
    final int NEXTMINO_Y;
    public static ArrayList<Block> staticBlocks = new ArrayList<>();

>>>>>>> 0d2502e (Adicionando proxima peça, e colisão)
    public static int dropInterval = 60;

    public PlayManager(){
        left_x = (GamePanel.WIDTH/2)-(WIDTH/2);
        right_x = left_x + WIDTH;
        top_y = 50;
        bottom_y = top_y + HEIGHT;

        MINO_START_X = left_x+ (WIDTH/2) - Block.SIZE;
        MINO_START_Y = top_y+ Block.SIZE;

<<<<<<< HEAD
        currentMino = pickMino();
        currentMino.setXY(MINO_START_X,MINO_START_Y);
=======
        NEXTMINO_X = right_x + 185;
        NEXTMINO_Y = top_y + 500;

        currentMino = pickMino();
        currentMino.setXY(MINO_START_X,MINO_START_Y);
        nextMino = pickMino();
        nextMino.setXY(NEXTMINO_X, NEXTMINO_Y);
>>>>>>> 0d2502e (Adicionando proxima peça, e colisão)
    }
    private Mino pickMino() {

        //Pick random piece
        Mino mino = null;
        int i = new Random().nextInt(7);
        switch (i){
            case 0: mino = new Mino_L1();break;
            case 1: mino = new Mino_L2();break;
            case 2: mino = new Mino_Square();break;
            case 3: mino = new Mino_Bar();break;
            case 4: mino = new Mino_T();break;
            case 5: mino = new Mino_Z1();break;
            case 6: mino = new Mino_Z2();break;
        }
        return mino;
    }
    public void update(){
<<<<<<< HEAD
        currentMino.update();
=======
        if(currentMino.active == true){
            staticBlocks.add(currentMino.b[0]);
            staticBlocks.add(currentMino.b[1]);
            staticBlocks.add(currentMino.b[2]);
            staticBlocks.add(currentMino.b[3]);

            currentMino = nextMino;
            currentMino.setXY(MINO_START_X, MINO_START_Y);
            nextMino = pickMino();
            nextMino.setXY(NEXTMINO_X, NEXTMINO_Y);
        } else {
            currentMino.update();
        }
        
>>>>>>> 0d2502e (Adicionando proxima peça, e colisão)
    }
    public void draw(Graphics2D g2){
        // Desenha área de jogo
        g2.setColor(Color.white);
        g2.setStroke(new BasicStroke(4f));
        g2.drawRect(left_x-4,top_y-4,WIDTH+8,HEIGHT+8);

        int x = right_x + 100;
        int y = bottom_y - 200;
        g2.drawRect(x,y,200,200);
        g2.setFont(new Font("Arial", Font.PLAIN,30));
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.drawString("Next",x+60,y+60);
        

        if(currentMino != null){
            currentMino.draw(g2);
        }
<<<<<<< HEAD
=======

        nextMino.draw(g2);

        for (int i = 0; i < staticBlocks.size(); i++) {
            staticBlocks.get(i).draw(g2);
        }
>>>>>>> 0d2502e (Adicionando proxima peça, e colisão)
    }
}

