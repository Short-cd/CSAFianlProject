package com.example.csafianlproject;

import com.almasb.fxgl.core.math.Vec2;
import com.almasb.fxgl.entity.component.Component;

public class Movement extends Component {
    public String direction;
    public void changeDirection(String newDirection){
        direction = newDirection;
    }

    public void startMovement(){
        switch (direction){
            case "up":
                getEntity().setRotation(90);
                move(0, 10);
                break;
            case "down":
                getEntity().setRotation(270);
                move(0, -10);
                break;
            case "left":
                getEntity().setRotation(180);
                move(-10, 0);
                break;
            case "right":
                getEntity().setRotation(0);
                move(10, 0);
                break;
        }
    }
    private Vec2 velocity = new Vec2();
    private void move(double xMovement, double yMovement){

    }
}
