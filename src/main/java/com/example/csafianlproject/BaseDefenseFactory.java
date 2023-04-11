package com.example.csafianlproject;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.Spawns;
import com.almasb.fxgl.texture.Texture;
import com.example.csafianlproject.Data.PlayerData;

import static com.almasb.fxgl.dsl.FXGL.*;
import static com.example.csafianlproject.Misc.EntityTypes.*;

public class BaseDefenseFactory implements EntityFactory {

    @Spawns("Player")
    public Entity spawnPlayer(SpawnData data){
        PlayerData playerData = data.get("data");

        Texture texture = texture("sprite.png");

        return entityBuilder(data)
                .type(PLAYER)
                .at(100, 100)
                .viewWithBBox(texture)
                .build();

    }
}
