package SoloLearn.Thread;/*
 *Created by User on Sep, 2019 8:37 AM
 */

public class MyGame
{
    public static void main(String[] args) {

        DrawImage drawImage = new DrawImage();
        drawImage.run();

        PlayMusic playMusic = new PlayMusic();
        playMusic.run();


    }
}

class DrawImage extends Thread{
    public void run(){
        System.out.println("drawing image...");
    }
}

class PlayMusic extends Thread{
    public void run(){
        System.out.println("playing music...");
    }
}
