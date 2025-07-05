package mino;

import java.awt.*;

public class Mino_Z1 extends Mino{
    public Mino_Z1(){ create(Color.green);}
    public void setXY(int x, int y) {
        //
        //   O O
        // O O
        b[0].x = x;
        b[0].y = y;
        b[1].x = b[0].x + Block.SIZE;//bloco de cima
        b[1].y = b[0].y;//
        b[2].x = b[0].x;             //bloco de baixo
        b[2].y = b[0].y + Block.SIZE;//
        b[3].x = b[0].x - Block.SIZE;//bloco do lado
        b[3].y = b[0].y + Block.SIZE;//
    }
    public void getDirectional1(){
        //
        //   0 0
        // 0 0
        tempB[0].x= b[0].x;              //0 --> centro
        tempB[0].y= b[0].y;
        tempB[1].x= b[0].x + Block.SIZE; //1 --> cima
        tempB[1].y= b[0].y;
        tempB[2].x= b[0].x;              //2 --> baixo
        tempB[2].y= b[0].y + Block.SIZE;
        tempB[3].x= b[0].x - Block.SIZE; //3 --> lado
        tempB[3].y= b[0].y + Block.SIZE;

        updateXY(1);
    }
    public void getDirectional2(){
        // 0
        // O O
        //   0
        tempB[0].x= b[0].x;              //0 --> centro
        tempB[0].y= b[0].y;
        tempB[1].x= b[0].x - Block.SIZE; //1 --> cima
        tempB[1].y= b[0].y - Block.SIZE;
        tempB[2].x= b[0].x - Block.SIZE; //2 --> baixo
        tempB[2].y= b[0].y;
        tempB[3].x= b[0].x;              //3 --> lado
        tempB[3].y= b[0].y + Block.SIZE;

        updateXY(2);
    }
    public void getDirectional3(){
        //
        //   0 0
        // 0 0
        tempB[0].x= b[0].x;              //0 --> centro
        tempB[0].y= b[0].y;
        tempB[1].x= b[0].x + Block.SIZE; //1 --> cima
        tempB[1].y= b[0].y;
        tempB[2].x= b[0].x;              //2 --> baixo
        tempB[2].y= b[0].y + Block.SIZE;
        tempB[3].x= b[0].x - Block.SIZE; //3 --> lado
        tempB[3].y= b[0].y + Block.SIZE;

        updateXY(3);
    }
    public void getDirectional4(){
        // 0
        // O O
        //   0
        tempB[0].x= b[0].x;              //0 --> centro
        tempB[0].y= b[0].y;
        tempB[1].x= b[0].x - Block.SIZE; //1 --> cima
        tempB[1].y= b[0].y - Block.SIZE;
        tempB[2].x= b[0].x - Block.SIZE; //2 --> baixo
        tempB[2].y= b[0].y;
        tempB[3].x= b[0].x;              //3 --> lado
        tempB[3].y= b[0].y + Block.SIZE;

        updateXY(4);
    }
}
