package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.physics.box2d.World;

import java.awt.Color;
import java.awt.Shape;

/**
 * Created by Besten on 2015-11-16.
 */
public class GameRenderer {

    Man man = new Man();
    MyWorld world = new MyWorld();

    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;


    public GameRenderer(){
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 1920, 1080);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
    }

    public void render() {
        Gdx.gl.glClearColor(255, 255, 255, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        world.render(shapeRenderer);
        man.render(shapeRenderer);
    }

    public void update(float delta) {
        man.update(delta);
        world.update(delta);
    }


}
