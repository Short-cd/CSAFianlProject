package com.example.csafianlproject;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.input.UserAction;
import javafx.scene.input.KeyCode;

import static com.almasb.fxgl.dsl.FXGL.*;

public class HelloApplication extends GameApplication {

    public static void main(String[] args) {
        launch(args);
    }
    private Entity player;
    @Override
    protected void initSettings(GameSettings settings) {
        settings.setTitle("FXGL Base Defense Game");
        settings.setVersion("0.1");
        settings.setHeight(800);
        settings.setWidth(1200);
    }

    @Override
    protected void initGame(){
        player = spawn("sprite.png");
    }

//    @Override
//    protected void initInput() {
//        getInput().addAction(new UserAction("Left") {
//            @Override
////            protected void onAction(){
////                player.left();
////            }
//            @Override
////            protected void onActionEnd(){
////                player.stop();
////            }
//        }, KeyCode.D);
//        getInput().addAction(new UserAction("Right") {
//            @Override
////            protected void onAction(){
////                player.right();
////            }
//            @Override
//            protected void onActionEnd(){
////                player.stop();            }
//        }, KeyCode.A);
//        getInput().addAction(new UserAction("Up") {
//            @Override
//            protected void onAction(){
//                player.up();
//            }
//            @Override
//            protected void onActionEnd(){
//                player.stop();
//            }
//        }, KeyCode.W);
//        getInput().addAction(new UserAction("Down") {
//            @Override
//            protected void onAction(){
//                player.down();
//            }
//            @Override
//            protected void onActionEnd(){
//                player.stop();
//            }
//        }, KeyCode.S);
//    }
}