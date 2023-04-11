package com.example.csafianlproject;

import com.almasb.fxgl.entity.component.Component;
import com.almasb.fxgl.texture.Texture;

public class Player extends Component {
    private Movement move;
    private Texture texture;
    public void left() {
        move.changeDirection("left");
    }
    public void right(){
        move.changeDirection("right");
    }
    public void down(){
        move.changeDirection("down");
    }
    public void up(){
        move.changeDirection("up");
    }
    public void stop(){
        move.changeDirection("left");
    }
}
