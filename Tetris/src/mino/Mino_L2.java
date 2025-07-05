package mino;

import java.awt.*;

public class Mino_L2 extends Mino {
    public Mino_L2(){
        create(Color.blue);
    }


    public void setXY(int x, int y) {
        //   O
        //   O center
        // O O
        b[0].x = x;
        b[0].y = y;
        b[1].x = b[0].x;
        b[1].y = b[0].y - Block.SIZE;
        b[2].x = b[0].x;
        b[2].y = b[0].y + Block.SIZE;
        b[3].x = b[0].x - Block.SIZE;
        b[3].y = b[0].y + Block.SIZE;
    }
    public void getDirectional1(){
        //   0
        //   0
        // 0 0
        tempB[0].x= b[0].x;
        tempB[0].y= b[0].y;
        tempB[1].x= b[0].x;
        tempB[1].y= b[0].y - Block.SIZE;
        tempB[2].x= b[0].x;
        tempB[2].y= b[0].y+Block.SIZE;
        tempB[3].x= b[0].x-Block.SIZE;
        tempB[3].y= b[0].y+Block.SIZE;

        updateXY(1);
    }
    public void getDirectional2(){
        // 0
        // O O O
        //
        tempB[0].x= b[0].x;
        tempB[0].y= b[0].y;
        tempB[1].x= b[0].x + Block.SIZE;
        tempB[1].y= b[0].y;
        tempB[2].x= b[0].x - Block.SIZE;
        tempB[2].y= b[0].y;
        tempB[3].x= b[0].x-Block.SIZE;
        tempB[3].y= b[0].y-Block.SIZE;

        updateXY(2);
    }
    public void getDirectional3(){
        // O O
        // O
        // O
        tempB[0].x= b[0].x;
        tempB[0].y= b[0].y;
        tempB[1].x= b[0].x;
        tempB[1].y= b[0].y + Block.SIZE;
        tempB[2].x= b[0].x;
        tempB[2].y= b[0].y - Block.SIZE;
        tempB[3].x= b[0].x + Block.SIZE;
        tempB[3].y= b[0].y - Block.SIZE;

        updateXY(3);
    }
    public void getDirectional4(){
        //
        // O O O
        //     0
        tempB[0].x= b[0].x;
        tempB[0].y= b[0].y;
        tempB[1].x= b[0].x - Block.SIZE;
        tempB[1].y= b[0].y;
        tempB[2].x= b[0].x + Block.SIZE;
        tempB[2].y= b[0].y;
        tempB[3].x= b[0].x+Block.SIZE;
        tempB[3].y= b[0].y+Block.SIZE;

        updateXY(4);
    }
}
