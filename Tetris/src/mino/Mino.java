package mino;

<<<<<<< HEAD
import main.KeyHandler;
import main.PlayManager;

import java.awt.*;

=======
import java.awt.*;
import main.KeyHandler;
import main.PlayManager;

>>>>>>> 0d2502e (Adicionando proxima peça, e colisão)
public class Mino {
    public Block b[] = new Block[4];
    public  Block tempB[] = new Block[4];
    int autoDropCont = 0;
    public int direction = 1;
<<<<<<< HEAD
=======
    boolean leftCollision, rightCollision, bottomCollision;
    public boolean active = false;
>>>>>>> 0d2502e (Adicionando proxima peça, e colisão)

    public void create(Color c){
        b[0] = new Block(c);
        b[1] = new Block(c);
        b[2] = new Block(c);
        b[3] = new Block(c);
        tempB[0] = new Block(c);
        tempB[1] = new Block(c);
        tempB[2] = new Block(c);
        tempB[3] = new Block(c);
    }
    public void setXY(int x,int y){}
    public void updateXY(int direction){
<<<<<<< HEAD

=======
        checkRotationCollision();

        if(rightCollision == false && leftCollision == false && bottomCollision == false){
>>>>>>> 0d2502e (Adicionando proxima peça, e colisão)
        this.direction = direction;
        b[0].x = tempB[0].x;
        b[0].y = tempB[0].y;
        b[1].x = tempB[1].x;
        b[1].y = tempB[1].y;
        b[2].x = tempB[2].x;
        b[2].y = tempB[2].y;
        b[3].x = tempB[3].x;
        b[3].y = tempB[3].y;
<<<<<<< HEAD
=======
        }
>>>>>>> 0d2502e (Adicionando proxima peça, e colisão)
    }
    public void getDirectional1(){}
    public void getDirectional2(){}
    public void getDirectional3(){}
    public void getDirectional4(){}
<<<<<<< HEAD
=======
    public void checkMovementCollision(){
        
        leftCollision = false;
        rightCollision = false;
        bottomCollision = false;
        // Checa a colisão do frame
        for (int i = 0; i < b.length; i++) {
            if(b[i].x == PlayManager.left_x){
                leftCollision = true;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if(b[i].x + Block.SIZE == PlayManager.right_x){
                rightCollision = true;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if(b[i].y + Block.SIZE == PlayManager.bottom_y){
                bottomCollision = true;
            }
        }

    }
    public void checkRotationCollision(){
        leftCollision = false;
        rightCollision = false;
        bottomCollision = false;
        // Checa a colisão do frame
        for (int i = 0; i < b.length; i++) {
            if(tempB[i].x < PlayManager.left_x){
                leftCollision = true;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if(tempB[i].x + Block.SIZE > PlayManager.right_x){
                rightCollision = true;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if(tempB[i].y + Block.SIZE > PlayManager.bottom_y){
                bottomCollision = true;
            }
        }
    }
>>>>>>> 0d2502e (Adicionando proxima peça, e colisão)
    public void update(){
        // Move the piece
        if(KeyHandler.upPressed){
            switch (direction){
                case 1:
                    getDirectional2();
                break;
                case 2:
                    getDirectional3();
                    break;
                case 3:
                    getDirectional4();
                    break;
                case 4:
                    getDirectional1();
                break;
            }
            KeyHandler.upPressed = false;

        }
<<<<<<< HEAD
        if(KeyHandler.downPressed){
            b[0].y += Block.SIZE;
            b[1].y += Block.SIZE;
            b[2].y += Block.SIZE;
            b[3].y += Block.SIZE;

            autoDropCont = 0;

            KeyHandler.downPressed = false;
        }
        if(KeyHandler.leftPressed){
            b[0].x -= Block.SIZE;
            b[1].x -= Block.SIZE;
            b[2].x -= Block.SIZE;
            b[3].x -= Block.SIZE;

            autoDropCont = 0;

            KeyHandler.leftPressed = false;

        }
        if(KeyHandler.rightPressed){
            b[0].x += Block.SIZE;
            b[1].x += Block.SIZE;
            b[2].x += Block.SIZE;
            b[3].x += Block.SIZE;

            autoDropCont = 0;

            KeyHandler.rightPressed = false;

        }

        autoDropCont++;
        if(autoDropCont == PlayManager.dropInterval){
            b[0].y += Block.SIZE;
            b[1].y += Block.SIZE;
            b[2].y += Block.SIZE;
            b[3].y += Block.SIZE;
            autoDropCont=0;
        }
=======

        checkMovementCollision();
        if(KeyHandler.downPressed){
            if(bottomCollision == false){
              b[0].y += Block.SIZE;
              b[1].y += Block.SIZE;
              b[2].y += Block.SIZE;
              b[3].y += Block.SIZE;
              
              autoDropCont = 0;
              
              KeyHandler.downPressed = false;  
            }
            
        }
        if(KeyHandler.leftPressed){
            if(leftCollision == false){
              b[0].x -= Block.SIZE;
              b[1].x -= Block.SIZE;
              b[2].x -= Block.SIZE;
              b[3].x -= Block.SIZE;
  
              autoDropCont = 0;
  
              KeyHandler.leftPressed = false;  
            }
            

        }
        if(KeyHandler.rightPressed){
            if(rightCollision == false){
              b[0].x += Block.SIZE;
              b[1].x += Block.SIZE;
              b[2].x += Block.SIZE;
              b[3].x += Block.SIZE;
 
              autoDropCont = 0;
 
              KeyHandler.rightPressed = false; 
            }
            

        }
        if(bottomCollision){

            active = true;
        } else {
            autoDropCont++;
                    if(autoDropCont == PlayManager.dropInterval){
                        b[0].y += Block.SIZE;
                        b[1].y += Block.SIZE;
                        b[2].y += Block.SIZE;
                        b[3].y += Block.SIZE;
                        autoDropCont=0;
        } 
        }
        
>>>>>>> 0d2502e (Adicionando proxima peça, e colisão)
    }
    public void draw(Graphics2D g2){

        int margin = 2;
        g2.setColor(b[0].c);
        g2.fillRect(b[0].x+margin,b[0].y+margin,Block.SIZE-(margin*2),Block.SIZE-(margin*2));
        g2.fillRect(b[1].x+margin,b[1].y+margin,Block.SIZE-(margin*2),Block.SIZE-(margin*2));
        g2.fillRect(b[2].x+margin,b[2].y+margin,Block.SIZE-(margin*2),Block.SIZE-(margin*2));
        g2.fillRect(b[3].x+margin,b[3].y+margin,Block.SIZE-(margin*2),Block.SIZE-(margin*2));
    }
}
